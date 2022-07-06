package com.napr.Model;


import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.Keep;

@Keep
public class OtpResponse implements Parcelable {


    protected OtpResponse(Parcel in) {
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

    public static final Creator<OtpResponse> CREATOR = new Creator<OtpResponse>() {
        @Override
        public OtpResponse createFromParcel(Parcel in) {
            return new OtpResponse(in);
        }

        @Override
        public OtpResponse[] newArray(int size) {
            return new OtpResponse[size];
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
