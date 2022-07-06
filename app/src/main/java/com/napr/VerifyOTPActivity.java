package com.napr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.napr.ProectUtil.ProjectUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VerifyOTPActivity extends AppCompatActivity {

    @BindView(R.id.et_otp)
    EditText et_otp;

    @BindView(R.id.verify_otp_button)
    MaterialButton verify_otp_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_otp);
        ButterKnife.bind((Activity) this);

        verify_otp_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (et_otp.getText().toString().equalsIgnoreCase("")) {
                    ProjectUtil.customToast(MyApplication.getInstance().getApplicationContext(), "Please Enter OTP");
                } else {
                    startActivity(new Intent(VerifyOTPActivity.this, MainActivity.class));
                    overridePendingTransition(R.anim.in_from_left,R.anim.out_to_right);
                    finish();

                }
            }
        });
    }
}