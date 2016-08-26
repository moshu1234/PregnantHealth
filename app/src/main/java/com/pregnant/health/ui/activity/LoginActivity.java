package com.pregnant.health.ui.activity;

import android.text.TextUtils;
import android.widget.EditText;

import com.pregnant.health.GloableParams;
import com.pregnant.health.MainActivity;
import com.pregnant.health.R;
import com.pregnant.health.api.Api;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.bean.User;
import com.pregnant.health.net.CallbackListener;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.SPUtils;

import java.util.HashMap;
import java.util.Map;

import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by cws on 2016/3/18.
 */
public class LoginActivity extends BaseActivity {
    @InjectView(R.id.et_phone)
    EditText et_phone;


    @Override
    protected int getLayoutView() {
        return R.layout.act_login;
    }

    @Override
    public int getTitleName() {
        return R.string.title_login;
    }
    @Override
    protected void initView() {
    }

    @Override
    protected void initData() {

    }

    @OnClick(R.id.btn_login)
    public void toLogin() {
        String phone = et_phone.getText().toString();
        if (TextUtils.isEmpty(phone)) {
            showToast("请输入注册手机号");
            return;
        }

        showProgressDialog();
        Map<String, String> params = new HashMap<String, String>();
        params.put("mobilePhone", phone);
        executeRequest(Api.LOGIN, params, new CallbackListener() {
            @Override
            public void onSuccess(String data) {
                dismissDialog();
                SPUtils.put("user", data);
                GloableParams.user = JSONUtils.string2Bean2(data, User.class);
                intent(MainActivity.class);
            }

            @Override
            public void onFailure(String message) {
                dismissDialog();
            }
        });

    }

    @OnClick(R.id.btn_register)
    public void toRegister() {
        intent(RegisterActivity.class);
    }
}
