package com.napr.Network;

import androidx.annotation.Keep;

import com.napr.Model.LoginRequest;
import com.napr.Model.LoginResponse;
import com.napr.Model.OtpResponse;
import com.napr.Model.VerifyOtpOnlyResponse;

import java.util.Map;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;


@Keep
public interface APIService {


    @Headers({"Accept: application/json"})
    @POST("admin/verfyOtp")
    Call<VerifyOtpOnlyResponse> verfyOtp(@Header("Content-Type") String content_type, @Body LoginRequest loginRequest);

    @Headers({"Accept: application/json"})
    @GET("{mobileNo}/AUTOGEN/MMULOGIN")
    Call<OtpResponse> sendLogintOtp(@Path("mobileNo") String mobileNo);



    @Headers({"Accept: application/json"})
    @POST("admin/login")
    Call<LoginResponse> doLoginWeb(@Header("Content-Type") String content_type, @Body LoginRequest loginRequest);


}
