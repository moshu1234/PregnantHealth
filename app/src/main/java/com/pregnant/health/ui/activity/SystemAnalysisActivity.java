package com.pregnant.health.ui.activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.artifex.mupdflib.MuPDFActivity;
import com.pregnant.health.Constants;
import com.pregnant.health.R;
import com.pregnant.health.api.Api;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.bean.DietarySurvey;
import com.pregnant.health.bean.GeneralSurvey;
import com.pregnant.health.bean.SurveyCollectionSimple;
import com.pregnant.health.net.CallbackListener;
import com.pregnant.health.ui.adapter.ItemAdapter2;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.SPUtils;
import com.pregnant.health.view.CustomDialog;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.InjectView;
import butterknife.OnClick;

/**
 * 新建检测
 * Created by cws on 2016/3/18.
 */
public class SystemAnalysisActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    private static final String TEST_FILE_NAME = "ww.pdf";

    @InjectView(R.id.gv)
    GridView gv;
    @InjectView(R.id.ll_bottom)
    View ll_bottom;

    ProgressBar progressbar;

    String one;
    String two;
    String three;
    String four;
    String five;
    String six;
    String seven;
    ItemAdapter2 itemAdapter2;


    private ProgressDialog dialog;
    private String urlpath = "https://nj02all01.baidupcs.com/file/f860d5bcb6b807e75f2cf5129a903ca6?bkt=p3-1400f860d5bcb6b807e75f2cf5129a903ca6efd6869500000001f0fa&fid=4046550701-250528-509683183019073&time=1471143300&sign=FDTAXGERLBH-DCb740ccc5511e5e8fedcff06b081203-Y7QHA0MwNgm2NTMLRuXwFiOhn8I%3D&to=nj2hb&fm=Yan,B,U,nc&sta_dx=0&sta_cs=0&sta_ft=pdf&sta_ct=2&fm2=Yangquan,B,U,nc&newver=1&newfm=1&secfm=1&flow_ver=3&pkey=1400f860d5bcb6b807e75f2cf5129a903ca6efd6869500000001f0fa&sl=82509903&expires=8h&rt=pr&r=676062101&mlogid=5252127691164505203&vuk=4046550701&vbdid=1000622323&fin=ww.pdf&fn=ww.pdf&slt=pm&uta=0&rtype=1&iv=0&isw=0&dp-logid=5252127691164505203&dp-callid=0.1.1&hps=1";
    private Handler handler;

    @Override
    protected int getLayoutView() {
        return R.layout.act_system_analysis;
    }

    @Override
    public int getTitleName() {
        return R.string.title_system_analysis;
    }

    @Override
    protected void initView() {
        dialog = new ProgressDialog(this);
    }

    @Override
    protected void initData() {
        itemAdapter2 = new ItemAdapter2(this);
        gv.setAdapter(itemAdapter2);
        gv.setOnItemClickListener(this);

        File fo = getFilesDirectory(getApplicationContext());
        File fi = new File(fo, TEST_FILE_NAME);

        if (!fi.exists()) {
            copyTestDocToSdCard(fi);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        itemAdapter2.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                intent(RoutineSurveyOneActivity.class);
                break;
            case 1:
                intent(RoutineSurveyTwoActivity.class);
                break;
            case 2:
                intent(RoutineSurveyThreeActivity.class);
                break;
            case 3:
                intent(RoutineSurveyFourActivity.class);
                break;
            case 4:
                intent(RoutineSurveyFiveActivity.class);
                break;
            case 5:
                intent(MealSurveyActivity.class);
                break;
            case 6:
                intent(SportSurveyActivity.class);
                break;
        }
    }

    @OnClick(R.id.btn_submit_analysis)
    public void submit_analysis() {
//        DialogHelp.getProgressBar(this).setProgress(DialogHelp.getProgressBar(this).getProgress() + 10);

        one = (String) SPUtils.get(Constants.TABLE_STATEMENTSYMPTOMRECORD, "");
        two = (String) SPUtils.get(Constants.TABLE_DISEASEHISTORYRECORD, "");
        three = (String) SPUtils.get(Constants.TABLE_PHYSIQUECHECKRECORD, "");
        four = (String) SPUtils.get(Constants.TABLE_DIETHABITINSPECTION, "");
        five = (String) SPUtils.get(Constants.TABLE_LIFEHABBITINSPECTION, "");
        six = (String) SPUtils.get(Constants.TABLE_STAPLEFOODINSPECTION, "");
        seven = (String) SPUtils.get(Constants.TABLE_SPORTCONDITIONINSPECTION, "");

        if (TextUtils.isEmpty(one)
//                || TextUtils.isEmpty(two)
//                || TextUtils.isEmpty(three)
//                || TextUtils.isEmpty(four)
//                || TextUtils.isEmpty(five)
//                || TextUtils.isEmpty(six)
//                || TextUtils.isEmpty(seven)
                ) {
            showToast(R.string.tip_register_not_full);
            return;
        }

        showProgressDialog();

        Map<String, String> params = new HashMap<String, String>();
        params.put("jsonStr", createJson());
        executeRequest(Api.UPLOAD, params, new CallbackListener() {
            @Override
            public void onSuccess(String data) {
//                ll_bottom.setVisibility(View.VISIBLE);
//                toPDFActivity();
                dismissDialog();
            }

            @Override
            public void onFailure(String message) {
                dismissDialog();
            }
        });

        toPDFActivity();

//        showProgressBar();
    }


    private void toPDFActivity() {
//        dialog.setTitle("正在分析数据...");
//        dialog.setMessage("请稍后...");
//        dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
//
//        dialog.setTitle("请稍后...");
//
//        dialog.setMessage("正在分析数据，请稍等....");
//
//        dialog.setProgress(0);
//
//        dialog.setIndeterminate(false);
//
//        dialog.setCancelable(true);
//        dialog.show();
//
//        handler = new Handler() {
//            public void handleMessage(android.os.Message msg) {
//                dialog.setProgress(0);
//                dialog.cancel();
//            }
//        };
//
//        LoadDataThread ldt = new LoadDataThread();
//        ldt.start();

        File fo = getFilesDirectory(getApplicationContext());
        File fi = new File(fo, TEST_FILE_NAME);
        Uri uri = Uri.parse(fi.getAbsolutePath());

//        Uri uri = Uri.parse("file:///android_asset/" + TEST_FILE_NAME);
        Intent intent = new Intent(this, com.artifex.mupdflib.MuPDFActivity.class);
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(uri);

        //if document protected with password
        intent.putExtra("password", "encrypted PDF password");

        //if you need highlight link boxes
        intent.putExtra("linkhighlight", true);

        //if you don't need device sleep on reading document
        intent.putExtra("idleenabled", false);

        //set true value for horizontal page scrolling, false value for vertical page scrolling
        intent.putExtra("horizontalscrolling", true);

        //document name
        intent.putExtra("docname", "PDF document name");

        startActivity(intent);
    }

    /**
     * 进度条线程
     */
    class LoadDataThread extends Thread {
        public void run() {
            try {
                showPDF(urlpath);

            } catch (Exception e) {
                e.printStackTrace();
            }
            handler.sendEmptyMessage(0);
        }
    }

    public void showPDF(String urlpath) throws Exception {
        URL u = new URL(urlpath);
        String path = createDir("ww.pdf");
        byte[] buffer = new byte[1024 * 8];
        int read;
        int ava = 0;
        long start = System.currentTimeMillis();
        BufferedInputStream bin;
        try {
            HttpURLConnection urlcon = (HttpURLConnection) u.openConnection();
            double fileLength = (double) urlcon.getContentLength();
            bin = new BufferedInputStream(u.openStream());
            BufferedOutputStream bout = new BufferedOutputStream(
                    new FileOutputStream(path));
            while ((read = bin.read(buffer)) > -1) {
                bout.write(buffer, 0, read);
                ava += read;
                int a = (int) Math.floor((ava / fileLength * 100));
                dialog.setProgress(a);
                long speed = ava / (System.currentTimeMillis() - start);
            }
            bout.flush();
            bout.close();
            Uri uri = Uri.parse(path);
            Intent intent = new Intent(this,
                    MuPDFActivity.class);
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String createDir(String filename) {
        File sdcardDir = Environment.getExternalStorageDirectory();

        String path = sdcardDir.getPath() + "/MyMobileDownlod";
        File path1 = new File(path);
        if (!path1.exists())
            path1.mkdirs();
        path = path + "/" + filename;
        return path;
    }


    private String createJson() {
        SurveyCollectionSimple scs = new SurveyCollectionSimple();

        List<GeneralSurvey> generalSurveyList = new ArrayList<GeneralSurvey>();

        GeneralSurvey generalSurvey1 = JSONUtils.string2Bean(one, GeneralSurvey.class);
        GeneralSurvey generalSurvey2 = JSONUtils.string2Bean(two, GeneralSurvey.class);
        GeneralSurvey generalSurvey3 = JSONUtils.string2Bean(three, GeneralSurvey.class);
        GeneralSurvey generalSurvey4 = JSONUtils.string2Bean(four, GeneralSurvey.class);
        GeneralSurvey generalSurvey5 = JSONUtils.string2Bean(five, GeneralSurvey.class);
        List<DietarySurvey> dietarySurveyList = JSONUtils.string2Array(six, DietarySurvey.class);
//        GeneralSurvey generalSurvey1 = JSONUtils.string2Bean(one, GeneralSurvey.class);

        generalSurveyList.add(generalSurvey1);
        generalSurveyList.add(generalSurvey2);
        generalSurveyList.add(generalSurvey3);
        generalSurveyList.add(generalSurvey4);
        generalSurveyList.add(generalSurvey5);

        scs.setGeneralSurveyList(generalSurveyList);
        scs.setDietarySurveyList(dietarySurveyList);

        return scs.toJsonStr();
    }

    private void showProgressBar() {
        CustomDialog dialog = new CustomDialog(this, R.style.Dialog);
        View layout = View.inflate(this, R.layout.dialog_progress, null);
        progressbar = (ProgressBar) layout.findViewById(R.id.progressbar);
        dialog.addContentView(layout, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        dialog.setContentView(layout);
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
    }

    @OnClick(R.id.btn_analysis_result)
    public void analysis_result() {
        intent(AnalysisResultActivity.class);
    }

    @OnClick(R.id.btn_guidelines)
    public void guidelines() {
        intent(GuideLinesActivity.class);
    }

    private void copyTestDocToSdCard(final File testImageOnSdCard) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    InputStream is = getAssets().open(TEST_FILE_NAME);
                    FileOutputStream fos = new FileOutputStream(testImageOnSdCard);
                    byte[] buffer = new byte[8192];
                    int read;
                    try {
                        while ((read = is.read(buffer)) != -1) {
                            fos.write(buffer, 0, read);
                        }
                    } finally {
                        fos.flush();
                        fos.close();
                        is.close();
                    }
                } catch (IOException e) {

                }
            }
        }).start();
    }

    public static File getFilesDirectory(Context context) {
        File appFilesDir = null;
        if (Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED)) {
            appFilesDir = getExternalFilesDir(context);
        }
        if (appFilesDir == null) {
            appFilesDir = context.getFilesDir();
        }
        return appFilesDir;
    }

    private static File getExternalFilesDir(Context context) {
        File dataDir = new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data");
        File appFilesDir = new File(new File(dataDir, context.getPackageName()), "files");
        if (!appFilesDir.exists()) {
            if (!appFilesDir.mkdirs()) {
                //L.w("Unable to create external cache directory");
                return null;
            }
            try {
                new File(appFilesDir, ".nomedia").createNewFile();
            } catch (IOException e) {
                //L.i("Can't create \".nomedia\" file in application external cache directory");
                return null;
            }
        }
        return appFilesDir;
    }

}
