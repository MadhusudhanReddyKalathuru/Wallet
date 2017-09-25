package com.wallet.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.wallet.adapter.CustomAdapter;

import net.simplifiedcoding.navigationdrawerexample.R;

/**
 * Created by Madhusudhan Reddy on 8/9/2017.
 */

public class FillReciptent extends AppCompatActivity
{
    String[] countryNames={"India ","China","Australia","Portugle","America","New Zealand"};
    int flags[] = {R.drawable.india, R.drawable.china, R.drawable.australia, R.drawable.portugle, R.drawable.america, R.drawable.new_zealand};
    Spinner spinner;
Button btn_rep2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recip3);
        btn_rep2=(Button)findViewById(R.id.rep_btn2);
        spinner =(Spinner)findViewById(R.id.countryspinner);
        CustomAdapter c = new CustomAdapter(FillReciptent.this, flags, countryNames);
        spinner.setAdapter(c);


        btn_rep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FillReciptent.this,Gender.class);
                startActivity(intent);
            }
        });

    }
}
