package com.pregnant.health.base;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pregnant.health.net.CallbackListener;
import com.pregnant.health.net.RequestManager;
import com.pregnant.health.net.RequestUtils;
import com.pregnant.health.utils.NetUtils;
import com.pregnant.health.utils.T;

import java.util.Map;
import java.util.Set;

import butterknife.ButterKnife;
import de.greenrobot.event.EventBus;

/**
 * Created by cws on 2016/3/14.
 */
public abstract class BaseFragment extends Fragment {
    protected String TAG;
    protected View rootView;

    private boolean isFirstResume = true;
    private boolean isFirstVisible = true;
    private boolean isFirstInvisible = true;
    private boolean isPrepared;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TAG = this.getClass().getSimpleName();
        if (getLayoutView() != 0) {
            rootView = inflater.inflate(getLayoutView(), null);
            return rootView;
        } else {
            return super.onCreateView(inflater, container, savedInstanceState);
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.inject(this, view);
        initView();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            if (isFirstVisible) {
                isFirstVisible = false;
                initPrepare();
            } else {
                onUserVisible();
            }
        } else {
            if (isFirstInvisible) {
                isFirstInvisible = false;
                onFirstUserInvisible();
            } else {
                onUserInvisible();
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (isFirstResume) {
            isFirstResume = false;
            return;
        }
        if (getUserVisibleHint()) {
            onUserVisible();
        }

        if (isStickyAvailable()) {
//            EventBus.getDefault().registerSticky(this);
        } else {
            EventBus.getDefault().register(this);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (getUserVisibleHint()) {
            onUserInvisible();
        }
        EventBus.getDefault().unregister(this);
    }


    @Override
    public void onStop() {
        super.onStop();
        dismissDialog();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        RequestManager.cancelAll(this);
    }

    private synchronized void initPrepare() {
        if (!isPrepared) {
            onFirstUserVisible();
            isPrepared = true;
        }
    }
    protected void onFirstUserVisible(){
        if (NetUtils.isNetworkConnected(getActivity())) {
            initData();
        } else {
            showToast("网络异常");
        }
    }
    /**
     * bind layout resource file
     *
     * @return id of layout resource
     */
    protected abstract int getLayoutView();
    /**
     * init all views and add events
     */
    protected abstract void initView();

    /**
     * init data
     */
    protected abstract void initData();
    /**
     * onResume()
     * this method like the fragment's lifecycle method onResume()
     */
    protected void onUserVisible(){
    };

    /**
     * onPause()
     * this method like the fragment's lifecycle method onPause()
     */
    protected void onUserInvisible(){
    }
    /**
     * when fragment is invisible for the first time
     */
    private void onFirstUserInvisible() {
        // here we do not recommend do something
    }
    /**
     * Handler for {@link }
     *
     * @param e Event {@link  }.
     */
    public void onEvent(Object e) {

    }

    /**
     * Is the {@link android.app.Fragment} ready to subscribe a sticky-event or not.
     *
     * @return {@code true} if the {@link android.app.Fragment}  available for sticky-events inc. normal events.
     * <p/>
     * <b>Default is {@code false}</b>.
     */
    protected boolean isStickyAvailable() {
        return false;
    }


    /****************   common method  *******************/

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

    public void intent(Class<?> cls) {
        startActivity(new Intent(getActivity(), cls));
    }

    protected void intent(Class<?> cls, Map<String, String> map) {
        Set<String> set = map.keySet();
        Intent intent = new Intent(getActivity(), cls);
        for (String key : set) {
            intent.putExtra(key, map.get(key));
        }
        startActivity(intent);
    }

    protected AlertDialog dialog;

    protected AlertDialog createHintDialog(String title, String message) {
        dialog = new AlertDialog.Builder(getActivity()).setTitle(title).setMessage(message).show();
        return dialog;
    }

    protected void dismissDialog() {
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    protected void showToast(String message) {
        T.show(message);
    }

    protected void addBackFragment(int containerViewId, Fragment fragment) {
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(containerViewId, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


    protected void addFragment(int containerViewId, Fragment fragment) {
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(containerViewId, fragment);
        fragmentTransaction.commit();
    }
}
