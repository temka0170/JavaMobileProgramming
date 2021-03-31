package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = (EditText) findViewById(R.id.getName);
        EditText phone = (EditText) findViewById(R.id.getPhone);
        EditText address = (EditText) findViewById(R.id.getAddress);
        TextView setName = (TextView) findViewById(R.id.setName);
        TextView setPhone = (TextView) findViewById(R.id.setPhone);
        TextView setAddress = (TextView) findViewById(R.id.setAddress);
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = name.getText().toString();
                String userPhone = phone.getText().toString();
                String userAddress = address.getText().toString();
                setName.setText(userName);
                setPhone.setText(userPhone);
                setAddress.setText(userAddress);
            }
        });
//        LinearLayout left = (LinearLayout) findViewById(R.id.lLayout);
//        LinearLayout right = (LinearLayout) findViewById(R.id.rLayout);
//        LinearLayout bottom = (LinearLayout) findViewById(R.id.bLayout);
//        Button bLeft = (Button) findViewById(R.id.left);
//        Button bRight = (Button) findViewById(R.id.right);
//        Button bBot = (Button) findViewById(R.id.bottom);
//        bLeft.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Random rnd = new Random();
//                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
//                left.setBackgroundColor(color);
//            }
//        });
//        bRight.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Random rnd = new Random();
//                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
//                right.setBackgroundColor(color);
//            }
//        });
//        bBot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Random rnd = new Random();
//                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
//                bottom.setBackgroundColor(color);
//            }
//        });
    }
}