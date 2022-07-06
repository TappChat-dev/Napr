package com.napr.Model;


import androidx.annotation.Keep;

import java.io.Serializable;

@Keep
public class VerifyOtpOnlyResponse implements Serializable {


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return message;
    }

    public void setMsg(String msg) {
        this.message = msg;
    }

    private String status;
    private String message;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }





}
