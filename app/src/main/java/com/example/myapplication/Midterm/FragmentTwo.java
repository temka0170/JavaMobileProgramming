package com.example.myapplication.Midterm;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.Lesson6.Canvas;
import com.example.myapplication.Lesson6.MainList;
import com.example.myapplication.R;

public class FragmentTwo extends Fragment {

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

    public FragmentTwo() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        lv = (ListView) view.findViewById(R.id.lv);
        adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, name);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(
                        getActivity(),
                        CountryInfo.class
                );
                i.putExtra("png", png[position]);
                i.putExtra("name", name[position]);
                i.putExtra("population", population[position]);
                startActivity(i);
            }
        });
        return view;
    }
}