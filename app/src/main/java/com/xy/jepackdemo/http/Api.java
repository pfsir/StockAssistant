package com.xy.jepackdemo.http;

import android.text.TextUtils;


import com.xy.jepackdemo.common.LogUtil;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author oy
 * @date 2019/4/1.
 * description 封装的单例的retrofit
 */
public class Api {
    private static final String TAG = "API-";
    private static Api api = new Api();

    private Api() {
    }

    public static Api getInstance() {
        return api;
    }

    private <T> T createRetrofit(String baseUrl, Class<T> reqServer) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        //1.新建log拦截器
        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.BODY;
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {

            @Override
            public void log(String message) {
                if ((message.startsWith("--> GET") || message.startsWith("--> POST"))) {
                    LogUtil.v(TAG, message);
                }
                if (message.startsWith("<--") && !message.contains("END HTTP")) {
                    LogUtil.v(TAG, message);
                }
                // 2.以{}或者[]形式的说明是响应结果的json数据(1024个字符以内)
                int maxLength = 4 * 1024;
                boolean isJson = (message.startsWith("{") && message.endsWith("}")) || (message.startsWith("[") && message.endsWith("]"));
                if (isJson && message.length() <= maxLength) {
                    LogUtil.v(TAG, message);
                }
            }
        });
        loggingInterceptor.setLevel(level);
        //添加retrofit日志打印
        builder.addNetworkInterceptor(loggingInterceptor);

        //2.请求头拦截器
        builder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                long startNs = System.nanoTime();
                Request original = chain.request();

                Request.Builder requestBuilder = original.newBuilder();
                Request request = requestBuilder.build();
                Response proceed = chain.proceed(request);
                long tookMs = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startNs);
                LogUtil.d(TAG, request.url() + "耗时:" + tookMs + "ms");
                return proceed;
            }
        });

        //3.设置超时和重连
        builder.connectTimeout(120, TimeUnit.SECONDS);
        builder.readTimeout(120, TimeUnit.SECONDS);
        builder.writeTimeout(120, TimeUnit.SECONDS);
        //错误重连
        //builder.retryOnConnectionFailure(true);
        OkHttpClient client = builder.build();
        //基础url
        String apiUrl = TextUtils.isEmpty(baseUrl) ? ApiUrl.JSL_BASE_URL : baseUrl;
        return new Retrofit.Builder()
                .baseUrl(apiUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build()
                .create(reqServer);
    }

    public static <T> T getRetrofitApi(String baseUrl, Class<T> responseApi) {
        return Api.getInstance().createRetrofit(baseUrl, responseApi);
    }

}
