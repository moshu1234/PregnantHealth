package com.pregnant.health.ui.activity;

import android.view.View;

import com.pregnant.health.GloableParams;
import com.pregnant.health.MainActivity;
import com.pregnant.health.R;
import com.pregnant.health.api.Api;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.bean.User;
import com.pregnant.health.net.CallbackListener;
import com.pregnant.health.utils.DateUtil;
import com.pregnant.health.utils.DialogHelp;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.SPUtils;
import com.pregnant.health.utils.SingleSelector;
import com.pregnant.health.utils.TimeSelector;
import com.pregnant.health.view.SettingItemView;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by cws on 2016/3/18.
 */
public class RegisterActivity extends BaseActivity implements View.OnClickListener {
    @InjectView(R.id.siv_phone)
    SettingItemView siv_phone;
    @InjectView(R.id.siv_name)
    SettingItemView siv_name;
    @InjectView(R.id.siv_birthday)
    SettingItemView siv_birthday;
    @InjectView(R.id.siv_tall)
    SettingItemView siv_tall;
    @InjectView(R.id.siv_last_day)
    SettingItemView siv_last_day;
    @InjectView(R.id.siv_weight)
    SettingItemView siv_weight;


    private TimeSelector birthdaySelector;
    private TimeSelector lastdaySelector;
    private SingleSelector tallSelector;
    private SingleSelector weightSelector;

    @Override
    protected int getLayoutView() {
        return R.layout.act_register;
    }

    @Override
    public int getTitleName() {
        return R.string.title_register;
    }

    @Override
    protected void initView() {
        siv_phone.setOnClickListener(this);
        siv_name.setOnClickListener(this);
        siv_birthday.setOnClickListener(this);
        siv_tall.setOnClickListener(this);
        siv_last_day.setOnClickListener(this);
        siv_weight.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        birthdaySelector = new TimeSelector(this, new TimeSelector.ResultHandler() {
            @Override
            public void handle(String time) {
                siv_birthday.setValue(time);
            }
        }, "1970-01-01", DateUtil.format(new Date(), TimeSelector.FORMAT_STR));

        lastdaySelector = new TimeSelector(this, new TimeSelector.ResultHandler() {
            @Override
            public void handle(String time) {
                siv_last_day.setValue(time);
            }
        }, "2015-01-01", DateUtil.format(new Date(), TimeSelector.FORMAT_STR));

        ArrayList<String> data = new ArrayList<String>();
        for (int i = 140; i <= 220; i++) {
            data.add(String.valueOf(i));
        }

        tallSelector = new SingleSelector(this, new SingleSelector.ResultHandler() {
            @Override
            public void handle(String selectItem) {
                siv_tall.setValue(selectItem + "cm");
            }
        }, data, "160");

        for (int i = 30; i <= 200; i++) {
            data.add(String.valueOf(i));
        }
        weightSelector = new SingleSelector(this, new SingleSelector.ResultHandler() {
            @Override
            public void handle(String selectItem) {
                siv_weight.setValue(selectItem + "kg");
            }
        }, data, "50");
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.siv_phone:
                DialogHelp.getInputDialog(this, "请输入手机号码", new DialogHelp.ResultHandler() {
                    @Override
                    public void handle(String data) {
                        siv_phone.setValue(data);
                    }
                });
                break;
            case R.id.siv_name:
                DialogHelp.getInputDialog(this, "请输入姓名", new DialogHelp.ResultHandler() {
                    @Override
                    public void handle(String data) {
                        siv_name.setValue(data);
                    }
                });
                break;
            case R.id.siv_birthday:
                birthdaySelector.show();
                break;
            case R.id.siv_tall:
                tallSelector.show();
                break;
            case R.id.siv_weight:
                weightSelector.show();
                break;
            case R.id.siv_last_day:
                lastdaySelector.show();
                break;
        }
    }

    @OnClick(R.id.btn_register)
    public void regist() {
        String initText = getString(R.string.tip_required);
        if (initText.equals(siv_phone.getValue())
                || initText.equals(siv_name.getValue())
                || initText.equals(siv_birthday.getValue())
                || initText.equals(siv_tall.getValue())
                || initText.equals(siv_last_day.getValue())
                || initText.equals(siv_weight.getValue())

                ) {
            showToast(R.string.tip_register_not_full);
            return;
        }

        showProgressDialog();
        Map<String, String> params = new HashMap<String, String>();
        params.put("mobilePhone", siv_phone.getValue());
        params.put("name", siv_name.getValue());
        params.put("birthDate", siv_birthday.getValue());
        params.put("height", siv_tall.getValue().replace("cm", ""));
        params.put("lastMenses", siv_last_day.getValue());
        params.put("weightBefPregnancy", siv_weight.getValue().replace("kg", ""));
        executeRequest(Api.REGISTER, params, new CallbackListener() {
            @Override
            public void onSuccess(String data) {
                dismissDialog();
                SPUtils.put("user", data);
                GloableParams.user = JSONUtils.string2Bean2(data, User.class);
                intent(MainActivity.class);
                finish();
            }

            @Override
            public void onFailure(String message) {
                dismissDialog();
            }
        });
    }


}
