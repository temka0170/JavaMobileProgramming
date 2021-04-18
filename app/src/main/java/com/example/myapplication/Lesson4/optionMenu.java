package com.example.myapplication.Lesson4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.myapplication.R;

public class optionMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_option, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()== R.id.item1){
            Toast.makeText(this, "Item 1", Toast.LENGTH_SHORT).show();
            return true;
        } else
        if (item.getItemId()== R.id.item2){
            Toast.makeText(this, "Item 2", Toast.LENGTH_SHORT).show();
            return true;
        } else
        if (item.getItemId()== R.id.item3){
            Toast.makeText(this, "Item 3", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }

    }
}