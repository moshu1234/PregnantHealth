package com.pregnant.health.ui.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.pregnant.health.R;

import java.util.Map;

/**
 * Created by cws on 2016/3/21.
 */
public class ItemAdapter1 extends BaseAdapter {

    private Context context;

    public static int[] names = {R.string.name_bc, R.string.name_xcg, R.string.name_ncg};

    Map<String, String> paths;

    private int clickTemp = -1;

    public ItemAdapter1(Context context, Map<String, String> paths) {
        this.context = context;
        this.paths = paths;
    }

    //标识选择的Item
    public void setSeclection(int position) {
        clickTemp = position;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return names.length;
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

        String path = paths.get(names[position] + "");
        if (!TextUtils.isEmpty(path)) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 4; //图片宽高都为原来的二分之一，即图片为原来的四分之一
//            options.inTempStorage = new byte[1024*1024*5]; //5MB的临时存储空间
            Bitmap bitmap = BitmapFactory.decodeFile(path,options);
//            Bitmap bitmap = IoUtils.decodeFile(new File(path));
            holder.iv_img.setImageBitmap(bitmap);
        }

        holder.tv_txt.setText(context.getString(names[position]));
        return convertView;
    }

    public class ViewHolder {
        public ImageView iv_img;
        public TextView tv_txt;
        public View view_tag;
    }
}
