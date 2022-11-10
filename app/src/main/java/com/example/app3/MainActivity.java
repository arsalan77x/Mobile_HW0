package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCall = findViewById(R.id.callButton);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView phoneNumber = findViewById(R.id.textView18);
        buttonCall.setOnClickListener(new View.OnClickListener() {
               @Override
            public void onClick(View v) {
               Intent intent = new Intent(Intent.ACTION_DIAL);
               intent.setData(Uri.parse("tel:"+phoneNumber.getText()));
               startActivity(intent);

           }
          });

    }






}