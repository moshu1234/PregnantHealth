package com.pregnant.health.net;

import android.text.TextUtils;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.pregnant.health.Constants;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.L;
import com.pregnant.health.utils.T;

import java.util.Map;
import java.util.Set;

/**
 * Created by cws on 2016/1/4.
 */
public class RequestUtils {

    public static void executeRequest(final String url, final Map<String, String> params, final CallbackListener listener) {
        executeRequest(url, params, null, listener);
    }

    /**
     * 执行请求
     *
     * @param url      请求url
     * @param params   请求参数
     * @param listener 监听
     * @param tag      标示
     */
    public static void executeRequest(final String url, final Map<String, String> params, Object tag, final CallbackListener listener) {
        executeRequest(Request.Method.POST, url, params, tag, listener);
    }

    public static void executeRequestGET(final String url, Object tag, final CallbackListener listener) {
        executeRequest(Request.Method.GET, url, null, tag, listener);
    }

    public static void executeRequest(int method, final String url, final Map<String, String> params, Object tag, final CallbackListener listener) {
        StringRequest request = new StringRequest(
                method,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String result) {
                        try {
                            L.i(result);
                            boolean flag = JSONUtils.getBoolean(result, Constants.RESULT_CODE);
                            if (flag) {
                                if (!TextUtils.isEmpty(result)) {
                                    // 成功
                                    listener.onSuccess(result);
                                }
                            } else {
                                // 失败
                                String resultDesc = JSONUtils.getString(result, Constants.RESULT_DESC);
                                String resultData = JSONUtils.getString(result, Constants.RESULT_DATA);

                                if (TextUtils.isEmpty(resultData)
                                        && !TextUtils.isEmpty(resultDesc)) {
                                    T.show(resultDesc);
                                }

                                listener.onFailure(resultData);
                            }
                        } catch (Exception e) {
                             L.e("err:" + e.getMessage());
                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        try {
                            String error = "error:" + volleyError.toString() + ":" + volleyError.getMessage();
//                            L.e(error);
                            T.show("服务器连接失败");
                            listener.onFailure(error);
                        } catch (Exception e) {
                            L.e(e.getMessage());
                        }
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                L.i("URL:" + url);
                if (params != null) {
                    Set<String> set = params.keySet();
                    for (String str : set) {
                        L.i("KEY=" + str + "; VALUE=" + params.get(str));
                    }
                }
                return params;
            }
        };
        RequestManager.addRequest(request, tag);
    }

    public static void cancelAll(String tag) {
        RequestManager.cancelAll(tag);
    }

}
