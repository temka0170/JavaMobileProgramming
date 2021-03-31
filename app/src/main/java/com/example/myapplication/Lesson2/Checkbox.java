//package com.example.myapplication.Lesson2;
//
//import android.graphics.Color;
//import android.os.Bundle;
//
//import com.example.myapplication.Lesson2.*;
//import com.example.myapplication.R;
//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.snackbar.Snackbar;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
//
//import android.view.View;
//
//import android.view.Menu;
//import android.view.MenuItem;
//import android.widget.Button;
//import android.widget.CheckBox;
//import android.widget.EditText;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import java.util.Random;
//
//public class Checkbox extends AppCompatActivity {
//
//    private CheckBox chAndroid, chWeb, chJava;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.lesson02_checkbox);
//
//        chAndroid = (CheckBox) findViewById(R.id.chAndroid);
//        chWeb = (CheckBox) findViewById(R.id.chWeb);
//        chJava = (CheckBox) findViewById(R.id.chJava);
//
//        chAndroid.setOnClickListener(new View.onClickListener(){
//            @Override
//            public void onClick(View v){
//                if(chWeb.isChecked()){
//                    chWeb.setChecked(false);
//                }
//                if(chJava.isChecked()){
//                    chJava.setChecked(false);
//                }
//                if(chAndroid.isChecked()){
//                    Toast.makeText(Checkbox.this, "Android", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//        chWeb.setOnClickListener(new View.onClickListener() {
//            @Override
//            public void onClick(View v){
//                if(chAndroid.isChecked()){
//                    chAndroid.setChecked(false);
//                }
//                if(chJava.isChecked()){
//                    chJava.setChecked(false);
//                }
//                if(chWeb.isChecked()){
//                    Toast.makeText(Checkbox.this, "Web", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//        chJava.setOnClickListener(new View.onClickListener() {
//            @Override
//            public void onClick(View v){
//                if(chWeb.isChecked()){
//                    chWeb.setChecked(false);
//                }
//                if(chAndroid.isChecked()){
//                    chAndroid.setChecked(false);
//                }
//                if(chJava.isChecked()){
//                    Toast.makeText(Checkbox.this, "Java", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//    }
//}