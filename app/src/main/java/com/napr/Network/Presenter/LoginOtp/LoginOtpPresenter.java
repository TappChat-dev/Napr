package com.napr.Network.Presenter.LoginOtp;

import static android.content.ContentValues.TAG;

import android.util.Log;

import com.napr.Model.OtpResponse;
import com.napr.Network.APIService;
import com.napr.Network.Interactor.LoadListener;
import com.napr.Network.Interactor.MainInteractor;
import com.napr.Network.RetrofitClient;

import org.jetbrains.annotations.NotNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginOtpPresenter implements MainInteractor {

    private  String mobileNo1;


    public LoginOtpPresenter(@NotNull String mobileNo) {
        mobileNo1 = mobileNo;
    }

    @Override
    public void loadItems(final LoadListener<Object> loadListener) {
        try {


            APIService posApiInterface = RetrofitClient.getClient().create(APIService.class);
            Call<OtpResponse> call = posApiInterface.sendLogintOtp(mobileNo1);

            call.enqueue(new Callback<OtpResponse>() {
                @Override
                public void onResponse(Call<OtpResponse> call, Response<OtpResponse> response) {

                    try {
                        loadListener.onSuccess(response.body());
                    }catch (Exception e){
                        loadListener.onFailure("");
                    }


                }

                @Override
                public void onFailure(Call<OtpResponse> call, Throwable t) {
                    Log.e(TAG, "Success");
                    loadListener.onFailure("" + t.getMessage());
                }
            });
        } catch (Exception e) {
            loadListener.onFailure("Internal Server Error");
            e.printStackTrace();
        }
    }


}
