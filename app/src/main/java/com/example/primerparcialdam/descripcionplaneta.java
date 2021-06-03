package com.example.primerparcialdam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class descripcionplaneta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcionplaneta);
        TextView titulo= (TextView) findViewById(R.id.tvdescrip);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        if(b!=null)
        {
            titulo.setText(b.getString("TIT"));
        }
        }
    }

