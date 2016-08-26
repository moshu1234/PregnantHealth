package com.pregnant.health.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import com.pregnant.health.R;
import com.pregnant.health.bean.GeneralSurvey;
import com.pregnant.health.model.Catalog;
import com.pregnant.health.utils.DensityUtils;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.SPUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 参考 AndroidTagGroup-master
 * Created by cws on 2016/3/22.
 */
public class CheckBoxGroup extends ViewGroup {
    private final static String TAG = "CheckBoxGroup";

    /** The horizontal tag spacing, default is 8.0dp. */
    private int horizontalSpacing = 68;

    /** The vertical tag spacing, default is 4.0dp. */
    private int verticalSpacing = 20;

    private boolean isClicked;

    public CheckBoxGroup(Context context) {
        super(context);
    }

    public CheckBoxGroup(Context context, AttributeSet attrs) {
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

    List<Catalog> catalogs;
    public void setTags(List<Catalog> catalogs) {
        removeAllViews();
        this.catalogs = catalogs;
        for (final Catalog catalog : catalogs) {
            appendTag(catalog);
        }
    }


    List<Catalog> list = new ArrayList<Catalog>();

    protected void appendTag(final Catalog catalog) {
        final CheckBox checkBox = new CheckBox(getContext());
        checkBox.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
        checkBox.setText(catalog.getCaption());
//        if ("1".equals(catalog.getDefaultValue())) {
//            checkBox.setChecked(true);
//        }
        String s = (String) SPUtils.get(key, "");
        if (!TextUtils.isEmpty(s)) {
            GeneralSurvey generalSurvey = JSONUtils.string2Bean(s, GeneralSurvey.class);
            for (String key : generalSurvey.getField().keySet()) {
                if (catalog.getFieldName().equals(key)) {
                    checkBox.setChecked(true);
                    list.add(catalog);
                    break;
                }
            }
        }


        checkBox.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        checkBox.setButtonDrawable(getResources().getDrawable(R.drawable.checkbox_selector));
        checkBox.setScaleX(0.9f);
        checkBox.setScaleY(0.9f);
        checkBox.setPadding(DensityUtils.sp2px(8), DensityUtils.sp2px(5), DensityUtils.sp2px(8), DensityUtils.sp2px(5));
        checkBox.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();
                if (checked) {
                    list.add(catalog);
                } else {
                    list.remove(catalog);
                }
            }
        });
        addView(checkBox);
    }

    public void reset(){
        list.clear();
        final int count = getChildCount();
        for (int i = 0; i < count; i++) {
            final CheckBox child = (CheckBox) getChildAt(i);
            child.setChecked(false);
        }
    }

    public List<Catalog> getList() {
        return list;
    }

    /**
     * 判断是否已经选择
     * @return
     */
    public boolean isClicked() {
        return list.size() > 0 ? true : false;
    }

    String key;
    public void setKey(String key) {
        this.key = key;
    }
}
