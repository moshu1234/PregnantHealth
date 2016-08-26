package com.pregnant.health.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.pregnant.health.R;
import com.pregnant.health.base.SimpleBaseAdapter;
import com.pregnant.health.model.Catalog;
import com.pregnant.health.utils.SPUtils;

import java.util.List;

/**
 * 睡眠时间
 * Created by cws on 2016/3/24.
 */
public class SleepAdapter extends SimpleBaseAdapter<Catalog> {
    String key;

    public SleepAdapter(Context context, List<Catalog> mDatas) {
        super(context, mDatas);
    }

    @Override
    public int getItemResource() {
        return R.layout.item_sleep_time;
    }

    @Override
    public void bindData(int position, View convertView, ViewHolder holder) {
        final Catalog Catalog = getDataList().get(position);

        TextView tv_name = holder.findView(R.id.tv_name);
        TextView tv_date = holder.findView(R.id.tv_date);
        TextView tv_delete = holder.findView(R.id.tv_delete);

        tv_name.setText(Catalog.getCaption());
        tv_date.setText(Catalog.getAddTime());
        tv_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDataList().remove(Catalog);
                SPUtils.put(key, JSON.toJSONString(getDataList()));
                notifyDataSetChanged();
            }
        });
    }

    public void setKey(String key) {
        this.key = key;
    }
}
