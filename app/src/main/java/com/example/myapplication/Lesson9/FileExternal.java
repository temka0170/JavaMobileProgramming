package com.example.myapplication.Lesson9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileExternal extends AppCompatActivity implements View.OnClickListener{

    private Button btnWrite,btnRead;
    private EditText editText;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_external);

        btnWrite = (Button) findViewById(R.id.btnWrite);
        btnRead = (Button) findViewById(R.id.btnRead);
        editText = (EditText) findViewById(R.id.editText);
        result = (TextView) findViewById(R.id.result);

        btnWrite.setOnClickListener(this);
        btnRead.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnWrite){
            writeExternal();
        } else if(v.getId() == R.id.btnRead){
            readExternal();
        }
    }

    private void writeExternal(){
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)){
            File root = Environment.getExternalStorageDirectory();
            File dir = new File(root.getAbsolutePath() + "/Huree");
            if (!dir.exists()){
                dir.mkdir();
            }
            File file = new File(dir, "external_file.txt");
            String message = editText.getText().toString();

            try {
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(message.getBytes());
                fos.close();
                editText.setText("");
                Toast.makeText(this, "Message Saved!", Toast.LENGTH_SHORT).show();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void readExternal(){
        File root = Environment.getExternalStorageDirectory();
        File dir = new File(root.getAbsolutePath() + "/Huree");
        File file = new File(dir,"external_file.txt");
        String message;
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuffer stringBuffer = new StringBuffer();

            while((message = br.readLine()) != null){
                stringBuffer.append(message + "\n");
            }
            result.setText(stringBuffer.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}