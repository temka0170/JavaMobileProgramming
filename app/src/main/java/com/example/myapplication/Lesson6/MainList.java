package com.example.myapplication.Lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapplication.Activity1;
import com.example.myapplication.Activity2;
import com.example.myapplication.R;

public class MainList extends AppCompatActivity {

    private ListView lv;
    private ArrayAdapter adapter;
    private String[] name = {
            "Mongolia", "United States of America", "Canada",
            "England", "Germany", "Korea"
    };
    private String[] population = {
            "3.30 million", "328.2 million", "38.44 million",
            "68.2 million", "84 million", "51.3 million"
    };
    private int[] png = {
            R.drawable.mongolia,R.drawable.usa,R.drawable.canada,
            R.drawable.england,R.drawable.germany,R.drawable.korea
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        lv = (ListView) findViewById(R.id.lv);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, name);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(
                        MainList.this,
                        Canvas.class
                );
                i.putExtra("png", png[position]);
                i.putExtra("name", name[position]);
                i.putExtra("population", population[position]);
                startActivity(i);
            }
        });
    }
}