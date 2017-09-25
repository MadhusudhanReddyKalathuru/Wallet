package com.wallet.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.wallet.activity.Analytics;
import com.wallet.activity.ChangePassword;
import com.wallet.activity.MyAccount;
import com.wallet.activity.Pin;
import com.wallet.main.SignInActivity;

import net.simplifiedcoding.navigationdrawerexample.R;

/**
 * Created by Belal on 18/09/16.
 */


public class SettingsFragment extends Fragment  {

Context context;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.settings_fragment, container, false);
        context = rootView.getContext(); // Assign your rootView to context

        Button b1 = (Button) rootView.findViewById(R.id.btn_myaccount);
        Button b2=(Button)rootView.findViewById(R.id.btn_changepwd);
        Button b3=(Button)rootView.findViewById(R.id.btn_pin);
        Button b4=(Button)rootView.findViewById(R.id.btn_anylitics);
        Button b5=(Button)rootView.findViewById(R.id.logout);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, MyAccount.class);
                startActivity(intent);
            }
        });

       b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(context, ChangePassword.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, Pin.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, Analytics.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, SignInActivity.class);
                startActivity(intent);
            }
        });
        return rootView;


    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles

    }
    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Settings");
    }

}