package com.example.myapplication.Midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

public class RegisterInfo extends AppCompatActivity {

    private TextView name,age,uni,dep,year,height,weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_info);

        Bundle bundle = getIntent().getExtras();
        name = (TextView) findViewById(R.id.name);
        age = (TextView) findViewById(R.id.age);
        uni = (TextView) findViewById(R.id.uni);
        dep = (TextView) findViewById(R.id.dep);
        year = (TextView) findViewById(R.id.year);
        height = (TextView) findViewById(R.id.height);
        weight = (TextView) findViewById(R.id.weight);

        name.append(bundle.getString("name"));
        age.append(bundle.getString("age"));
        uni.append(bundle.getString("uni"));
        dep.append(bundle.getString("dep"));
        year.append(bundle.getString("year"));
        height.append(bundle.getString("height"));
        weight.append(bundle.getString("weight"));

    }
}