package com.pregnant.health.base;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.pregnant.health.R;
import com.pregnant.health.bean.BaseBean;
import com.pregnant.health.listener.TitleEventListener;
import com.pregnant.health.manager.AppManager;
import com.pregnant.health.manager.EventCenter;
import com.pregnant.health.manager.TitleManager;
import com.pregnant.health.net.CallbackListener;
import com.pregnant.health.net.RequestManager;
import com.pregnant.health.net.RequestUtils;
import com.pregnant.health.utils.T;
import com.pregnant.health.view.ProgressHUD;

import java.util.Map;
import java.util.Set;

import butterknife.ButterKnife;
import de.greenrobot.event.EventBus;
import de.greenrobot.event.Subscribe;

/**
 * Created by cws on 2016/3/12.
 */
public abstract class BaseActivity extends FragmentActivity {
    public Resources mResources;
    public Context mContext;
    public View rootView;

    TitleEventListener listener = new TitleEventListener() {
        @Override
        public void doLeft() {
            doTitleLeft();
        }

        @Override
        public void doRight() {
            doTitleRight();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppManager.getAppManager().addActivity(this);
        mContext = this;
        mResources = mContext.getResources();

        EventBus.getDefault().register(this);

        if (getLayoutView() != 0) {
            rootView = getLayoutInflater().inflate(getLayoutView(), null);
            setContentView(rootView);

            if (getTitleName() != 0) {
                TitleManager.getInstance(this).setTitleName(getString(getTitleName()));
            }

            if (getLayoutView() != R.layout.act_main) {
                initTitleView();
            }
            ButterKnife.inject(this);
        } else {
            throw new IllegalArgumentException("You must return a right contentView layout resource Id");
        }

        initView();
        initData();
    }

    @Override
    protected void onResume() {
        super.onResume();
        TitleManager.getInstance(this).setListener(listener);
    }

    private void initTitleView() {
        View titleView = TitleManager.getInstance(this).initTitleView(getLayoutView());
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (int) mResources.getDimension(R.dimen.common_title_height));
        ((ViewGroup) rootView).addView(titleView, 0, params);
    }


    /**
     * bind layout resource file
     *
     * @return id of layout resource
     */
    protected abstract int getLayoutView();

    /**
     * init title name
     */
    public abstract int getTitleName();

    /**
     * init all views and add events
     */
    protected abstract void initView();

    /**
     * init data
     */
    protected abstract void initData();

    /**
     * when event comming
     *
     * @param eventCenter
     */
    protected void onEventComming(EventCenter eventCenter) {
//        if (eventCenter.getEventCode() == Constants.EVENT_TITLE_LEFT) {
//            doLeft();
//        } else if (eventCenter.getEventCode() == Constants.EVENT_TITLE_RIGHT) {
//            doRight();
//        }
    }

    /**
     * title 右边按钮的操作
     */
    public void doTitleRight() {
    }

    /**
     * title 左边按钮的操作
     */
    public void doTitleLeft() {
        doBack();
    }

    @Subscribe
    public void onEventMainThread(EventCenter eventCenter) {
        if (null != eventCenter) {
            onEventComming(eventCenter);
        }
    }

//    @Override
//    public void finish() {
//        super.finish();
//        overridePendingTransition(R.anim.anim_none, R.anim.trans_center_2_right);
//    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.reset(this);
        RequestManager.cancelAll(this);
        AppManager.getAppManager().finishActivity(this);
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void onBackPressed() {
        doBack();
    }

    public void doBack() {
        finish();
    }


    ///////////////////////////////////////////////////////////////////////////
    // Common Operation
    ///////////////////////////////////////////////////////////////////////////

    public Context getContext() {
        return mContext;
    }



    public void showToast(String msg){
        T.showToast(msg);
    }

    public void showToast(int resId){
        T.showToast(resId);
    }

    public void replaceFragment(int id_content, Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(id_content, fragment);
        transaction.commit();
    }

    /**
     * 执行请求
     *
     * @param url      请求url
     * @param params   请求参数
     * @param listener 监听
     */
    protected void executeRequest(String url, final Map<String, String> params, final CallbackListener listener) {
        RequestUtils.executeRequest(url, params, listener);
    }

    protected void intent(Class<?> cls) {
        startActivity(new Intent(this, cls));
    }

    protected void intentForResult(Class<?> cls, Map<String, String> map, int requestCode) {
        Set<String> set = map.keySet();
        Intent intent = new Intent(this, cls);
        for (String key : set) {
            intent.putExtra(key, map.get(key));
        }
        startActivityForResult(intent, requestCode);
    }

    protected void intent(Class<?> cls, Map<String, String> map) {
        Set<String> set = map.keySet();
        Intent intent = new Intent(this, cls);
        for (String key : set) {
            intent.putExtra(key, map.get(key));
        }
        startActivity(intent);
    }

    public static final String EXTRA_KEY_BEAN = "bean";
    public static final String EXTRA_KEY_TYPE = "type";

    protected void intent(Class<?> cls, BaseBean bb) {
        Intent intent = new Intent(this, cls);
        intent.putExtra(EXTRA_KEY_BEAN, bb);
        startActivity(intent);
    }

    protected void intent(Class<?> cls, int type) {
        Intent intent = new Intent(this, cls);
        intent.putExtra(EXTRA_KEY_TYPE, type);
        startActivity(intent);
    }

    protected void intentForResult(Class<?> cls, int requestCode) {
        Intent intent = new Intent(this, cls);
        startActivityForResult(intent, requestCode);
    }

    protected void intentForResult(Class<?> cls, BaseBean bb, int requestCode) {
        Intent intent = new Intent(this, cls);
        intent.putExtra(EXTRA_KEY_BEAN, bb);
        startActivityForResult(intent, requestCode);
    }


    ProgressHUD pDialog;

    /**
     * 显示正在加载的进度条
     *
     */
    public void showProgressDialog() {
        showProgressDialog("加载中...");
    }

    public void showProgressDialog(String msg) {

        if (pDialog != null && pDialog.isShowing()) {
            pDialog.dismiss();
            pDialog = null;
        }

        pDialog = new ProgressHUD(this, R.style.ProgressHUD);
        pDialog.setTitle("");
        pDialog.setContentView(R.layout.progress_hud);
        if (msg == null || msg.length() == 0) {
            pDialog.findViewById(R.id.message).setVisibility(View.GONE);
        } else {
            TextView txt = (TextView) pDialog.findViewById(R.id.message);
            txt.setText(msg);
        }
        pDialog.setCancelable(true);
        pDialog.setCanceledOnTouchOutside(false);
        pDialog.getWindow().getAttributes().gravity = Gravity.CENTER;
        WindowManager.LayoutParams lp = pDialog.getWindow().getAttributes();
        lp.dimAmount = 0.2f;
        pDialog.getWindow().setAttributes(lp);
        pDialog.show();
    }

    /**
     * 取消对话框显示
     */
    public void dismissDialog() {
        try {
            if (pDialog != null && pDialog.isShowing()) {
                pDialog.dismiss();
                pDialog = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
