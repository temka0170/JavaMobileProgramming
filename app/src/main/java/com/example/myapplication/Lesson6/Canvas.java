package com.example.myapplication.Lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

public class Canvas extends AppCompatActivity {
    private ImageView iv;
    private TextView name,population;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        Bundle bundle = getIntent().getExtras();
        iv = (ImageView) findViewById(R.id.iv);
        name = (TextView) findViewById(R.id.name);
        population = (TextView) findViewById(R.id.population);
        iv.setImageResource(bundle.getInt("png"));
        name.setText(bundle.getString("name"));
        population.setText(bundle.getString("population"));
    }
}