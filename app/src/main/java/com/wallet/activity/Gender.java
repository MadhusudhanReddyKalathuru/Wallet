package com.wallet.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import net.simplifiedcoding.navigationdrawerexample.R;

/**
 * Created by Madhusudhan Reddy on 8/13/2017.
 */

public class Gender extends AppCompatActivity
{
    Button btn_gender;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gender);
        btn_gender=(Button)findViewById(R.id.btn_gender);

        btn_gender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Gender.this,BankDetails.class);
                startActivity(intent);
            }
        });
    }
}
