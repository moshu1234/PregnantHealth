package com.pregnant.health.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.pregnant.health.R;

/**
 * 设置的条目，可用于显示键值
 * @author Bruce.Wang
 *
 */
@SuppressLint("NewApi")
public class SettingItemView extends LinearLayout {

    private String key;
    private String value;
    private boolean showrightimage;
    private int leftRes;
    private ImageView iv_left;
    private ImageView iv_more;
    private TextView tv_key;
    private TextView tv_value;

    public SettingItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initAttrs(context, attrs);
        initViews(context);
    }

    public SettingItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initAttrs(context, attrs);
        initViews(context);
    }


    public SettingItemView(Context context) {
        super(context);
    }

    /**
     * 初始化自定义属性
     * @param context
     * @param attrs
     */
    private void initAttrs(Context context, AttributeSet attrs) {
        // 加载自定义属性
        TypedArray mTypedArray = context.obtainStyledAttributes(attrs,
                R.styleable.setting_item_style);
        leftRes = mTypedArray
                .getResourceId(R.styleable.setting_item_style_leftimage,
                        R.drawable.ic_launcher);
        key = mTypedArray.getString(R.styleable.setting_item_style_key);
        if (key == null) {
            key = "";
        }
        value = mTypedArray.getString(R.styleable.setting_item_style_value);
        if (value == null) {
            value = "";
        }
        showrightimage = mTypedArray.getBoolean(R.styleable.setting_item_style_showrightimage, true);
        mTypedArray.recycle();
    }

    /**
     * 初始化显示
     * @param context
     */
    private void initViews(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_setting_item, this);
        iv_left = (ImageView) findViewById(R.id.iv_left);
        iv_more = (ImageView) findViewById(R.id.iv_more);
        tv_key = (TextView) findViewById(R.id.tv_key);
        tv_value = (TextView) findViewById(R.id.tv_value);

        if (leftRes != 0) {
            iv_left.setImageResource(leftRes);
        }

        if (!TextUtils.isEmpty(key)) {
            tv_key.setVisibility(VISIBLE);
            tv_key.setText(key);
        }

        if (!TextUtils.isEmpty(value)) {
            tv_value.setVisibility(VISIBLE);
            tv_value.setText(value);
            if (context.getString(R.string.tip_required).equals(value) || context.getString(R.string.tip_not_filled).equals(value)) {
                tv_value.setTextColor(getResources().getColor(R.color.gray));
            } else {
                tv_value.setTextColor(getResources().getColor(R.color.pink));
            }
        }

        if (!showrightimage) {
            iv_more.setVisibility(GONE);
        }
    }

    /**
     * 设置键名称
     * @param key
     */
    public void setKey(String key){
        if(key != null){
            this.key = key;
            tv_key.setText(key);
        }
    }

    /**
     * 设置值名称
     * @param value
     */
    public void setValue(String value){
        if(value != null){
            this.value = value;
            tv_value.setText(value);
            if (getContext().getString(R.string.tip_required).equals(value) || getContext().getString(R.string.tip_not_filled).equals(value)) {
                tv_value.setTextColor(getResources().getColor(R.color.gray));
            } else {
                tv_value.setTextColor(getResources().getColor(R.color.pink));
            }
        }
    }

    /**
     * 获取Value
     * @return
     */
    public String getValue(){
        return this.value;
    }

    /**
     * 设置控件显示
     * @param view
     * @param visible
     */
    private void setViewVisible(View view, int visible){
        view.setVisibility(visible);
    }

}
