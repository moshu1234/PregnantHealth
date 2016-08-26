package com.pregnant.health.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.pregnant.health.R;

/**
 * Created by cws on 2016/3/12.
 */
public class MyRadioGroup extends LinearLayout {

    private String txt;

    RadioGroup radioGroup;
    TextView tv_title;

    public String getText() {
        return txt;
    }

    public MyRadioGroup(Context context) {
        super(context, null);
    }

    public MyRadioGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        initAttrs(context, attrs);
        initViews(context);
    }

    private RadioGroup.OnCheckedChangeListener mOnCheckedChangeListener;

    public void setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener listener) {
        mOnCheckedChangeListener = listener;
    }


    private void initViews(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_radiogroup, this, true);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_title.setText(txt);

        onClick(0);
        onClick(1);

        select(1);

//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                isClicked = true;
//                mOnMyCheckedChangeListener.onMyCheckedChanged(group, checkedId);
//            }
//        });
    }

    private void onClick(final int i) {
        radioGroup.getChildAt(i).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnCheckedChangeListener != null) {
                    mOnCheckedChangeListener.onCheckedChanged(radioGroup, i);
                }
            }
        });
    }

    private void initAttrs(Context context, AttributeSet attrs) {
        // 加载自定义属性
        TypedArray mTypedArray = context.obtainStyledAttributes(attrs,
                R.styleable.MyRadioGroup);
        
        txt = mTypedArray.getString(R.styleable.MyRadioGroup_mytitle);

        mTypedArray.recycle();
    }

    public void select(int index) {
        ((RadioButton)radioGroup.getChildAt(index)).setChecked(true);
    }

    public void setText(String text) {
        tv_title.setText(text);
    }

    public void reset(){
        radioGroup.clearCheck();
    }
}
