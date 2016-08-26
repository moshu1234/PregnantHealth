package com.pregnant.health.utils;

import com.pregnant.health.R;
import com.pregnant.health.base.BaseApplication;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by cws on 2016/4/5.
 */
public class CommonUtils {

    /**
     * 判断邮箱是否合法
     *
     * @param email
     * @return
     */
    public static boolean isEmail(String email) {
        if (isEmpty(email)) {
            show(R.string.tip_input_email);
            return false;
        }
        //Pattern p = Pattern.compile("\\w+@(\\w+.)+[a-z]{2,3}"); //简单匹配
        Pattern p = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");//复杂匹配
        Matcher m = p.matcher(email);
        if (!m.matches()) {
            show(R.string.tip_right_email);
            return false;
        }
        return true;
    }

    /**
     * 判断手机是否合法
     *
     * @param mobiles
     * @return
     */
    public static boolean isMobile(String mobiles) {
        if (isEmpty(mobiles)) {
            show(R.string.tip_input_phone);
            return false;
        }
        Pattern p = Pattern
                .compile("^[1][0-9]{10}");
        Matcher m = p.matcher(mobiles);
        if (!m.matches()) {
            show(R.string.tip_right_phone);
            return false;
        }
        return true;
    }

    /**
     * return if str is empty
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (str == null || str.length() == 0 || str.equalsIgnoreCase("null") || str.isEmpty() || str.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Toast
     *
     * @param toast
     */
    private static void show(int toast) {
        String toastStr = BaseApplication.getContext().getResources().getString(toast);
        if (!isEmpty(toastStr)) {
            T.show(toast);
        }
    }

    //获得指定文件的byte数组
    public static byte[] filePathtoBytes(String filePath){
//        if (TextUtils.isEmpty(filePath)) {
//            return null;
//        }
        byte[] buffer = null;
        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
            byte[] b = new byte[1024];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            bos.close();
            buffer = bos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }
}
