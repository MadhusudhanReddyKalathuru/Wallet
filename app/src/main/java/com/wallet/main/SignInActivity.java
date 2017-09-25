package com.wallet.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.wallet.MainActivity;

import net.simplifiedcoding.navigationdrawerexample.R;

import java.util.HashMap;
import java.util.Map;

import static android.content.ContentValues.TAG;

/**
 * Created by Madhusudhan Reddy on 7/25/2017.
 */

public class SignInActivity extends Activity
{
    TextView txt_createaccountt,txt_password;
    Button signin;
    EditText edit_mail,edit_pwd;

//Office Ip Address
 /* String URL = "http://192.168.0.103:3001/Wallet/rest/MyService/login";*/
//Room Ip Address
   String URL = "http://192.168.2.110:3001/Wallet/rest/MyService/login";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_layout);
        signin=(Button)findViewById(R.id.btn_sign);
        txt_password=(TextView)findViewById(R.id.txt_forgotpwd);
        txt_createaccountt=(TextView)findViewById(R.id.txt_createaccount);
        edit_mail=(EditText)findViewById(R.id.edit_emailid);
        edit_pwd=(EditText)findViewById(R.id.edit_password);

//SignIn Process Here I m Using Volly Library For Accessing Restfull Webservices
        signin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                StringRequest request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String s)
                    {
                        if(s.equals("true"))
                        {
                            Toast.makeText(SignInActivity.this, "Login Success", Toast.LENGTH_LONG).show();
                            Intent i = new Intent(SignInActivity.this, MainActivity.class);
                            startActivity(i);

                            //After Login Clean Login Layout Fields
                            edit_mail.setText("");
                            edit_pwd.setText("");

                        }
                        else
                            {
                            Toast.makeText(SignInActivity.this, "Incorrect Details", Toast.LENGTH_LONG).show();
                        }
                    }
                },new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError volleyError)
                    {
                        Toast.makeText(SignInActivity.this, "Please Start Your Eclipse Appache Server or Change port Number", Toast.LENGTH_LONG).show();;
                    }
                })  {
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError
                    {
                        Map<String, String> parameters = new HashMap<String, String>();
                        parameters.put("Mail_ID", edit_mail.getText().toString());
                        parameters.put("Password", edit_pwd.getText().toString());
                        Log.d(TAG, "getParams: "+parameters);
                        return parameters;

                    }
                };
                RequestQueue rQueue = Volley.newRequestQueue(SignInActivity.this);
                rQueue.add(request);
            }
        });

        txt_password.setOnClickListener(new View.OnClickListener()
           {
             @Override
             public void onClick(View v)
             {
                Intent intent=new Intent(SignInActivity.this,ForgotPwdActivity.class);
                startActivity(intent);
             }
           });
        txt_createaccountt.setOnClickListener(new View.OnClickListener()
         {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(SignInActivity.this,SignupActivity.class);
                startActivity(intent);
            }
         });
    }

}