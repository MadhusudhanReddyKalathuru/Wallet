package com.wallet.main;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
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
import com.wallet.model.UserRegistrationBean;

import net.simplifiedcoding.navigationdrawerexample.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.simplifiedcoding.navigationdrawerexample.R.id.edit_firstname;
import static net.simplifiedcoding.navigationdrawerexample.R.id.edit_lastname;


public class SignupActivity extends Activity {
    private static final String TAG = "SignupActivity";
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    TextView signin,txt_dob;
    Button createaccount;
    EditText edit_fname,edit_lname,edit_email,edit_pwd,edit_dob;

    //Office Ip Address
    String URL = "http://192.168.2.110:3001/Wallet/rest/MyService/register";
    //  Room Ip Address
   /* String URL = "http://192.168.0.10:2001/Wallet/rest/MyService/register";*/
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout);
        createaccount = (Button) findViewById(R.id.btn_createaccount);
        signin=(TextView)findViewById(R.id.txt_signtext4);

        //Intilizing View Components

        edit_fname=(EditText)findViewById(edit_firstname);
        edit_lname=(EditText)findViewById(edit_lastname);
        edit_email=(EditText)findViewById(R.id.edit_emailid);
        edit_pwd=(EditText)findViewById(R.id.edit_password);
        edit_dob=(EditText)findViewById(R.id.edit_dateofbirth);

        //Date Of Birth
        edit_dob.setOnFocusChangeListener(new View.OnFocusChangeListener()
        {
            @Override
            public void onFocusChange(View v, boolean hasFocus)
            {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dialog = new DatePickerDialog(SignupActivity.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth, mDateSetListener,year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });
        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG, "onDateSet: dd/mm/yyy: " + day + "/" + month + "/" + year);
                String date = day + "/" + month + "/" + year;
                edit_dob.setInputType(InputType.TYPE_NULL);
                edit_dob.setText(date);
            }
        };
        //User Account Creation
        createaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringRequest request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>(){
                    @Override
                    public void onResponse(String s) {
                        if(s.equals("true")){
                            String v1=  edit_fname.getText().toString();
                            String v2= edit_lname.getText().toString();
                            String v3=edit_email.getText().toString();
                            String v4= edit_pwd.getText().toString();
                            String v5=edit_dob.getText().toString();

//Getting values from user inputs and set into UserRegistrationBean Object
                            UserRegistrationBean ub=new UserRegistrationBean();
                            ub.setFirstname(v1);
                            ub.setLastname(v2);
                            ub.setMailid(v3);
                            ub.setPwd(v4);
                            ub.setDob(v5);
 //For Date
                            Date currentdate = new Date();
                            SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy 'at' hh:mm:ss a");
                            ub.setCreateddate(ft.format(currentdate));

//Form Validation

                            String mail= edit_email.getText().toString();
                            final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                            Pattern pattern = Pattern.compile(EMAIL_PATTERN);
                            Matcher matcher = pattern.matcher(mail);

                            if (v1.equals(""))
                            {
                                edit_fname.requestFocus();
                                Toast.makeText(SignupActivity.this,"Please Enter Your First Name",Toast.LENGTH_LONG).show();
                            }
                            else  if (v2.equals(""))
                            {
                                edit_lname.requestFocus();
                                Toast.makeText(SignupActivity.this,"Please Enter Your Last Name",Toast.LENGTH_LONG).show();
                            }
                            else  if (v3.equals(""))
                            {
                                if (matcher.matches())
                                {
                                    edit_email.requestFocus();
                                }
                                else
                                {
                                    Toast.makeText(SignupActivity.this,"Please Enter correct MailId",Toast.LENGTH_LONG).show();
                                }
                                Toast.makeText(SignupActivity.this,"Please Enter Your Mail",Toast.LENGTH_LONG).show();
                            }
                            else  if (v4.equals(""))
                            {
                                edit_pwd.requestFocus();
                                Toast.makeText(SignupActivity.this,"Please Enter Your Password",Toast.LENGTH_LONG).show();
                            }
                            else  if (v5.equals(""))
                            {
                                edit_dob.requestFocus();
                                Toast.makeText(SignupActivity.this,"Please Enter Your DateOfBirth",Toast.LENGTH_LONG).show();
                            }
                            else{

                                   /* EmailSender emailSender = new EmailSender();
                                    emailSender.sendRegistrationEmail(ub.getFirstname(),ub.getMailid(),
                                            "Successfully registered with Wallet");*/


                                Toast.makeText(SignupActivity.this, "Registration Successful", Toast.LENGTH_LONG).show();
                                Intent intent=new Intent(SignupActivity.this,SignInActivity.class);
                                startActivity(intent);
                                edit_fname.setText("");
                                edit_lname.setText("");
                                edit_email.setText("");
                                edit_pwd.setText("");
                                edit_dob.setText("");
                            }

                        }
                        else{
                            Toast.makeText(SignupActivity.this, "Can't Register", Toast.LENGTH_LONG).show();
                        }
                    }
                },new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        Toast.makeText(SignupActivity.this, "Please Start Your Eclipse Appache Server or Change port Number", Toast.LENGTH_LONG).show();;
                    }
                })
                {
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError
                    {
                        Date currentdate = new Date();
                        SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy 'at' hh:mm:ss a");

                        Map<String, String> parameters = new HashMap<String, String>();
                        parameters.put("First_Name", edit_fname.getText().toString());
                        parameters.put("Last_Name", edit_lname.getText().toString());
                        parameters.put("Mail_ID",edit_email.getText().toString());
                        parameters.put("Password",edit_pwd.getText().toString());
                        parameters.put("Date_Of_Birth",edit_dob.getText().toString());
                        parameters.put("Created_Date",ft.format(currentdate));
                        return parameters;
                    }
                };
                RequestQueue rQueue = Volley.newRequestQueue(SignupActivity.this);
                rQueue.add(request);
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignupActivity.this,SignInActivity.class);
                startActivity(intent);
            }
        });

    }

}

