package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    private Button btn;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        btn = (Button) findViewById(R.id.btn);
        tv1 = (TextView) findViewById(R.id.tv1);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(
                        Activity1.this,
                        Activity2.class
                );
                i.putExtra("data", tv1.getText().toString());
                startActivity(i);
            }
        });
    }
}