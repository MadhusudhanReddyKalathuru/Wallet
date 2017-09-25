package com.wallet.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import net.simplifiedcoding.navigationdrawerexample.R;


/**
 * Created by Madhusudhan Reddy on 8/8/2017.
 */

public class AddRecepitent extends AppCompatActivity
{
    Button addreciptent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recep1);
        addreciptent=(Button)findViewById(R.id.addrecepitent);
        addreciptent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AddRecepitent.this,RecepitentDetails.class);
                startActivity(i);
            }
        });

    }
}