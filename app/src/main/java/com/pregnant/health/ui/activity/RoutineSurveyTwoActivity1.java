package com.pregnant.health.ui.activity;

import com.pregnant.health.R;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.utils.T;
import com.pregnant.health.view.MyRadioGroup;

import butterknife.InjectView;
import butterknife.OnClick;

/**
 *
 * Created by cws on 2016/3/21.
 */
public class RoutineSurveyTwoActivity1 extends BaseActivity {
    @InjectView(R.id.rgOne)
    MyRadioGroup rgOne;
    @InjectView(R.id.rgTwo)
    MyRadioGroup rgTwo;

    @Override
    protected int getLayoutView() {
        return R.layout.act_routine_survey_two1;
    }

    @Override
    public int getTitleName() {
        return R.string.title_routine_two;
    }

    @Override
    protected void initView() {
//        rgOne.setOnMyCheckedChangeListener(new MyRadioGroup.OnMyCheckedChangeListener() {
//            @Override
//            public void onMyCheckedChanged(RadioGroup group, int checkedId) {
//                T.show("isChecked : " + isChecked(checkedId));
//            }
//        });
//        rgTwo.setOnMyCheckedChangeListener(new MyRadioGroup.OnMyCheckedChangeListener() {
//            @Override
//            public void onMyCheckedChanged(RadioGroup group, int checkedId) {
//                T.show("isChecked : " + isChecked(checkedId));
//            }
//        });
    }

    /**
     * 选中 有 or 无
     * @param checkedId
     * @return
     */
    private boolean isChecked(int checkedId) {
        return checkedId % 2 == 0 ? false : true;
    }

    @Override
    protected void initData() {

    }

    @OnClick(R.id.btn_save)
    public void save(){
//        if (rgOne.isClicked() && rgTwo.isClicked()) {
//            T.show("提交");
//        } else {
//            T.show("信息填写不完整");
//        }
    }

    @Override
    public void doTitleRight() {
        T.show("重置");
        rgOne.reset();
        rgTwo.reset();
    }
}
