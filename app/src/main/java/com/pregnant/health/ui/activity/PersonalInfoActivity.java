package com.pregnant.health.ui.activity;

import android.view.View;

import com.pregnant.health.GloableParams;
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
import java.util.List;
import java.util.Map;

import butterknife.InjectView;

/**
 * Created by cws on 2016/3/24.
 */
public class PersonalInfoActivity extends BaseActivity implements View.OnClickListener {
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
    @InjectView(R.id.siv_blood)
    SettingItemView siv_blood;
    @InjectView(R.id.siv_nation)
    SettingItemView siv_nation;
    @InjectView(R.id.siv_occupation)
    SettingItemView siv_occupation;
    @InjectView(R.id.siv_email)
    SettingItemView siv_email;
    @InjectView(R.id.siv_education)
    SettingItemView siv_education;
    @InjectView(R.id.siv_weight)
    SettingItemView siv_weight;

    private TimeSelector birthdaySelector;
    private TimeSelector lastdaySelector;
    private SingleSelector tallSelector;
    private SingleSelector otherSelector;
    private SingleSelector weightSelector;

    
    String[] nations = {"汉族", "蒙古族", "回族", "藏族", "维吾尔族", "苗族", "彝族", "壮族", "布依族", "朝鲜族", "满族", "侗族", "瑶族", "白族", "土家族", "哈尼族", "哈萨克族", "傣族", "黎族", "僳僳族", "佤族", "畲族", "高山族", "拉祜族", "水族", "东乡族", "纳西族", "景颇族", "柯尔克孜族", "土族", "达斡尔族", "仫佬族", "羌族", "布朗族", "撒拉族", "毛南族", "仡佬族", "锡伯族", "阿昌族", "普米族", "塔吉克族", "怒族", "乌孜别克族", "俄罗斯族", "鄂温克族", "德昂族", "保安族", "裕固族", "京族", "塔塔尔族", "独龙族", "鄂伦春族", "赫哲族", "门巴族", "珞巴族", "基诺族"};
    String[] bloodTypes = {"O", "A", "B", "AB"};
    String[] educations = {"硕士", "本科", "专科", "高中", "初中"};

    ArrayList<String> tallData = new ArrayList<String>();

    @Override
    protected int getLayoutView() {
        return R.layout.act_personal_info;
    }

    @Override
    public int getTitleName() {
        return R.string.title_personal_info;
    }

    @Override
    protected void initView() {
        siv_birthday.setOnClickListener(this);
        siv_tall.setOnClickListener(this);
        siv_last_day.setOnClickListener(this);
        siv_blood.setOnClickListener(this);
        siv_nation.setOnClickListener(this);
        siv_occupation.setOnClickListener(this);
        siv_email.setOnClickListener(this);
        siv_education.setOnClickListener(this);
        siv_weight.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        if (GloableParams.user != null) {
            siv_blood.setValue(GloableParams.user.getBloodType()+"型");
            siv_nation.setValue(GloableParams.user.getNationality());
            siv_occupation.setValue(GloableParams.user.getProfession());
            siv_email.setValue(GloableParams.user.getEmail());
            siv_education.setValue(GloableParams.user.getEducation());
            siv_phone.setValue(GloableParams.user.getMobilePhone());
            siv_name.setValue(GloableParams.user.getName());
            siv_birthday.setValue(DateUtil.getFormatDate(GloableParams.user.getBirthDate()));
            siv_tall.setValue(GloableParams.user.getHeight()+"cm");
            siv_last_day.setValue(DateUtil.getFormatDate(GloableParams.user.getLastMenses()));
            siv_weight.setValue(GloableParams.user.getWeightBefPregnancy() + "kg");
        }



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
        }, "2016-01-01", DateUtil.format(new Date(), TimeSelector.FORMAT_STR));


        for (int i = 140; i <= 230; i++) {
            tallData.add(String.valueOf(i));
        }

        tallSelector = new SingleSelector(this, new SingleSelector.ResultHandler() {
            @Override
            public void handle(String selectItem) {
                siv_tall.setValue(selectItem + "cm");
            }
        }, tallData, "160");

        ArrayList<String> data = new ArrayList<String>();
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
            case R.id.siv_birthday:
                birthdaySelector.show();
                break;
            case R.id.siv_tall:
                tallSelector.show();
                break;
            case R.id.siv_last_day:
                lastdaySelector.show();
                break;
            case R.id.siv_weight:
                weightSelector.show();
                break;
            case R.id.siv_blood:
                List<String> list = new ArrayList<String>();
                for (int i = 0; i < bloodTypes.length; i++) {
                    list.add(bloodTypes[i]);
                }
                initSelector(siv_blood, list);
                break;
            case R.id.siv_nation:
                List<String> list2 = new ArrayList<String>();
                for (int i = 0; i < nations.length; i++) {
                    list2.add(nations[i]);
                }
                initSelector(siv_nation, list2);
                break;
            case R.id.siv_occupation:
                DialogHelp.getInputDialog(this, "请输入职业", new DialogHelp.ResultHandler() {
                    @Override
                    public void handle(String data) {
                        siv_occupation.setValue(data);
                    }
                });
                break;
            case R.id.siv_email:
                DialogHelp.getInputDialog(this, "请输入E-Mail", new DialogHelp.ResultHandler() {
                    @Override
                    public void handle(String data) {
//                        if (CommonUtils.isEmail(data)) {
                            siv_email.setValue(data);
//                        }
                    }
                });
                break;
            case R.id.siv_education:
                List<String> list3 = new ArrayList<String>();
                for (int i = 0; i < educations.length; i++) {
                    list3.add(educations[i]);
                }
                initSelector(siv_education, list3);
                break;
        }
    }


    /**
     * 初始化选择器
     * @param siv
     * @param data
     */
    private void initSelector(final SettingItemView siv, List<String> data) {
        otherSelector = new SingleSelector(this, new SingleSelector.ResultHandler() {
            @Override
            public void handle(String selectItem) {
                siv.setValue(selectItem + "型");
            }
        }, data, data.get(0));
        otherSelector.show();
    }

    @Override
    public void doTitleRight() {
        DialogHelp.getConfirmDialog(this, "修改提示", "个人信息内容已被修改, 是否保存?", new DialogHelp.ResultHandler() {
            @Override
            public void handle(String data) {
                Map<String, String> params = new HashMap<String, String>();
                params.put("mobilePhone", siv_phone.getValue());
                params.put("name", siv_name.getValue());
                params.put("birthDate", siv_birthday.getValue());
                params.put("height", siv_tall.getValue().replace("cm", ""));
                params.put("lastMenses", siv_last_day.getValue());
                params.put("weightBefPregnancy", siv_weight.getValue().replace("kg", ""));
                params.put("bloodType", siv_blood.getValue().replace("型", ""));
                params.put("nationality", siv_nation.getValue());
                params.put("profession", siv_occupation.getValue());
                params.put("email", siv_email.getValue());
                params.put("education", siv_education.getValue());
                executeRequest(Api.EDIT, params, new CallbackListener() {
                    @Override
                    public void onSuccess(String data) {
                        SPUtils.put("user", data);
                        GloableParams.user = JSONUtils.string2Bean2(data, User.class);
                        showToast("保存成功");
                        finish();
                    }

                    @Override
                    public void onFailure(String message) {

                    }
                });
            }
        });
    }
}
