package com.pregnant.health.utils;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.pregnant.health.R;
import com.pregnant.health.view.PickerView;

import java.util.ArrayList;

/**
 * 单列选择器
 * Created by cws on 2016/3/18.
 */
public class SingleSelector1 {
    public interface ResultHandler {
        void handle(String selectItem);
    }

    private ResultHandler handler;
    private Context context;

    private Dialog seletorDialog;
    private PickerView pickerView;

    private ArrayList<String> data;

    private TextView tv_cancel;
    private TextView tv_select;

    private String selectText;
    private String defaultSelectItem;

    public SingleSelector1(Context context, ResultHandler resultHandler, ArrayList<String> data, String defaultSelectItem) {
        this.context = context;
        this.handler = resultHandler;
        this.data = data;
        this.defaultSelectItem = defaultSelectItem;
        initDialog();
        initView();
        initData();
    }

    public SingleSelector1(Context context, ResultHandler resultHandler, ArrayList<String> data) {
        this(context, resultHandler, data, null);
    }

    private void initDialog() {
        if (seletorDialog == null) {
            seletorDialog = new Dialog(context, R.style.time_dialog);
            seletorDialog.setCancelable(true);
            seletorDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            seletorDialog.setContentView(R.layout.dialog_selector);
            Window window = seletorDialog.getWindow();
            window.setGravity(Gravity.BOTTOM);
            WindowManager.LayoutParams lp = window.getAttributes();
            int width = ScreenUtil.getInstance(context).getScreenWidth();
            lp.width = width;
            window.setAttributes(lp);
        }
    }

    private void initView() {
        pickerView = (PickerView) seletorDialog.findViewById(R.id.pv);
        tv_cancel = (TextView) seletorDialog.findViewById(R.id.tv_cancel);
        tv_select = (TextView) seletorDialog.findViewById(R.id.tv_select);

        tv_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seletorDialog.dismiss();
            }
        });
        tv_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.handle(selectText);
                seletorDialog.dismiss();
            }
        });
        pickerView.setOnSelectListener(new PickerView.onSelectListener() {
            @Override
            public void onSelect(String text) {
                selectText = text;
            }
        });

    }


    public void show(){
        if (seletorDialog != null) {
            seletorDialog.show();
        }
    }

    private void initData() {
        pickerView.setData(data);
        if (!TextUtils.isEmpty(defaultSelectItem)) {
            pickerView.setSelected(defaultSelectItem);
        }

    }
}
