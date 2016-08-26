package com.pregnant.health.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.pregnant.health.R;
import com.pregnant.health.utils.DensityUtils;

/**
 * Created by cws on 2016/3/12.
 */
public class ImageWithText extends LinearLayout {

    private String txt;
    private int resId;
    private int imgSize;
    private int txtSize;

    
    public ImageWithText(Context context) {
        super(context, null);
    }

    public ImageWithText(Context context, AttributeSet attrs) {
        super(context, attrs);
        initAttrs(context, attrs);
        initViews(context);
    }

    private void initViews(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_imagebtn_with_text, this, true);
        ImageView iv_img = (ImageView) findViewById(R.id.iv_img);
        TextView tv_txt = (TextView) findViewById(R.id.tv_txt);

        iv_img.setImageResource(resId);
        LayoutParams imgParams = new LayoutParams(DensityUtils.dp2px(imgSize), DensityUtils.dp2px(imgSize));
        iv_img.setLayoutParams(imgParams);

        tv_txt.setText(txt);
        tv_txt.setTextSize(TypedValue.COMPLEX_UNIT_PX, DensityUtils.sp2px(txtSize));
    }

    private void initAttrs(Context context, AttributeSet attrs) {
        // 加载自定义属性
        TypedArray mTypedArray = context.obtainStyledAttributes(attrs,
                R.styleable.img_with_txt_style);
        
        txt = mTypedArray.getString(R.styleable.img_with_txt_style_txt);
        imgSize = (int) mTypedArray.getDimension(R.styleable.img_with_txt_style_imgSize, 30);
        txtSize = (int) mTypedArray.getDimension(R.styleable.img_with_txt_style_txtSize, 12);
        resId = mTypedArray
                .getResourceId(R.styleable.img_with_txt_style_src,
                        R.drawable.ic_launcher);

        mTypedArray.recycle();
    }
}
