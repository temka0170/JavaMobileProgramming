package com.example.myapplication.Lesson4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.example.myapplication.Activity1;
import com.example.myapplication.Activity2;
import com.example.myapplication.R;

public class Lab5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab5);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_lab, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.item1:
                Intent i = new Intent(
                        Lab5.this,
                        Intro.class
                );
                startActivity(i);
                return true;
            case R.id.item2:
                Intent p = new Intent(
                        Lab5.this,
                        Plan.class
                );
                startActivity(p);
                return true;
            case R.id.item3:
                Intent c = new Intent(
                        Lab5.this,
                        Course.class
                );
                startActivity(c);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}