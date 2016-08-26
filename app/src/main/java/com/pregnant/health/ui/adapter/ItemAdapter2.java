package com.pregnant.health.ui.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.pregnant.health.Constants;
import com.pregnant.health.R;
import com.pregnant.health.utils.SPUtils;

/**
 * Created by cws on 2016/3/21.
 */
public class ItemAdapter2 extends BaseAdapter {
    private int[] resIdSelected = {R.drawable.analysis_one_selected_normal, R.drawable.analysis_two_selected_normal, R.drawable.analysis_three_selected_normal, R.drawable.analysis_four_selected_normal, R.drawable.analysis_five_selected_normal, R.drawable.analysis_six_selected_normal, R.drawable.analysis_seven_selected_normal};
    private int[] resIdUnSelected = {R.drawable.analysis_one_unselect_normal, R.drawable.analysis_two_unselect_normal, R.drawable.analysis_three_unselect_normal, R.drawable.analysis_four_unselect_normal, R.drawable.analysis_five_unselect_normal, R.drawable.analysis_six_unselect_normal, R.drawable.analysis_seven_unselect_normal};
    private int[] nameIds = {R.string.title_routine_one, R.string.title_routine_two, R.string.title_routine_three, R.string.title_routine_four, R.string.title_routine_five, R.string.title_meal_survey, R.string.title_sport_survey};
    private Context context;

    private int clickTemp = -1;

    //标识选择的Item
    public void setSeclection(int position) {
        clickTemp = position;
        notifyDataSetChanged();
    }

    public ItemAdapter2(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return nameIds.length;
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

        String table = null;
        switch (position) {
            case 0:
                table = Constants.TABLE_STATEMENTSYMPTOMRECORD;
                break;
            case 1:
                table = Constants.TABLE_DISEASEHISTORYRECORD;
                break;
            case 2:
                table = Constants.TABLE_PHYSIQUECHECKRECORD;
                break;
            case 3:
                table = Constants.TABLE_DIETHABITINSPECTION;
                break;
            case 4:
                table = Constants.TABLE_LIFEHABBITINSPECTION;
                break;
            case 5:
                table = Constants.TABLE_STAPLEFOODINSPECTION;
                break;
            case 6:
                table = Constants.TABLE_SPORTCONDITIONINSPECTION;
                break;
        }
        String s = (String) SPUtils.get(table, "");
        holder.iv_img.setImageResource(TextUtils.isEmpty(s) ? resIdUnSelected[position] : resIdSelected[position]);

        holder.tv_txt.setText(context.getString(nameIds[position]));
        return convertView;
    }



    public class ViewHolder {
        public ImageView iv_img;
        public TextView tv_txt;
        public View view_tag;
    }
}
