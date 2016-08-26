package com.pregnant.health.utils;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.pregnant.health.R;
import com.pregnant.health.view.CustomDialog;

/**
 * 对话框辅助类
 */
public class DialogHelp {


    /***
     * 获取一个dialog
     *
     * @param context
     * @return
     */
    public static AlertDialog.Builder getDialog(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        return builder;
    }

    /***
     * 获取一个耗时等待对话框
     *
     * @param context
     * @param message
     * @return
     */
    static ProgressDialog waitDialog;

    public static ProgressDialog getWaitDialog(Context context, String message) {
        if (waitDialog == null) {
            waitDialog = new ProgressDialog(context);
            if (!TextUtils.isEmpty(message)) {
                waitDialog.setMessage(message);
            }
            waitDialog.setCanceledOnTouchOutside(false);
        }
        return waitDialog;
    }

    public static void dismissWaitDialog() {
        if (waitDialog != null) {
            waitDialog.dismiss();
            waitDialog = null;
        }
    }

    /***
     * 获取一个信息对话框，注意需要自己手动调用show方法显示
     *
     * @param context
     * @param message
     * @param onClickListener
     * @return
     */
    public static AlertDialog.Builder getMessageDialog(Context context, String message, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = getDialog(context);
        builder.setMessage(message);
        builder.setPositiveButton("确定", onClickListener);
        return builder;
    }

    public static AlertDialog.Builder getMessageDialog(Context context, String message) {
        return getMessageDialog(context, message, null);
    }

    public static AlertDialog.Builder getConfirmDialog(Context context, String message, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = getDialog(context);
        builder.setMessage(Html.fromHtml(message));
        builder.setPositiveButton("确定", onClickListener);
        builder.setNegativeButton("取消", null);
        return builder;
    }

    public static AlertDialog.Builder getConfirmDialog(Context context, String title, String message, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = getDialog(context);
        builder.setTitle(title);
        builder.setMessage(Html.fromHtml(message));
        builder.setPositiveButton("我知道了", onClickListener);
        return builder;
    }

    public static AlertDialog.Builder getConfirmDialog(Context context, String message, DialogInterface.OnClickListener onOkClickListener, DialogInterface.OnClickListener onCancleClickListener) {
        AlertDialog.Builder builder = getDialog(context);
        builder.setMessage(message);
        builder.setPositiveButton("确定", onOkClickListener);
        builder.setNegativeButton("取消", onCancleClickListener);
        return builder;
    }

    public static AlertDialog.Builder getConfirmDialog(Context context, String title, String message, String okTxt, String cancelTxt, DialogInterface.OnClickListener onOkClickListener, DialogInterface.OnClickListener onCancleClickListener) {
        AlertDialog.Builder builder = getDialog(context);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton(okTxt, onOkClickListener);
        builder.setNegativeButton(cancelTxt, onCancleClickListener);
        return builder;
    }

    public static AlertDialog.Builder getConfirmDialog(Context context, String title, String message, DialogInterface.OnClickListener onOkClickListener, DialogInterface.OnClickListener onCancleClickListener) {
        AlertDialog.Builder builder = getDialog(context);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton("确定", onOkClickListener);
        builder.setNegativeButton("取消", onCancleClickListener);
        return builder;
    }

    public static AlertDialog.Builder getSelectDialog(Context context, String title, String[] arrays, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = getDialog(context);
        builder.setItems(arrays, onClickListener);
        if (!TextUtils.isEmpty(title)) {
            builder.setTitle(title);
        }
        builder.setPositiveButton("取消", null);
        return builder;
    }

    public static AlertDialog.Builder getSelectDialog(Context context, String[] arrays, DialogInterface.OnClickListener onClickListener) {
        return getSelectDialog(context, "", arrays, onClickListener);
    }

    /**
     * 单选
     *
     * @param context
     * @param title
     * @param arrays
     * @param selectIndex
     * @param onClickListener
     * @return
     */
    public static AlertDialog.Builder getSingleChoiceDialog(Context context, String title, String[] arrays, int selectIndex, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = getDialog(context);
        builder.setSingleChoiceItems(arrays, selectIndex, onClickListener);
        if (!TextUtils.isEmpty(title)) {
            builder.setTitle(title);
        }
        builder.setNegativeButton("取消", null);
        return builder;
    }

    public static AlertDialog.Builder getSingleChoiceDialog(Context context, String[] arrays, int selectIndex, DialogInterface.OnClickListener onClickListener) {
        return getSingleChoiceDialog(context, "", arrays, selectIndex, onClickListener);
    }

