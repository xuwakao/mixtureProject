package com.xuwakao.mixture.httpmodule;

/**
 * Created by xujiexing on 13-9-4.
 */
public abstract class HttpAbsResult {

    public enum HttpResultCode {
        SUCCESS, CANCELED, EXCEPTIONAL;
    }

    public static HttpResultCode resultCode;
    public static String url;
    public static Exception exception;
}
