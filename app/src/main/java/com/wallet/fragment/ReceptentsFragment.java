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

import com.wallet.activity.RecepitentDetails;

import net.simplifiedcoding.navigationdrawerexample.R;


/**
 * Created by Belal on 18/09/16.
 */


public class ReceptentsFragment extends Fragment {

    Context context;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.recep1, container, false);
        context = rootView.getContext(); // Assign your rootView to context

        Button b = (Button) rootView.findViewById(R.id.addrecepitent);

        b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            //Pass the context and the Activity class you need to open from the Fragment Class, to the Intent
            Intent intent = new Intent(context, RecepitentDetails.class);
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
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Receptents");
    }
}