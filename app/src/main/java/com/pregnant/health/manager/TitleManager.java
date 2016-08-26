package com.pregnant.health.manager;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pregnant.health.R;
import com.pregnant.health.listener.TitleEventListener;

public class TitleManager implements View.OnClickListener {


    private static TitleManager uniqueInstance = null;
    private Activity context;
    private View titleView;
    private LayoutInflater inflater;

    private String titleName = "通用标题";
    private TitleEventListener listener;

    private TitleManager(Activity context) {
        this.context = context;
        inflater = context.getLayoutInflater();
    }

    public static TitleManager getInstance(Activity context) {
        if (uniqueInstance == null) {
            uniqueInstance = new TitleManager(context);
        }
        return uniqueInstance;
    }

    public View common_title_left;
    public View common_title_right;
    public TextView mCityNameTextView;
    public TextView mTitleTextView;
    public ImageView mBack;
    public ImageView mRight;
    public TextView mTv;


    public View initTitleView(int layoutId) {

        titleView = inflater.inflate(R.layout.view_common_title, null);

        common_title_left = titleView.findViewById(R.id.common_title_left);
        common_title_left.setOnClickListener(this);
        common_title_right = titleView.findViewById(R.id.common_title_right);
        common_title_right.setOnClickListener(this);

        mCityNameTextView = (TextView) titleView.findViewById(R.id.title_left_city);
        mTitleTextView = (TextView) titleView.findViewById(R.id.common_title_center);
        mBack = (ImageView) titleView.findViewById(R.id.title_left_back);
        mRight = (ImageView) titleView.findViewById(R.id.title_right_iv);
        mTv = (TextView) titleView.findViewById(R.id.title_right_tv);
//        mTv.setOnClickListener(this);


        switch (layoutId) {
            case R.layout.act_login:
                mBack.setVisibility(View.GONE);
                break;
            case R.layout.act_meal_detail:
                setTitleRightText("删除记录");
                break;
            case R.layout.act_routine_survey_one:
            case R.layout.act_routine_survey_two:
            case R.layout.act_routine_survey_four:
            case R.layout.act_routine_survey_five:
                setTitleRightText("重置");
                break;
            case R.layout.act_personal_info:
                setTitleRightText("保存");
                break;
            default:
                common_title_left.setVisibility(View.VISIBLE);
                mBack.setVisibility(View.VISIBLE);
                mCityNameTextView.setVisibility(View.GONE);
                mRight.setVisibility(View.GONE);
                break;
        }
        mTitleTextView.setText(titleName);
        return titleView;
    }

    /**
     * 设置标题栏右边按钮的文字
     * @param text
     */
    public void setTitleRightText(String text) {
        mTv.setVisibility(View.VISIBLE);
        mTv.setText(text);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.common_title_left:
//                EventBus.getDefault().post(new EventCenter(Constants.EVENT_TITLE_LEFT));
                if (listener != null) {
                    listener.doLeft();
                }
                break;
            case R.id.common_title_right:
//                EventBus.getDefault().post(new EventCenter(Constants.EVENT_TITLE_RIGHT));
                if (listener != null) {
                    listener.doRight();
                }
                break;
        }
    }


    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public void setTitleVisible(int visible) {
        if (titleView != null) {
            titleView.setVisibility(visible);
        }
    }



    public void setListener(TitleEventListener listener) {
        this.listener = listener;
    }
}


