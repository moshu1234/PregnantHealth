package com.pregnant.health.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.Toast;

import com.pregnant.health.utils.IoUtils;
import com.pregnant.health.utils.L;
import com.pregnant.health.utils.TaskUtil;

import java.io.File;
import java.io.IOException;

/**
 * Created by cws on 2016/3/23.
 */
public class ChoicePicActivity extends Activity {

    public static final String EXTRA_IS_FROM_CAMRA = "from_camra";  // 是否拍照
    public static final String EXTRA_IS_NEED_ZOOM = "need_zoom"; // 是否需要剪裁
    public static final String EXTRA_PIC_PATH = "pic_path";
    public static final String EXTRA_PIC_W = "pic_w";
    public static final String EXTRA_PIC_H = "pic_h";

    public static final int FROM_CAMRA = 1001;
    public static final int FROM_CHOICE = 1002;
    public static final int FROM_ZOOM = 1003;

    private boolean needZoom;
    private boolean fromCamra;
    private int width = 400;
    private int height = 400;

    private String filePath = IoUtils.getImageCacheDir().getAbsolutePath()
            + File.separator + System.currentTimeMillis() + ".jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        if(!Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)){
            Toast.makeText(this, "您没有SD卡!", Toast.LENGTH_SHORT).show();
            finish();
            return;
        }
        fromCamra = intent.getBooleanExtra(EXTRA_IS_FROM_CAMRA, false);
        needZoom = intent.getBooleanExtra(EXTRA_IS_NEED_ZOOM, false);
        width = intent.getIntExtra(EXTRA_PIC_W, width);
        height = intent.getIntExtra(EXTRA_PIC_H, height);
        start();
    }

    private void start() {
        if(fromCamra){
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            // 下面这句指定调用相机拍照后的照片存储的路径
            intent.putExtra(MediaStore.EXTRA_OUTPUT,
                    Uri.fromFile(new File(filePath)));
            startActivityForResult(intent, FROM_CAMRA);
        }else{
            Intent intent2 = new Intent(Intent.ACTION_PICK, null);
            intent2.setDataAndType(
                    MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
            startActivityForResult(intent2, FROM_CHOICE);
        }
    }


    /**
     * 裁剪图片方法实现
     *
     * @param uri
     */
    public void startPhotoZoom(Uri uri) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        // 下面这个crop=true是设置在开启的Intent中设置显示的VIEW可裁剪
        intent.putExtra("crop", "true");
        // aspectX aspectY 是宽高的比例
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        // outputX outputY 是裁剪图片宽高
        intent.putExtra("outputX", width);
        intent.putExtra("outputY", height);
        intent.putExtra("return-data", true);
        startActivityForResult(intent, FROM_ZOOM);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case FROM_CHOICE:
                if(data!=null && data.getData()!=null){
                    if(needZoom){
                        startPhotoZoom(data.getData());
                    }else{
                        done(getPath(data.getData()));
                    }
                }else{
                    done(null);
                }
                break;
            case FROM_CAMRA:
                File temp = new File(filePath);
                if(temp.exists()){
                    if(needZoom){
                        startPhotoZoom(Uri.fromFile(temp));
                    }else{
                        done(filePath);
                    }
                }else{
                    done(null);
                }
                break;
            case FROM_ZOOM:
                if (data != null) {
                    Bundle extras = data.getExtras();
                    if (extras != null) {
                        final Bitmap photo = extras.getParcelable("data");
                        Toast.makeText(getApplicationContext(), "正在保存", Toast.LENGTH_SHORT).show();
                        new Thread(){
                            @Override
                            public void run() {
                                IoUtils.saveBitmap(photo, filePath);
                                done(filePath);
                            };
                        }.start();
                    }
                }else{
                    done(null);
                }
                break;

            default:

                break;
        }
    }

    /**
     * 根据URI获取图片的位置
     * @param uri
     * @return
     */
    public String getPath(Uri uri) {
        String[] projection = { MediaStore.MediaColumns.DATA };
        Cursor cursor = managedQuery(uri, projection, null, null, null);
        int column_index = cursor
                .getColumnIndexOrThrow(MediaStore.MediaColumns.DATA);
        cursor.moveToFirst();
        return cursor.getString(column_index);
    }

    /**
     * 处理完成
     * @param path
     */
    private void done(final String path) {

        TaskUtil.backFore(new TaskUtil.BackFore() {

            @Override
            public void onFore() {
                int code = 201;
                Intent data = new Intent();
                if (path != null && new File(filePath).exists()) {
                    code = 200;
                    data.putExtra(EXTRA_PIC_PATH, filePath);
                }
                setResult(code, data);
                finish();
            }

            @Override
            public void onBack() {
                try {
                    L.d("choicePicActivity", "压缩图片.开始..");
                    if (path == null || !new File(path).exists()) {
                        return;
                    }
                    filePath = path;
                    if (!needZoom) {
                        return;
                    }
                    Bitmap bitmap = IoUtils.decodeFile(new File(path));
                    IoUtils.compressImageAndSave(bitmap, filePath);
                    L.d("choicePicActivity", "压缩图片.结束..");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private Bitmap getRotatedBitmap(int rotate, Bitmap bitmap) {
        Matrix matrix = new Matrix();
        if (rotate == 180) {
            matrix.setRotate(rotate);
        } else {
            matrix.setRotate(rotate, (float) bitmap.getWidth() / 2, (float) bitmap.getHeight() / 2);
        }
        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        return bitmap;
    }

    public static int readPictureDegree(String path) {
        int degree  = 0;
        try {
            ExifInterface exifInterface = new ExifInterface(path);
            int orientation = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_NORMAL);
            switch (orientation) {
                case ExifInterface.ORIENTATION_ROTATE_90:
                    degree = 90;
                    break;
                case ExifInterface.ORIENTATION_ROTATE_180:
                    degree = 180;
                    break;
                case ExifInterface.ORIENTATION_ROTATE_270:
                    degree = 270;
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return degree;
    }

}
