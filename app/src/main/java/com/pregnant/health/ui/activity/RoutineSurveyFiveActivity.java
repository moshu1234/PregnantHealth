package com.pregnant.health.ui.activity;

import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.alibaba.fastjson.JSON;
import com.pregnant.health.Constants;
import com.pregnant.health.R;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.bean.GeneralSurvey;
import com.pregnant.health.db.DictCatalogDbManager;
import com.pregnant.health.model.Catalog;
import com.pregnant.health.utils.DateUtil;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.SPUtils;
import com.pregnant.health.utils.T;
import com.pregnant.health.view.FlowRadioGroup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.InjectView;
import butterknife.OnClick;

/**
 * 生活习惯
 * Created by cws on 2016/3/21.
 */
public class RoutineSurveyFiveActivity extends BaseActivity {
    @InjectView(R.id.frgOne)
    FlowRadioGroup frgOne;
    @InjectView(R.id.frgTwo)
    FlowRadioGroup frgTwo;
    @InjectView(R.id.frgThree)
    FlowRadioGroup frgThree;
    @InjectView(R.id.frgFour)
    FlowRadioGroup frgFour;
    @InjectView(R.id.frgFive)
    FlowRadioGroup frgFive;


    Catalog catalog;
    GeneralSurvey lifeHabbitInspection = new GeneralSurvey();

    Catalog one;
    Catalog two;
    Catalog three;
    Catalog four;
    Catalog five;

    List<Catalog> ones;
    List<Catalog> twos;
    List<Catalog> threes;
    List<Catalog> fours;
    List<Catalog> fives;

    @Override
    protected int getLayoutView() {
        return R.layout.act_routine_survey_five;
    }

    @Override
    public int getTitleName() {
        return R.string.title_routine_five;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        frgOne.setKey(Constants.TABLE_LIFEHABBITINSPECTION);
        frgTwo.setKey(Constants.TABLE_LIFEHABBITINSPECTION);
        frgThree.setKey(Constants.TABLE_LIFEHABBITINSPECTION);
        frgFour.setKey(Constants.TABLE_LIFEHABBITINSPECTION);
        frgFive.setKey(Constants.TABLE_LIFEHABBITINSPECTION);

        ones = getData(Constants.CODE_SMOKEHABIT);
        twos = getData(Constants.CODE_COFFEEHABIT);
        threes = getData(Constants.CODE_STAYUPALLNIGHT);
        fours = getData(Constants.CODE_WINEHABIT);
        fives = getData(Constants.CODE_NOURISHMENTYESORNO);

        frgOne.setTags(ones);
        frgTwo.setTags(twos);
        frgThree.setTags(threes);
        frgFour.setTags(fours);
        frgFive.setTags(fives);

        frgOne.select(0);
        one = ones.get(0);
        frgTwo.select(0);
        two = twos.get(0);
        frgThree.select(1);
        three = threes.get(1);
        frgFour.select(0);
        four = fours.get(0);
        frgFive.select(1);
        five = fives.get(1);

        frgOne.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                one = ones.get(checkedId);
            }
        });
        frgTwo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                two = twos.get(checkedId);
            }
        });
        frgThree.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                three = threes.get(checkedId);
            }
        });
        frgFour.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                four = fours.get(checkedId);
            }
        });
        frgFive.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                five = fives.get(checkedId);
            }
        });

        lifeHabbitInspection.setTableName(catalog.getTableName());
        lifeHabbitInspection.setRecordTime(DateUtil.getFormatDate(System.currentTimeMillis()));
        lifeHabbitInspection.setSign("1");
        lifeHabbitInspection.setGlobalRecordNr("123456");
        lifeHabbitInspection.setInspectionOrder("1");
    }

    private List<Catalog> getData(String code) {
        catalog = new DictCatalogDbManager().loadByCode(code);
        return JSONUtils.string2Array(catalog.getChildren(), Catalog.class);
    }

    @OnClick(R.id.btn_save)
    public void save() {
        if (one == null) {
            one = frgOne.getSelected();
        }
        if (two == null) {
            two = frgTwo.getSelected();
        }
        if (three == null) {
            three = frgThree.getSelected();
        }
        if (four == null) {
            four = frgFour.getSelected();
        }
        if (five == null) {
            five = frgFive.getSelected();
        }

        if (one != null
                && two != null
                && three != null
                && four != null
                && five != null
                ) {
            Map<String, String> map = new HashMap<String, String>();

            map.put(one.getFieldName(), "1");
            map.put(two.getFieldName(), "1");
            map.put(three.getFieldName(), "1");
            map.put(four.getFieldName(), "1");
            map.put(five.getFieldName(), "1");

            lifeHabbitInspection.setField(map);

            String s = JSON.toJSONString(lifeHabbitInspection);
            SPUtils.put(Constants.TABLE_LIFEHABBITINSPECTION, s);

            T.show(getString(R.string.tip_save_success));
            doBack();
        } else {
            T.show(getString(R.string.tip_register_not_full));
        }
    }

    @Override
    public void doTitleRight() {
        frgOne.reset();
        frgTwo.reset();
        frgThree.reset();
        frgFour.reset();
        frgFive.reset();

        frgOne.select(0);
        one = ones.get(0);
        frgTwo.select(0);
        two = twos.get(0);
        frgThree.select(1);
        three = threes.get(1);
        frgFour.select(0);
        four = fours.get(0);
        frgFive.select(1);
        five = fives.get(1);

        SPUtils.put(Constants.TABLE_LIFEHABBITINSPECTION, "");
    }

    private String selectRadioText(FlowRadioGroup frg) {
        RadioButton radioButton = (RadioButton) findViewById(frg.getCheckedRadioButtonId());
        if (radioButton == null) {
            return null;
        }
        return radioButton.getText().toString();
    }
}
