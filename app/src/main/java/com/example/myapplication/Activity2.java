package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Bundle bundle = getIntent().getExtras();
        tv2 = (TextView) findViewById(R.id.tv2);
        tv2.setText(bundle.getString("data"));
    }
}