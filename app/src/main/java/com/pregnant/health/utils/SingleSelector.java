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
import java.util.List;

/**
 * 单列选择器
 * Created by cws on 2016/3/18.
 */
public class SingleSelector {
    public interface ResultHandler {
        void handle(String selectItem);
    }

    private ResultHandler handler;
    private Context context;

    private Dialog seletorDialog;
    private PickerView pickerView;
    private PickerView pickerView2;

    private List<String> data;
    private List<String> data2;

    private TextView tv_cancel;
    private TextView tv_select;

    private String selectText;
    private String selectText2;
    private String defaultSelectItem;

    // 单列构造函数
    public SingleSelector(Context context, ResultHandler resultHandler, List<String> data, String defaultSelectItem) {
        this(context, resultHandler, data, null, defaultSelectItem);
    }

    // 双列构造函数
    public SingleSelector(Context context, ResultHandler resultHandler, List<String> data, ArrayList<String> data2, String defaultSelectItem) {
        this.context = context;
        this.handler = resultHandler;
        this.data = data;
        this.data2 = data2;
        this.defaultSelectItem = defaultSelectItem;
        initDialog();
        initView();
        initData();
    }

    public SingleSelector(Context context, ResultHandler resultHandler, ArrayList<String> data) {
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
        pickerView2 = (PickerView) seletorDialog.findViewById(R.id.pv2);
        tv_cancel = (TextView) seletorDialog.findViewById(R.id.tv_cancel);
        tv_select = (TextView) seletorDialog.findViewById(R.id.tv_select);

        // 双列
        pickerView2.setVisibility(data2 == null ? View.GONE : View.VISIBLE);

        tv_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seletorDialog.dismiss();
            }
        });
        tv_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(selectText2)) {
                    if (TextUtils.isEmpty(selectText)) {
                        handler.handle(defaultSelectItem);
                    } else {
                        handler.handle(selectText);
                    }

                } else {
                    handler.handle(selectText + "/" + selectText2);
                }

                seletorDialog.dismiss();
            }
        });
        pickerView.setOnSelectListener(new PickerView.onSelectListener() {
            @Override
            public void onSelect(String text) {
                selectText = text;
            }
        });
        pickerView2.setOnSelectListener(new PickerView.onSelectListener() {
            @Override
            public void onSelect(String text) {
                selectText2 = text;
            }
        });

    }


    public void show() {
        if (seletorDialog != null) {
            seletorDialog.show();
        }
    }

    private void initData() {
        if (data != null) {
            pickerView.setData(data);
        }
        if (data2 != null) {
            pickerView2.setData(data2);
        }

        if (!TextUtils.isEmpty(defaultSelectItem)) {
            pickerView.setSelected(defaultSelectItem);
        }

    }
}
