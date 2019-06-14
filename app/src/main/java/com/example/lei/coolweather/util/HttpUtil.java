package com.example.lei.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 从服务端获取全国所有省市县的数据
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
