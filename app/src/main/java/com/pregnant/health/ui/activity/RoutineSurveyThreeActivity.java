package com.pregnant.health.ui.activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.alibaba.fastjson.JSON;
import com.pregnant.health.Constants;
import com.pregnant.health.R;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.bean.GeneralSurvey;
import com.pregnant.health.bean.Lab;
import com.pregnant.health.db.DictCatalogDbManager;
import com.pregnant.health.model.Catalog;
import com.pregnant.health.ui.adapter.ItemAdapter1;
import com.pregnant.health.utils.CommonUtils;
import com.pregnant.health.utils.DateUtil;
import com.pregnant.health.utils.DialogHelp;
import com.pregnant.health.utils.IoUtils;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.SPUtils;
import com.pregnant.health.utils.SingleSelector;
import com.pregnant.health.utils.T;
import com.pregnant.health.utils.TaskUtil;
import com.pregnant.health.view.SettingItemView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.InjectView;
import butterknife.OnClick;

/**
 * 实验室检测
 * Created by cws on 2016/3/21.
 */
public class RoutineSurveyThreeActivity extends BaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    @InjectView(R.id.siv_blood)
    SettingItemView siv_blood;
    @InjectView(R.id.siv_tall)
    SettingItemView siv_tall;
    @InjectView(R.id.iv_preview)
    ImageView iv_preview;

    private SingleSelector tallSelector;

    @InjectView(R.id.gv)
    GridView gv;

    ItemAdapter1 itemAdapter;

    Map<String, String> map = new HashMap<String, String>();

    Catalog catalog;
    GeneralSurvey physiqueCheckRecord = new GeneralSurvey();
    List<Catalog> catalogs;

    Lab lab = new Lab();

    public static int[] names = {R.string.name_bc, R.string.name_xcg, R.string.name_ncg};

    @Override
    protected int getLayoutView() {
        return R.layout.act_routine_survey_three;
    }

    @Override
    public int getTitleName() {
        return R.string.title_routine_three;
    }

    @Override
    protected void initView() {
        siv_blood.setOnClickListener(this);
        siv_tall.setOnClickListener(this);
        iv_preview.setOnClickListener(this);

    }

    @Override
    protected void initData() {
        int REQUEST_EXTERNAL_STORAGE = 1;
        String[] PERMISSIONS_STORAGE = {
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
        };
        int permission = ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (permission != PackageManager.PERMISSION_GRANTED) {
            // We don't have permission so prompt the user
            ActivityCompat.requestPermissions(
                    this,
                    PERMISSIONS_STORAGE,
                    REQUEST_EXTERNAL_STORAGE
            );
        }

        long start = System.currentTimeMillis();
        catalog = new DictCatalogDbManager().loadByCode(Constants.CODE_PHYSIQUECHECKRECORD);
        catalogs = JSONUtils.string2Array(catalog.getChildren(), Catalog.class);

        showProgressDialog();
        TaskUtil.backFore(new TaskUtil.BackFore() {
            @Override
            public void onFore() {
                dismissDialog();
                siv_blood.setValue(map.get(catalogs.get(1).getFieldName()));
                siv_tall.setValue(map.get(catalogs.get(0).getFieldName()));

                itemAdapter = new ItemAdapter1(RoutineSurveyThreeActivity.this, map);
                gv.setAdapter(itemAdapter);

                String path1 = map.get(names[0] + "");
                if (!TextUtils.isEmpty(path1)) {
//                    bitmap = IoUtils.decodeFile(new File(path1));
                    bitmap = IoUtils.decodeFile(path1);
                    iv_preview.setImageBitmap(bitmap);
                }
            }

            @Override
            public void onBack() {
                String s = (String) SPUtils.get(Constants.TABLE_PHYSIQUECHECKRECORD, "");
                if (!TextUtils.isEmpty(s)) {
                    physiqueCheckRecord = JSONUtils.string2Bean(s, GeneralSurvey.class);
                    map = physiqueCheckRecord.getField();
                }
            }
        });

        gv.setOnItemClickListener(this);

//        itemAdapter.setSeclection(0);

//        new LoadPicThread().start();

        ArrayList<String> data = new ArrayList<String>();
        for (int i = 0; i <= 50; i++) {
            data.add(String.valueOf(i));
        }

        tallSelector = new SingleSelector(this, new SingleSelector.ResultHandler() {
            @Override
            public void handle(String selectItem) {
                siv_tall.setValue(selectItem + "cm");
            }
        }, data, "0");

//        for (int name : ItemAdapter1.names) {
//            map.put(name + "", "");
//        }

        physiqueCheckRecord.setTableName(catalog.getTableName());
        physiqueCheckRecord.setRecordTime(DateUtil.getFormatDate(System.currentTimeMillis()));
        physiqueCheckRecord.setSign("1");
        physiqueCheckRecord.setGlobalRecordNr("123456");
        physiqueCheckRecord.setInspectionOrder("1");

    }

    private Handler handler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            iv_preview.setImageBitmap(bitmap);
        }
    };

    Bitmap bitmap;
    class LoadPicThread extends Thread {
        public void run() {
            try {
                String path1 = map.get(names[0] + "");
                if (!TextUtils.isEmpty(path1)) {
//                    bitmap = IoUtils.decodeFile(new File(path1));
                    bitmap = IoUtils.decodeFile(path1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            handler.sendEmptyMessage(0);
        }
    }

    @OnClick(R.id.btn_save)
    public void save() {
        if (getString(R.string.tip_required).equals(siv_blood.getValue()) || "".equals(siv_blood.getValue())) {
            T.show("请输入血压");
            return;
        }
//        if (getString(R.string.tip_required).equals(siv_tall.getValue()) || "".equals(siv_tall.getValue())) {
//            T.show("请输入宫高");
//            return;
//        }
//
        String path1 = map.get(names[0] + "");
//        if (TextUtils.isEmpty(path1)) {
//            T.show("请上传B超图片");
//            return;
//        }
        String path2 = map.get(names[1] + "");
//        if (TextUtils.isEmpty(path2)) {
//            T.show("请上传血常规图片");
//            return;
//        }
        String path3 = map.get(names[2] + "");
//        if (TextUtils.isEmpty(path3)) {
//            T.show("请上传尿常规图片");
//            return;
//        }

        // 宫高
        map.put(catalogs.get(0).getFieldName(), siv_tall.getValue());
        // 血压
        map.put(catalogs.get(1).getFieldName(), siv_blood.getValue());
        // B超
        if (!TextUtils.isEmpty(path1)) {
            map.put(catalogs.get(3).getFieldName(), Base64.encodeToString(CommonUtils.filePathtoBytes(path1), Base64.DEFAULT));
        }
        // 血常规
        if (!TextUtils.isEmpty(path2)) {
            map.put(catalogs.get(4).getFieldName(), Base64.encodeToString(CommonUtils.filePathtoBytes(path2), Base64.DEFAULT));
        }
        // 尿常规
        if (!TextUtils.isEmpty(path3)) {
            map.put(catalogs.get(5).getFieldName(), Base64.encodeToString(CommonUtils.filePathtoBytes(path3), Base64.DEFAULT));
        }
        physiqueCheckRecord.setField(map);

        SPUtils.put(Constants.TABLE_PHYSIQUECHECKRECORD, JSON.toJSONString(physiqueCheckRecord));

        T.show(getString(R.string.tip_save_success));
        doBack();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.siv_blood:
                DialogHelp.getInputDialog2(this, "请输入血压", new DialogHelp.ResultHandler() {
                    @Override
                    public void handle(String data) {
                        siv_blood.setValue(data + " mmHg");
                    }
                });
                break;
            case R.id.siv_tall:
                tallSelector.show();
                break;
            case R.id.iv_preview:
                if (iv_img == null) {
                    T.show("请先选择要上传的类型");
                    return;
                }
                choicePhoto(false);
                break;
        }
    }

    ImageView iv_img;
    int selectResId;

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        selectResId = ItemAdapter1.names[position];

        ItemAdapter1.ViewHolder holder = (ItemAdapter1.ViewHolder) view.getTag();
        iv_img = holder.iv_img;

        itemAdapter.setSeclection(position);


        String path = map.get(selectResId+"");

        if (TextUtils.isEmpty(path)) {
            iv_preview.setImageResource(R.drawable.bg_upload);
        } else {
//            Bitmap bitmap = IoUtils.decodeFile(new File(path));
            Bitmap bitmap = IoUtils.decodeFile(path);
            iv_preview.setImageBitmap(bitmap);
            iv_img.setImageBitmap(bitmap);
        }
    }


    /**
     * 拍照或选择图片
     *
     * @param fromCamra
     */
    private void choicePhoto(boolean fromCamra) {
        Intent intent = new Intent(this, ChoicePicActivity.class);
        intent.putExtra(ChoicePicActivity.EXTRA_IS_FROM_CAMRA, fromCamra);
        intent.putExtra(ChoicePicActivity.EXTRA_IS_NEED_ZOOM, false);
        intent.putExtra(ChoicePicActivity.EXTRA_PIC_W, 150);
        intent.putExtra(ChoicePicActivity.EXTRA_PIC_H, 150);
        startActivityForResult(intent, 998);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) {
            return;
        }
        switch (requestCode) {
            case 998:
                String path = data.getStringExtra(ChoicePicActivity.EXTRA_PIC_PATH);
                if(!TextUtils.isEmpty(path)){
                    map.put(selectResId + "", path);
//                    Bitmap bitmap = IoUtils.decodeFile(new File(path));
                    Bitmap bitmap = IoUtils.decodeFile(path);
                    iv_preview.setImageBitmap(bitmap);
                    iv_img.setImageBitmap(bitmap);
                }
                break;
        }

    }
}
