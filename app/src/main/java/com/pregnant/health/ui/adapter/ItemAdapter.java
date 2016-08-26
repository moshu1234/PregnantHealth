package com.pregnant.health.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.pregnant.health.R;

/**
 * Created by cws on 2016/3/21.
 */
public class ItemAdapter extends BaseAdapter {

    private Context context;
    private int[] resIds;
    private int[] names;

    private int clickTemp = -1;

    //标识选择的Item
    public void setSeclection(int position) {
        clickTemp = position;
        notifyDataSetChanged();
    }

    public ItemAdapter(Context context, int[] resIds, int[] names) {
        this.context = context;
        this.resIds = resIds;
        this.names = names;
    }

    @Override
    public int getCount() {
        return resIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = View.inflate(context, R.layout.view_imagebtn_with_text, null);
            holder.iv_img = (ImageView) convertView.findViewById(R.id.iv_img);
            holder.tv_txt = (TextView) convertView.findViewById(R.id.tv_txt);
            holder.view_tag = convertView.findViewById(R.id.view_tag);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        // 点击改变选中Item的背景色
        holder.view_tag.setVisibility(clickTemp == position ? View.VISIBLE : View.GONE);

        holder.iv_img.setImageResource(resIds[position]);
        holder.tv_txt.setText(context.getString(names[position]));
        return convertView;
    }



    public class ViewHolder {
        public ImageView iv_img;
        public TextView tv_txt;
        public View view_tag;
    }
}
