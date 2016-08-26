package com.pregnant.health.utils;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.text.TextUtils;

import com.pregnant.health.base.BaseApplication;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 处理本地文件存储工具
 * Created by cws on 2016/3/23.
 */
public class IoUtils {

    private static String baseDir = "pregnant";        //SD卡上的根目录
    private static String imageCacheDir = ".images";//图片缓存子目录
    private static String audioCacheDir = ".audios";//音频缓存子目录


    /**
     * 得到缓存根目录
     *
     * @return
     */
    public static File getBaseCacheDir() {
        return getDirByCacheType(baseDir);
    }

    /**
     * 得到图片的缓存目录
     *
     * @return
     */
    @SuppressLint("NewApi")
    public static File getImageCacheDir() {
        return getDirByCacheType(imageCacheDir);
    }

    /**
     * 获取音频的缓存目录
     *
     * @return
     */
    public static File getAudioCacheDir() {
        return getDirByCacheType(audioCacheDir);
    }

    /**
     * 根据缓存类型获取目录
     *
     * @return
     */
    private static File getDirByCacheType(String type) {
        File imageDir = null;
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            File dir = Environment.getExternalStorageDirectory();
            String path = dir.getAbsolutePath() + File.separator
                    + baseDir + File.separator + type;
            if (baseDir.equals(type)) {
                path = dir.getAbsolutePath() + File.separator
                        + baseDir;
            }
            imageDir = new File(path);
            if (!imageDir.exists()) {
                imageDir.mkdirs();
            }
        } else {
            imageDir = BaseApplication.getContext().getCacheDir();
        }
        return imageDir;
    }


    /**
     * 将bitmap保存到指定路径
     *
     * @param map
     * @param path
     * @return
     */
    public static void saveBitmap(Bitmap map, String path) {

        FileOutputStream out = null;
        try {

            File file = new File(path);
            if (file.exists()) {
                file.delete();
            }
            Bitmap.CompressFormat format = getFormat(path);
            if (null != format) {
                out = new FileOutputStream(file);
                if (map.compress(format, 100, out)) {
                    out.flush();
                    out.close();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (map != null && !map.isRecycled()) {
            map.recycle();
            map = null;
        }
    }

    private static Bitmap.CompressFormat getFormat(String path) {

        String type = getType(path);
        Bitmap.CompressFormat format = null;
        if (!TextUtils.isEmpty(type)) {
            if (type.equalsIgnoreCase("png")) {
                format = Bitmap.CompressFormat.PNG;
            } else if (type.equalsIgnoreCase("jpg")
                    || type.equalsIgnoreCase("jpe")
                    || type.equalsIgnoreCase("jpeg")) {
                format = Bitmap.CompressFormat.JPEG;
            }
        }

        return format;
    }

    private static String getType(String path) {

        String type;
        type = "";
        try {
            int pos = path.lastIndexOf(".");
            if (pos != -1) {
                type = path.substring(pos + 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return type;
    }

    // decodefile 并进行内存溢出的判断
    public static Bitmap decodeFile(File f) {
        try {
            // decode image size
            BitmapFactory.Options opts = new BitmapFactory.Options();
            opts.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(new FileInputStream(f), null, opts);

            // Find the correct scale value. It should be the power of 2.
//            final int REQUIRED_SIZE = 100;
//            int width_tmp = o.outWidth, height_tmp = o.outHeight;
//            int scale = 1;
//            while (true) {
//                if (width_tmp / 2 < REQUIRED_SIZE
//                        || height_tmp / 2 < REQUIRED_SIZE)
//                    break;
//                width_tmp /= 2;
//                height_tmp /= 2;
//                scale *= 2;
//            }

            // decode with inSampleSize
            // 得到图片的宽和高
            int imageWidth = opts.outWidth;
            int imageHeight = opts.outHeight;

            // 获取屏幕的宽和高
//        Display display = this.getWindowManager().getDefaultDisplay(); // 获取默认窗体显示的对象
            int screenWidth = ScreenUtil.getInstance(BaseApplication.getContext()).getScreenWidth();
            int screenHeight = ScreenUtil.getInstance(BaseApplication.getContext()).getScreenHeight();

            // 计算缩放比例
            int widthScale = imageWidth / screenWidth;
            int heightScale = imageHeight / screenHeight;

            int scale = widthScale > heightScale ? widthScale : heightScale;
            // 指定加载可以加载出图片.
            opts.inJustDecodeBounds = false;
            // 使用计算出来的比例进行缩放
            opts.inSampleSize = scale;

            return BitmapFactory.decodeStream(new FileInputStream(f), null, opts);
        } catch (Exception e) {
            e.printStackTrace();
            L.e("IoUtils", "获取文件出错.");
        }
        return null;
    }

    public static Bitmap decodeFile(String filePath) {
        BitmapFactory.Options opts = new BitmapFactory.Options();
        opts.inJustDecodeBounds = true; //设置为true, 加载器不会返回图片, 而是设置Options对象中以out开头的字段.即仅仅解码边缘区域
        BitmapFactory.decodeFile(filePath, opts);

        // 得到图片的宽和高
        int imageWidth = opts.outWidth;
        int imageHeight = opts.outHeight;

        // 获取屏幕的宽和高
//        Display display = this.getWindowManager().getDefaultDisplay(); // 获取默认窗体显示的对象
        int screenWidth = ScreenUtil.getInstance(BaseApplication.getContext()).getScreenWidth();
        int screenHeight = ScreenUtil.getInstance(BaseApplication.getContext()).getScreenHeight();

        // 计算缩放比例
        int widthScale = imageWidth / screenWidth;
        int heightScale = imageHeight / screenHeight;

        int scale = widthScale > heightScale ? widthScale : heightScale;
        // 指定加载可以加载出图片.
        opts.inJustDecodeBounds = false;
        // 使用计算出来的比例进行缩放
        opts.inSampleSize = scale;
        Bitmap bm = BitmapFactory.decodeFile(filePath, opts);
        return bm;
    }

    /**
     * 将图片压缩到500k以下
     *
     * @param image
     */
    public static Bitmap compressImageFifty(Bitmap image) {
        return null;
    }

    public static void compressImageAndSave(Bitmap image, String path) {

        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.JPEG, 100, baos);//质量压缩方法，这里100表示不压缩，把压缩后的数据存放到baos中
        int options = 100;
        while (baos.toByteArray().length / 1024 > 10) {    //循环判断如果压缩后图片是否大于100kb,大于继续压缩
            baos.reset();//重置baos即清空baos
            options -= 10;//每次都减少10
            if (options == 0) {
                break;
            }
            image.compress(Bitmap.CompressFormat.JPEG, options, baos);//这里压缩options%，把压缩后的数据存放到baos中
        }
//		ByteArrayInputStream isBm = new ByteArrayInputStream(baos.toByteArray());//把压缩后的数据baos存放到ByteArrayInputStream中
//		Bitmap bitmap = BitmapFactory.decodeStream(isBm, null, null);//把ByteArrayInputStream数据生成图片
        try {
            FileOutputStream out = new FileOutputStream(file);
            baos.writeTo(out);
            out.flush();
            out.close();
//			if (bitmap.compress(Bitmap.CompressFormat.JPEG, options+10, out)) {
//				out.flush();
//				out.close();
//			}
//			if (bitmap != null && !bitmap.isRecycled()) {
//				bitmap.recycle();
//				bitmap = null;
//			}
        } catch (Exception e) {
            e.printStackTrace();
        }
        //return bitmap;
    }

    public static byte[] getFileBytes(File file) throws Exception {
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);

        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] data = new byte[4096];
        int count = -1;
        while ((count = bis.read(data, 0, 4096)) != -1) {
            outStream.write(data, 0, count);
        }

        data = null;
        if (fis != null) fis.close();

        return outStream.toByteArray();
    }

    /**
     * 根据文件地址获取本地存储文件名
     *
     * @param url
     * @return
     */
    public static String getFileNameByUrl(String url) {
        if (url == null) {
            return null;
        }
        String name = null;
        try {
            name = url.substring(url.lastIndexOf("/"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return name;
    }

}
