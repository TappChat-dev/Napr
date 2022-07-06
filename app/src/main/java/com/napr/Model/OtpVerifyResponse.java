package com.napr.Model;


import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.Keep;

@Keep
public class OtpVerifyResponse implements Parcelable {

    public OtpVerifyResponse() {
    }

    protected OtpVerifyResponse(Parcel in) {
        Status = in.readString();
        Details = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Status);
        dest.writeString(Details);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<OtpVerifyResponse> CREATOR = new Creator<OtpVerifyResponse>() {
        @Override
        public OtpVerifyResponse createFromParcel(Parcel in) {
            return new OtpVerifyResponse(in);
        }

        @Override
        public OtpVerifyResponse[] newArray(int size) {
            return new OtpVerifyResponse[size];
        }
    };

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    private String Status;

    private String Details;

}
