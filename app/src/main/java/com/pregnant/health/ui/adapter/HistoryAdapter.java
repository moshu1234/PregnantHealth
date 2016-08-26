package com.pregnant.health.ui.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.RadioGroup;

import com.pregnant.health.Constants;
import com.pregnant.health.R;
import com.pregnant.health.base.SimpleBaseAdapter;
import com.pregnant.health.bean.GeneralSurvey;
import com.pregnant.health.model.Catalog;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.SPUtils;
import com.pregnant.health.view.MyRadioGroup;

import java.util.List;
import java.util.Map;

/**
 * Created by cws on 2016/3/28.
 */
public class HistoryAdapter extends SimpleBaseAdapter<Catalog> {

    boolean isReset = false;
    Map<String, String> field;

    public HistoryAdapter(Context context, List<Catalog> mDatas) {
        super(context, mDatas);
        String s = (String) SPUtils.get(Constants.TABLE_DISEASEHISTORYRECORD, "");
        if (!TextUtils.isEmpty(s)) {
            GeneralSurvey survey = JSONUtils.string2Bean(s, GeneralSurvey.class);
            field = survey.getField();
            if (field != null) {
                for (int i = 0; i < getDataList().size(); i++) {
                    getDataList().get(i).setDefaultValue(field.get(getDataList().get(i).getFieldName()));
                }
            }
        }
    }

    @Override
    public int getItemResource() {
        return R.layout.item_history;
    }

    @Override
    public void bindData(final int position, View convertView, ViewHolder holder) {
        final Catalog catalog = getDataList().get(position);
        final MyRadioGroup rg = holder.findView(R.id.rg);
        rg.setText(catalog.getCaption());

        if (isReset) {
            rg.reset();
            rg.select(1);
        }

        if (!isReset && field != null) {
            String s = field.get(catalog.getFieldName());
            if (TextUtils.isEmpty(s)) {
                rg.select(1);
            } else {
                rg.select(Integer.parseInt(s));
            }
        }

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                catalog.setDefaultValue(checkedId + "");
            }
        });
    }


    /**
     * 重置
     */
    public void reset() {
        isReset = true;
        for (int i = 0; i < getDataList().size(); i++) {
            getDataList().get(i).setDefaultValue("1");
        }
        SPUtils.put(Constants.TABLE_DISEASEHISTORYRECORD, "");
        notifyDataSetChanged();
    }

}
