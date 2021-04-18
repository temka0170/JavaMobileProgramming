package com.example.myapplication.Lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.myapplication.R;

public class popupMenu extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(popupMenu.this, v);
                popupMenu.setOnMenuItemClickListener(popupMenu.this);
                popupMenu.inflate(R.menu.menu_popup);
                popupMenu.show();
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
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
            return false;
        }
    }
}