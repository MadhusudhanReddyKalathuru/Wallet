package com.wallet.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.wallet.adapter.CustomAdapter;

import net.simplifiedcoding.navigationdrawerexample.R;


/**
 * Created by Belal on 18/09/16.
 */


public class TransactionsFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    String[] countryNames = {"India", "China", "Australia", "Portugle", "America", "New Zealand"};
    int flags[] = {R.drawable.india, R.drawable.china, R.drawable.australia, R.drawable.portugle, R.drawable.america, R.drawable.new_zealand};
    EditText et1, et2;
    ImageButton btn;
    Button send_money_btn;
    TextView history;
    Context c;
    private static final String API_URL = "http://openexchangerates.org/api/latest.json?app_id=7706807cfebb438a9670ace80756b356";
   /* ArrayList<HashMap<String, Double>> rateList;*/

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.transactions_fragment, container, false);
        et1 = (EditText) v.findViewById(R.id.editText2);
        et2 = (EditText) v.findViewById(R.id.editText3);
        history=(TextView)v.findViewById(R.id.tran_histry);
        send_money_btn=(Button)v.findViewById(R.id.send_money_btn);

      /*  rateList = new ArrayList<>();*/
        Spinner spinner1 = (Spinner) v.findViewById(R.id.simpleSpinner1);
        spinner1.setOnItemSelectedListener(this);

        Spinner spinner2 = (Spinner) v.findViewById(R.id.simpleSpinner2);
        spinner2.setOnItemSelectedListener(this);

        CustomAdapter c = new CustomAdapter(getActivity(), flags, countryNames);
        CustomAdapter c1 = new CustomAdapter(getActivity(), flags, countryNames);

        spinner1.setAdapter(c);
        spinner2.setAdapter(c1);
       /* new jsoncurency().execute();*/
        return v;

    }

    //For Two Spinner Validations
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, final int position, long id) {

        final Spinner spinner = (Spinner) parent;
        if (spinner.getId() == R.id.simpleSpinner1) {
           /* Toast.makeText(getActivity(), countryNames[position], Toast.LENGTH_SHORT).show();*/
            if (position == 0) {
                et1.setHint("INR");

            } else if (position == 1) {
                et1.setHint("CNY");
            } else if (position == 2) {
                et1.setHint("AUD");
            } else if (position == 3) {
                et1.setHint("PDS");
            } else if (position == 4) {
                et1.setHint("USD");
            } else if (position == 5) {
                et1.setHint("NG");
            }
        } else if (spinner.getId() == R.id.simpleSpinner2) {
            if (position == 0) {
                et2.setHint("INR");
            } else if (position == 1) {
                et2.setHint("CNY");
            } else if (position == 2) {
                et2.setHint("AUD");
            } else if (position == 3) {
                et2.setHint("PDS");
            } else if (position == 4) {
                et2.setHint("USD");
            } else if (position == 5) {
                et2.setHint("NG");
            }
        }
        et2.setOnFocusChangeListener(new View.OnFocusChangeListener()
        {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (spinner.getId() == R.id.simpleSpinner2) {
                    if (position == 0) {
                        String sk=  et1.getText().toString();
                        Double d= Double.valueOf(sk);
                        Double o=63.87;
                        Double l=d*o;
                        et2.setText(""+l);
                        Toast.makeText(getContext(),"1$=63.87",Toast.LENGTH_SHORT).show();
                    } else if (position == 1) {
                        String sk=  et1.getText().toString();
                        Double d= Double.valueOf(sk);
                        Double o=6.43;
                        Double l=d*o;
                        et2.setText(""+l);
                    } else if (position == 2) {
                        String sk=  et1.getText().toString();
                        Double d= Double.valueOf(sk);
                        Double o=20.68;
                        Double l=d*o;
                        et2.setText(""+l);
                    } else if (position == 3) {
                        String sk=  et1.getText().toString();
                        Double d= Double.valueOf(sk);
                        Double o=10.28;
                        Double l=d*o;
                        et2.setText(""+l);
                    } else if (position == 4) {
                        String sk=  et1.getText().toString();
                        Double d= Double.valueOf(sk);
                        Double o=1.0;
                        Double l=d*o;
                        et2.setText(""+l);
                    } else if (position == 5) {
                        String sk=  et1.getText().toString();
                        Double d= Double.valueOf(sk);
                        Double o=20.28;
                        Double l=d*o;
                        et2.setText(""+l);
                    }
                }
            }
        });
        send_money_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String g= et2.getText().toString();
                history.setText(g);
            }
        });
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles

    }
    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Transactions");
    }
   /* private class jsoncurency extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... arg0) {
            HttpHandler httphandler = new HttpHandler();

            // Making a request to url and getting response
            String jsonStr = httphandler.makeServiceCall(API_URL);

            Log.e("From Trasaction", "Response from url: " + jsonStr);
            if (jsonStr != null) {
                try {
                    JSONObject jsonObj = new JSONObject(jsonStr);

                    // Getting JSON Array
                    JSONArray rates = jsonObj.getJSONArray("rates");
                    for (int i = 0; i < rates.length(); i++) {
                        JSONObject rat = rates.getJSONObject(i);
                        Double v1 = rat.getDouble("INR");
                        Double v2 = rat.getDouble("USD");
                        Double v3 = rat.getDouble("EUR");

                        HashMap<String, Double> rats = new HashMap<>();
                        rats.put("INR", v1);
                        rats.put("USD", v2);
                        rats.put("EUR", v3);
                        rateList.add(rats);
                        Log.d("From JsonObject", "doInBackground: "+rateList);
                    }
                } catch ( JSONException e) {
                    Toast.makeText(getContext(), "Json parsing error: " + e.getMessage(), Toast.LENGTH_LONG).show();
                }

            } else {
                Toast.makeText(getContext(), "Couldn't get json from server. Check LogCat for possible errors!", Toast.LENGTH_LONG).show();
            }

            return null;
        }
    }*/

}
