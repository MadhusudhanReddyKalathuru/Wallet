package com.wallet.main;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import net.simplifiedcoding.navigationdrawerexample.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by Madhusudhan Reddy on 7/25/2017.
 */

public class ForgotPwdActivity extends Activity
{
    Button btn_forgot;
    EditText editText11;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpwd_layout);
        btn_forgot=(Button)findViewById(R.id.btn_forgotpwd);
        editText11=(EditText)findViewById(R.id.editText11);
        btn_forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail= editText11.getText().toString();
                final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                Pattern pattern = Pattern.compile(EMAIL_PATTERN);
                Matcher matcher = pattern.matcher(mail);
                if (matcher.matches())
                {
                 Toast.makeText(ForgotPwdActivity.this,"correct",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(ForgotPwdActivity.this,"Enter Correct Mail Id",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
