package com.example.myapplication.Lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.myapplication.R;

public class SpinnerLab extends AppCompatActivity {

    private Spinner sp;
    private Button btn;
    private ImageView iv;
    private String[] user = {"User 1", "User 2", "User 3", "User 4"};
    private int[] users = {R.drawable.person1, R.drawable.person3, R.drawable.slide1, R.drawable.slidee3};
    private ArrayAdapter adapter;

    public SpinnerLab() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_lab);

        sp = (Spinner) findViewById(R.id.sp);
        btn = (Button) findViewById(R.id.btn);
        iv = (ImageView) findViewById(R.id.iv);
        adapter = new ArrayAdapter(
                this,android.R.layout.simple_spinner_item, user
        );
        sp.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = sp.getSelectedItemPosition();
                iv.setImageResource(users[pos]);
            }
        });
    }
}