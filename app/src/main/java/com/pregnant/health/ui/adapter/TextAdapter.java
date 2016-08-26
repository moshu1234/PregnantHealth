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
 * Created by cws on 2016/3/14.
 */
public class TextAdapter extends SimpleBaseAdapter<Catalog> {

    private int clickTemp = -1;
    private int type = -1;

    /**
     * 标识选择的Item
     * @param type
     *              区分大类/小类
     * @param position
     */
    public void setSeclection(int type, int position) {
        this.clickTemp = position;
        this.type = type;
        notifyDataSetChanged();
    }

    public void setSeclection(int position) {
        setSeclection(1, position);
    }

    public TextAdapter(Context context, List<Catalog> mDatas) {
        super(context, mDatas);
    }

    @Override
    public int getItemResource() {
        return R.layout.item_text;
    }

    @Override
    public void bindData(int position, View convertView, ViewHolder holder) {
        Catalog catalog = getDataList().get(position);
        TextView tv_name = holder.findView(R.id.tv_name);
        TextView tv_item_title = holder.findView(R.id.tv_item_title);
        ImageView iv_selected = holder.findView(R.id.iv_selected);
        View root = holder.findView(R.id.root);


        // 点击选中Item
        if (type == 0) { // 大类
            if (clickTemp == position) {
                root.setBackgroundColor(getContext().getResources().getColor(R.color.pink));
                tv_name.setTextColor(getContext().getResources().getColor(R.color.white));
            } else {
                root.setBackgroundColor(getContext().getResources().getColor(R.color.white));
                tv_name.setTextColor(getContext().getResources().getColor(R.color.black));
            }
            if (catalog != null) {
                tv_name.setText(catalog.getName());
            }

        } else {// 小类
//            if (!"-1".equals(category.getTypeId()) && position == getPositionForSection(category.getTypeId())) {
//                tv_item_title.setVisibility(View.VISIBLE);
//                tv_item_title.setText(category.getType().getName());
//            } else {
                tv_item_title.setVisibility(View.GONE);
//            }
            iv_selected.setVisibility(clickTemp == position ? View.VISIBLE : View.GONE);
            if (catalog != null) {
                tv_name.setText(catalog.getCaption());
            }

        }



    }


    /**
     * 根据分类的首字母的Char ascii值获取其第一次出现该首字母的位置
     */
//    public int getPositionForSection(String section) {
//        for (int i = 0; i < getCount(); i++) {
//            String type = getDataList().get(i).getTypeId();
//            if (type.equals(section)) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
