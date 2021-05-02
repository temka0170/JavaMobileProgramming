package com.example.myapplication.Midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

public class GalleryInfo extends AppCompatActivity {

    private ImageView iv;
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_info);
        Bundle bundle = getIntent().getExtras();
        iv = (ImageView) findViewById(R.id.iv);
        name = (TextView) findViewById(R.id.name);
        iv.setImageResource(bundle.getInt("png"));
        name.setText(bundle.getString("info"));
    }
}