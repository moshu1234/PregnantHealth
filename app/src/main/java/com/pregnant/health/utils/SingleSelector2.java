package com.pregnant.health.utils;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.pregnant.health.R;
import com.pregnant.health.model.Catalog;
import com.pregnant.health.view.PickerView2;

import java.util.List;

/**
 * 单列选择器
 * Created by cws on 2016/3/18.
 */
public class SingleSelector2 {
    public interface ResultHandler {
        void handle(Catalog selectItem);
    }

    private ResultHandler handler;
    private Context context;

    private Dialog seletorDialog;
    private PickerView2 pickerView;
    private PickerView2 pickerView2;

    private List<Catalog> data;
    private List<Catalog> data2;

    private TextView tv_cancel;
    private TextView tv_select;

    private Catalog selectText1;
    private Catalog selectText2;
    private Catalog defaultSelectItem1;
    private Catalog defaultSelectItem2;

    // 单列构造函数
    public SingleSelector2(Context context, ResultHandler resultHandler, List<Catalog> data, Catalog defaultSelectItem) {
        this(context, resultHandler, data, null, defaultSelectItem, null);
    }

    // 双列构造函数
    public SingleSelector2(Context context, ResultHandler resultHandler, List<Catalog> data, List<Catalog> data2, Catalog defaultSelectItem1, Catalog defaultSelectItem2) {
        this.context = context;
        this.handler = resultHandler;
        this.data = data;
        this.data2 = data2;
        this.defaultSelectItem1 = defaultSelectItem1;
        this.defaultSelectItem2 = defaultSelectItem2;
        initDialog();
        initView();
        initData();
    }

    public SingleSelector2(Context context, ResultHandler resultHandler, List<Catalog> data) {
        this(context, resultHandler, data, null);
    }

    private void initDialog() {
        if (seletorDialog == null) {
            seletorDialog = new Dialog(context, R.style.time_dialog);
            seletorDialog.setCancelable(true);
            seletorDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            seletorDialog.setContentView(R.layout.dialog_selector2);
            Window window = seletorDialog.getWindow();
            window.setGravity(Gravity.BOTTOM);
            WindowManager.LayoutParams lp = window.getAttributes();
            int width = ScreenUtil.getInstance(context).getScreenWidth();
            lp.width = width;
            window.setAttributes(lp);
        }
    }

    private void initView() {
        pickerView = (PickerView2) seletorDialog.findViewById(R.id.pv);
        pickerView2 = (PickerView2) seletorDialog.findViewById(R.id.pv2);
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
                if (data2 != null) {
                    if (selectText1 == null) {
                        selectText1 = defaultSelectItem1;
                    }
                    if (selectText2 == null) {
                        selectText2 = defaultSelectItem2;
                    }

                    if (selectText1.getCaption().contains("/")) {
                        selectText1.setCaption(selectText1.getCaption().substring(0, selectText1.getCaption().indexOf("/")));
                    }

                    selectText1.setCaption(selectText1.getCaption() + "/" + selectText2.getCaption());
                    handler.handle(selectText1);
                } else {
                    if (selectText1 == null) {
                        handler.handle(defaultSelectItem1);
                    } else {
                        handler.handle(selectText1);
                    }
                }
                seletorDialog.dismiss();
            }
        });
        pickerView.setOnSelectListener(new PickerView2.onSelectListener() {
            @Override
            public void onSelect(Catalog text) {
                selectText1 = text;
            }
        });
        pickerView2.setOnSelectListener(new PickerView2.onSelectListener() {
            @Override
            public void onSelect(Catalog text) {
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

        if (defaultSelectItem1 != null) {
            pickerView.setSelected(defaultSelectItem1.getCaption());
        }
        if (defaultSelectItem2 != null) {
            pickerView2.setSelected(defaultSelectItem2.getCaption());
        }

    }
}
