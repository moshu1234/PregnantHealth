package com.pregnant.health.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.pregnant.health.R;
import com.pregnant.health.bean.GeneralSurvey;
import com.pregnant.health.model.Catalog;
import com.pregnant.health.utils.DensityUtils;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.SPUtils;

import java.util.List;

/**
 * 流式布局的RadioGroup
 */
public class FlowRadioGroup extends RadioGroup {

    /** The horizontal tag spacing, default is 8.0dp. */
    private int horizontalSpacing = 68;

    /** The vertical tag spacing, default is 4.0dp. */
    private int verticalSpacing = 20;

    public FlowRadioGroup(Context context) {
        super(context);
    }

    public FlowRadioGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        final int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        final int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        final int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        final int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        measureChildren(widthMeasureSpec, heightMeasureSpec);

        int width = 0;
        int height = 0;

        int row = 0; // The row counter.
        int rowWidth = 0; // Calc the current row width.
        int rowMaxHeight = 0; // Calc the max tag height, in current row.

        final int count = getChildCount();
        for (int i = 0; i < count; i++) {
            final View child = getChildAt(i);
            final int childWidth = child.getMeasuredWidth();
            final int childHeight = child.getMeasuredHeight();

            if (child.getVisibility() != GONE) {
                rowWidth += childWidth;
                if (rowWidth > widthSize) { // Next line.
                    rowWidth = childWidth; // The next row width.
                    height += rowMaxHeight + verticalSpacing;
                    rowMaxHeight = childHeight; // The next row max height.
                    row++;
                } else { // This line.
                    rowMaxHeight = Math.max(rowMaxHeight, childHeight);
                }
                rowWidth += horizontalSpacing;
            }
        }
        // Account for the last row height.
        height += rowMaxHeight;

        // Account for the padding too.
        height += getPaddingTop() + getPaddingBottom();

        // If the tags grouped in one row, set the width to wrap the tags.
        if (row == 0) {
            width = rowWidth;
            width += getPaddingLeft() + getPaddingRight();
        } else {// If the tags grouped exceed one line, set the width to match the parent.
            width = widthSize;
        }

        setMeasuredDimension(widthMode == MeasureSpec.EXACTLY ? widthSize : width,
                heightMode == MeasureSpec.EXACTLY ? heightSize : height);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        final int parentLeft = getPaddingLeft();
        final int parentRight = r - l - getPaddingRight();
        final int parentTop = getPaddingTop();
        final int parentBottom = b - t - getPaddingBottom();

        int childLeft = parentLeft;
        int childTop = parentTop;

        int rowMaxHeight = 0;

        final int count = getChildCount();
        for (int i = 0; i < count; i++) {
            final View child = getChildAt(i);
            final int width = child.getMeasuredWidth();
            final int height = child.getMeasuredHeight();

            if (child.getVisibility() != GONE) {
                if (childLeft + width > parentRight) { // Next line
                    childLeft = parentLeft;
                    childTop += rowMaxHeight + verticalSpacing;
                    rowMaxHeight = height;
                } else {
                    rowMaxHeight = Math.max(rowMaxHeight, height);
                }
                child.layout(childLeft, childTop, childLeft + width, childTop + height);

                childLeft += width + horizontalSpacing;
            }
        }
    }


    public void setTags(List<Catalog> catalogs) {
        removeAllViews();
        for (final Catalog catalog : catalogs) {
            appendTag(catalog);
        }
    }

    private OnCheckedChangeListener mOnCheckedChangeListener;

    public void setOnCheckedChangeListener(OnCheckedChangeListener listener) {
        mOnCheckedChangeListener = listener;
    }

    protected void appendTag(Catalog catalog) {
        final RadioButton radioButton = new RadioButton(getContext());
        radioButton.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        radioButton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        radioButton.setScaleX(0.9f);
        radioButton.setScaleY(0.9f);
        radioButton.setButtonDrawable(getResources().getDrawable(R.drawable.radio_selector));
        radioButton.setPadding(DensityUtils.sp2px(8), DensityUtils.sp2px(5), DensityUtils.sp2px(8), DensityUtils.sp2px(5));
        radioButton.setText(catalog.getCaption());
//        if ("1".equals(catalog.getDefaultValue())) {
//            radioButton.setChecked(true);
//        }
        final int i = getChildCount();
        addView(radioButton, i);

        String s = (String) SPUtils.get(key, "");
        if (!TextUtils.isEmpty(s)) {
            GeneralSurvey generalSurvey = JSONUtils.string2Bean(s, GeneralSurvey.class);
            for (String key : generalSurvey.getField().keySet()) {
                if (catalog.getFieldName().equals(key)) {
                    check(radioButton.getId());
                    this.catalog = catalog;
                    break;
                }
            }
        }

        radioButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnCheckedChangeListener != null) {
//                    clearCheck();
                    mOnCheckedChangeListener.onCheckedChanged(FlowRadioGroup.this, i);
                }
            }
        });
    }

    Catalog catalog;
    public Catalog getSelected() {
        return catalog;
    }

    public void select(int index) {
        ((RadioButton)getChildAt(index)).setChecked(true);
    }

    public void reset(){
        clearCheck();
    }

    String key;
    public void setKey(String key) {
        this.key = key;
    }

    /*
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int maxWidth = MeasureSpec.getSize(widthMeasureSpec);
        int childCount = getChildCount();
        int x = 0;
        int y = 0;
        int row = 0;

        for (int index = 0; index < childCount; index++) {
            final View child = getChildAt(index);
            if (child.getVisibility() != View.GONE) {
                child.measure(MeasureSpec.UNSPECIFIED, MeasureSpec.UNSPECIFIED);
                // 此处增加onlayout中的换行判断，用于计算所需的高度
                int width = child.getMeasuredWidth();
                int height = child.getMeasuredHeight();
                x += width;
                y = row * height + height;
                if (x > maxWidth) {
                    x = width;
                    row++;
                    y = row * height + height;
                }
            }
        }
        // 设置容器所需的宽度和高度
        setMeasuredDimension(maxWidth, y);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        final int childCount = getChildCount();
        int maxWidth = r - l;
        int x = 0;
        int y = 0;
        int row = 0;
        for (int i = 0; i < childCount; i++) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != View.GONE) {
                int width = child.getMeasuredWidth();
                int height = child.getMeasuredHeight();
                x += width;
                y = row * height + height;
                if (x > maxWidth) {
                    x = width;
                    row++;
                    y = row * height + height;
                }
                child.layout(x - width, y - height, x, y);
            }
        }
    }
    */
}
