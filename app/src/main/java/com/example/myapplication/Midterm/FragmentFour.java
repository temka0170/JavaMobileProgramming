package com.example.myapplication.Midterm;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.Lesson3.Intent1;
import com.example.myapplication.Lesson3.Intent2;
import com.example.myapplication.R;

public class FragmentFour extends Fragment {

    private Button btn;
    private EditText name,age,uni,dep,year,height,weight;

    public FragmentFour() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_four, container, false);
        btn = (Button) view.findViewById(R.id.btn);
        name = (EditText) view.findViewById(R.id.name);
        age = (EditText) view.findViewById(R.id.age);
        uni = (EditText) view.findViewById(R.id.uni);
        dep = (EditText) view.findViewById(R.id.dep);
        year = (EditText) view.findViewById(R.id.year);
        height = (EditText) view.findViewById(R.id.height);
        weight = (EditText) view.findViewById(R.id.weight);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), RegisterInfo.class);
                i.putExtra("name", name.getText());
                i.putExtra("age", age.getText());
                i.putExtra("uni", uni.getText());
                i.putExtra("dep", dep.getText());
                i.putExtra("year", year.getText());
                i.putExtra("height", height.getText());
                i.putExtra("weight", weight.getText());
                startActivity(i);
            }
        });

        return view;
    }
}