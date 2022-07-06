package com.napr.Network;

import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;


import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class RetrofitClient {


    public static  String PRODUCTION_TRANSTIONALURL = "https://2factor.in/API/";


//
    public static  String WEB_URL  = "https://www.cgmmssy.in/";    //Production
    public static  String PRODUCTION_URL = "https://www.cgmmssy.in/MobileMedicalUnit/";   // Production

//

//    public static  String PRODUCTION_URL = "http://103.133.215.182:8080/MobileMedicalUnitTest/";  // Testing
//    public static  String WEB_URL = "http://103.133.215.182:8080/MMUWeb/";  //Testing



    private static Retrofit retrofit;
    private static Retrofit retrofit1;
    private static Retrofit retrofit2;

    private static OkHttpClient client;


    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit =
                    new Retrofit.Builder()
                            .baseUrl(PRODUCTION_URL)
                            .addConverterFactory(getGsonConverterFactory())
                            .addConverterFactory(getXmlConverterFactory())
                            .client(getOkHttpClient())
                            .build();
        }
        return retrofit;
    }


    public static Retrofit getTransctionalOtp() {
        if (retrofit1 == null) {
            retrofit1 =
                    new Retrofit.Builder()
                            .baseUrl(PRODUCTION_TRANSTIONALURL)
                            .addConverterFactory(getGsonConverterFactory())
                            .addConverterFactory(getXmlConverterFactory())
                            .client(getOkHttpClient())
                            .build();
        }
        return retrofit1;
    }



    private static OkHttpClient getOkHttpClient() {
        if (client == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder()
                    .connectTimeout(90, TimeUnit.SECONDS)
                    .readTimeout(90, TimeUnit.SECONDS)
                    .writeTimeout(90, TimeUnit.SECONDS);

            client = builder.build();
        }
        return client;
    }




    public static Retrofit getClient1() {
        return getClient();
    }

    public static Retrofit getLoginClient() {
        return getClient1();
    }


    public static Converter.Factory getGsonConverterFactory() {
        return GsonConverterFactory.create(new GsonBuilder().disableHtmlEscaping().create());
    }

    public static Converter.Factory getXmlConverterFactory() {
        return SimpleXmlConverterFactory.create();
    }
}
