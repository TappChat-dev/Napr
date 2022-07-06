package com.napr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.napr.ProectUtil.ProjectUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity{

    @BindView(R.id.et_login_no)
    TextInputEditText et_login_no;

    @BindView(R.id.login_button)
    MaterialButton login_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        ButterKnife.bind((Activity) this);
        /*Window window = getWindow();
        View yourView = window.getDecorView();
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.DONUT) {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(getResources().getColor(R.color.primary_material_light));
            if (yourView != null) {
                yourView.setSystemUiVisibility(0);
            }
        }*/

        login_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (et_login_no.getText().toString().equalsIgnoreCase("")) {
                    ProjectUtil.customToast(MyApplication.getInstance().getApplicationContext(), "Please Enter Mobile Number");
                } else {
                    startActivity(new Intent(LoginActivity.this, VerifyOTPActivity.class));
                    overridePendingTransition(R.anim.in_from_left,R.anim.out_to_right);
                    finish();

                }
            }
        });
    }
}