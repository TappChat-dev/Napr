package com.napr.Network.Presenter.VerifyOnlyOtp;

import static android.content.ContentValues.TAG;

import android.util.Log;


import com.napr.Model.LoginRequest;
import com.napr.Model.VerifyOtpOnlyResponse;
import com.napr.MyApplication;
import com.napr.Network.APIService;
import com.napr.Network.Interactor.LoadListener;
import com.napr.Network.Interactor.MainInteractor;
import com.napr.Network.RetrofitClient;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class VerifyOtpOnlyPresenter implements MainInteractor {

    private  String otp1;
    private  String mobileNo1;

    public VerifyOtpOnlyPresenter(@NotNull String mobileNo, @NotNull String otp) {
        otp1 = otp;
        mobileNo1 = mobileNo;
    }

    @Override
    public void loadItems(final LoadListener<Object> loadListener) {
        try {

            LoginRequest loginRequest = new LoginRequest();
            loginRequest.setUsername(mobileNo1);
            loginRequest.setOtp(otp1);


            Map<String, String> params = new HashMap<String, String>();
            params.put("key", "2614C35C9E9BDF");
            params.put("otp", otp1);


            APIService posApiInterface = RetrofitClient.getClient().create(APIService.class);
            Call<VerifyOtpOnlyResponse> call = posApiInterface.verfyOtp("application/json",loginRequest);
            call.enqueue(new Callback<VerifyOtpOnlyResponse>() {
                @Override
                public void onResponse(Call<VerifyOtpOnlyResponse> call, Response<VerifyOtpOnlyResponse> response) {

                    if(response.code() == 200) {
                        loadListener.onSuccess(response.body());
                    }else{

                            loadListener.onAuthFailer("Invalid OTP" );

                    }
                }

                @Override
                public void onFailure(Call<VerifyOtpOnlyResponse> call, Throwable t) {
                    Log.e(TAG, "Success");
                    loadListener.onFailure("Invalid OTP");
                }
            });
        } catch (Exception e) {
            loadListener.onFailure("Internal Server Error");
            e.printStackTrace();
        }
    }


}