    static CustomDialog dialog = null;
    static EditText et_input = null;
    static TextView tv_title;
    static TextView tv_unit;

    public static void getInputDialog(final Context context, String title, final ResultHandler resultHandler) {
        getInputDialog(context, title, resultHandler, 1);
    }

    public static void getInputDialog(final Context context, String title, final ResultHandler resultHandler, int type) {
//        if (dialog == null) {
        View view = View.inflate(context, R.layout.dialog_input, null);
        tv_title = (TextView) view.findViewById(R.id.tv_title);
        et_input = (EditText) view.findViewById(R.id.et_input);

        CustomDialog.Builder builder = new CustomDialog.Builder(context);
        builder.setContentView(view);
        builder.setPositiveButton("完成", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String text = et_input.getText().toString();
                if (TextUtils.isEmpty(text)) {
                    Toast.makeText(context, "内容不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                dialog.dismiss();
                resultHandler.handle(text);
            }
        });
        builder.setNegativeButton("取消",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        dialog = builder.create();
//        }
        tv_title.setText(title);
        et_input.getText().clear();
        if (type == 0) { // 手机
//            et_input.setInputType(InputType.TYPE_CLASS_PHONE);
            et_input.setKeyListener(new
                    DigitsKeyListener(false, true));
        }
        dialog.show();
    }

    static EditText et_blood1;
    static EditText et_blood2;

    public static void getInputDialog2(final Context context, String title, final ResultHandler resultHandler) {
        View view = View.inflate(context, R.layout.dialog_input2, null);
        tv_title = (TextView) view.findViewById(R.id.tv_title);

        et_blood1 = (EditText) view.findViewById(R.id.et_blood1);
        et_blood2 = (EditText) view.findViewById(R.id.et_blood2);


        CustomDialog.Builder builder = new CustomDialog.Builder(context);
        builder.setContentView(view);
        builder.setPositiveButton("完成", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String text1 = et_blood1.getText().toString();
                String text2 = et_blood2.getText().toString();
                if (TextUtils.isEmpty(text1) || TextUtils.isEmpty(text2)) {
                    Toast.makeText(context, "内容不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                dialog.dismiss();
                resultHandler.handle(text1 + " / " + text2);
            }
        });
        builder.setNegativeButton("取消",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        dialog = builder.create();
        tv_title.setText(title);
        dialog.show();
    }

    public static void getInputDialog3(final Context context, String title, final ResultHandler resultHandler, String unit) {
        View view = View.inflate(context, R.layout.dialog_input3, null);
        tv_title = (TextView) view.findViewById(R.id.tv_title);
        tv_unit = (TextView) view.findViewById(R.id.tv_unit);
        if (!TextUtils.isEmpty(unit)) {
            tv_unit.setText(unit);
        }
        final EditText et_amount = (EditText) view.findViewById(R.id.et_amount);
        et_amount.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                String num = et_amount.getText().toString();
                if (!TextUtils.isEmpty(num)) {
                    if (num.startsWith("0") && num.length() > 1) {
                        et_amount.setText(num.substring(1));
                    }
//                    if (Integer.parseInt(et_amount.getText().toString()) <= 0) {
//                        et_amount.setText(0 + "");
//                    }
//                    if (Integer.parseInt(et_amount.getText().toString()) >= 2000) {
//                        et_amount.setText(2000 + "");
//                    }
                }

            }
        });

        CustomDialog.Builder builder = new CustomDialog.Builder(context);
        builder.setContentView(view);
        builder.setPositiveButton("完成", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String text = et_amount.getText().toString();
                if (Integer.parseInt(et_amount.getText().toString()) <= 0) {
                    Toast.makeText(context, "内容不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                dialog.dismiss();
                resultHandler.handle(text);
            }
        });
        builder.setNegativeButton("取消",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        dialog = builder.create();
        tv_title.setText(title);
        dialog.show();
    }

    public static void getConfirmDialog(final Context context, String title, String content, final ResultHandler resultHandler) {
        View view = View.inflate(context, R.layout.dialog_confirm, null);
        tv_title = (TextView) view.findViewById(R.id.tv_title);

        TextView tv_content = (TextView) view.findViewById(R.id.tv_content);


        CustomDialog.Builder builder = new CustomDialog.Builder(context);
        builder.setContentView(view);
        builder.setPositiveButton("保存", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                resultHandler.handle("");
            }
        });
        builder.setNegativeButton("取消",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        dialog = builder.create();
        tv_title.setText(title);
        tv_content.setText(content);
        dialog.show();
    }


    public interface ResultHandler {
        void handle(String data);
    }
}
