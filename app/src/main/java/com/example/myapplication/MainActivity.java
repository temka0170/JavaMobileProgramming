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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RadioButton se,ss,cs,ib;
    private CheckBox web,java,mobile,ai;
    private TextView setClass, setLesson;
    ArrayList<String> lesson;
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
        se = (RadioButton) findViewById(R.id.se);
        ss = (RadioButton) findViewById(R.id.ss);
        cs = (RadioButton) findViewById(R.id.cs);
        ib = (RadioButton) findViewById(R.id.ib);
        web = (CheckBox) findViewById(R.id.web);
        java = (CheckBox) findViewById(R.id.java);
        mobile = (CheckBox) findViewById(R.id.mobile);
        ai = (CheckBox) findViewById(R.id.ai);
        setClass = (TextView) findViewById(R.id.setClass);
        setLesson = (TextView) findViewById(R.id.setLesson);
        lesson = new ArrayList<String>();
        Button btn = (Button) findViewById(R.id.btn);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(web.isChecked()) lesson.add("Web");
                else lesson.remove("Web");
            }
        });
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(java.isChecked()) lesson.add("Java");
                else lesson.remove("Java");
            }
        });
        mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mobile.isChecked()) lesson.add("Mobile");
                else lesson.remove("Mobile");
            }
        });
        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ai.isChecked()) lesson.add("AI");
                else lesson.remove("AI");
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb = new StringBuilder();
                for(String txt: lesson)
                    sb.append(txt).append(", ");
                setLesson.setText(sb.toString());
                String userName = name.getText().toString();
                String userPhone = phone.getText().toString();
                String userAddress = address.getText().toString();
                if(se.isChecked()){
                    setClass.setText("Software Engineering");
                } else if(ss.isChecked()){
                    setClass.setText("System Security");
                } else if(cs.isChecked()){
                    setClass.setText("Computer Science");
                } else if(ib.isChecked()){
                    setClass.setText("Internet Business");
                }
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