package com.napr.Model;


import androidx.annotation.Keep;

import java.io.Serializable;
import java.util.ArrayList;

@Keep
public class VerifyOtpResponse implements Serializable {


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
