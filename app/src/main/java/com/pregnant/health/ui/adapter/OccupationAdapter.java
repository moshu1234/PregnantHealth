package com.pregnant.health.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pregnant.health.R;
import com.pregnant.health.base.SimpleBaseAdapter;
import com.pregnant.health.model.Catalog;

import java.util.List;

/**
 * 职业
 * Created by cws on 2016/3/14.
 */
public class OccupationAdapter extends SimpleBaseAdapter<Catalog> {

    private int clickTemp = -1;

    //标识选择的Item
    public void setSeclection(int position) {
        clickTemp = position;
        notifyDataSetChanged();
    }

    public OccupationAdapter(Context context, List<Catalog> mDatas) {
        super(context, mDatas);
    }

    @Override
    public int getItemResource() {
        return R.layout.item_text;
    }

    @Override
    public void bindData(int position, View convertView, ViewHolder holder) {
        TextView tv_name = holder.findView(R.id.tv_name);
        ImageView iv_selected = holder.findView(R.id.iv_selected);
        tv_name.setText(mDatas.get(position).getCaption());

        // 点击选中Item
        iv_selected.setVisibility(clickTemp == position ? View.VISIBLE : View.GONE);

    }

}
