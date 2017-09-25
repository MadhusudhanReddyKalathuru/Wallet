package com.wallet.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import net.simplifiedcoding.navigationdrawerexample.R;

/**
 * Created by Madhusudhan Reddy on 8/14/2017.
 */

public class BankDetails extends AppCompatActivity
{
    Button save;
    String[] countryNames={"Axis Bank","Andhra Bank","Canara Bank","State Bank Of India"};
    int flags[] = {R.drawable.a, R.drawable.andhra, R.drawable.canara, R.drawable.sbi};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bankdetails);
        save=(Button)findViewById(R.id.btn_save);
/*
        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner1);
        CustomAdapter c = new CustomAdapter(BankDetails.this, flags, countryNames);
        spin.setAdapter(c);*/

save.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(BankDetails.this,RcepitentsList.class);
        startActivity(intent);
    }
});

    }
}
