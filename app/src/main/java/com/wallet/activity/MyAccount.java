package com.wallet.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import net.simplifiedcoding.navigationdrawerexample.R;

import static com.wallet.activity.RecepitentDetails.MY_PREFS_NAME;

/**
 * Created by Madhusudhan Reddy on 8/4/2017.
 */

public class  MyAccount extends AppCompatActivity
{
    EditText ed1,ed2,ed3,ed4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myaccount);
        ed1=(EditText)findViewById(R.id.myaccount_et1);
        ed2=(EditText)findViewById(R.id.myaccount_et2);
        ed3=(EditText)findViewById(R.id.myaccount_et3);
        ed4=(EditText)findViewById(R.id.myaccount_et6);


        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        String restoredText = prefs.getString("text", null);
        if (restoredText != null) {
            String fname = prefs.getString("fname", "");
            String lname = prefs.getString("lname", "");
            String mail= prefs.getString("mail","");
            String number=prefs.getString("number","");

            ed1.setText(fname);
            ed2.setText(lname);
            ed3.setText(mail);
            ed4.setText(number);



        }





    }
}