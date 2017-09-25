package com.wallet.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import net.simplifiedcoding.navigationdrawerexample.R;

/**
 * Created by Madhusudhan Reddy on 8/9/2017.
 */

public class RecepitentDetails extends AppCompatActivity {
    Button b;
    ImageView iv;
    public static final String MY_PREFS_NAME = "MyPrefsFile";
    EditText recep_fname,recep_lname,recep_mail,recep_number;
    private static int RESULT_LOAD_IMAGE = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recep2);
        b = (Button) findViewById(R.id.button2);
        iv = (ImageView) findViewById(R.id.recepitentpic);
        recep_fname=(EditText)findViewById(R.id.recep_fname);
        recep_lname=(EditText)findViewById(R.id.recep_lname);
        recep_mail=(EditText)findViewById(R.id.recep_mail);
        recep_number=(EditText)findViewById(R.id.recep_number);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String v1= recep_fname.getText().toString();
                String v2=recep_lname.getText().toString();
                String v3=recep_mail.getText().toString();
                String v4=recep_number.getText().toString();

                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
                editor.putString("fname", v1);
                editor.putString("lname", v2);
                editor.putString("mail",v3);
                editor.putString("number",v4);
                editor.commit();


                Intent intent = new Intent(RecepitentDetails.this, FillReciptent.class);
                startActivity(intent);
            }
        });
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

                startActivityForResult(i, RESULT_LOAD_IMAGE);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath = cursor.getString(columnIndex);
            cursor.close();

            iv.setImageBitmap(BitmapFactory.decodeFile(picturePath));

        }

    }
}