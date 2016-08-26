package com.pregnant.health.net;

/**
 * Created by cws on 2015/11/26.
 */
public interface CallbackListener {
    /**
     * 请求的响应结果为成功时调用
     * @param data  返回的数据
     */
//    public void onSuccess(T data);
    public void onSuccess(String data);

    /**
     * 请求的响应结果为失败时调用
     * @param errorCode 错误码
     * @param message    错误信息
     */
//    public void onFailure(String errorCode, String message);
    public void onFailure(String data);
}
