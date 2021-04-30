package com.example.myapplication.Lesson7;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

public class TabTwo extends Fragment {

    private ListView lv;
    private ArrayAdapter adapter;
    private String[] songs = {
            "Bill Withers - Lovely Day", "Feng suave - Honey, There's No Time",
            "Fkj & Masego - Tadow", "Alberto Droguett - Chitchatting in Fsharp",
            "Kendrick Lamar - Swimming Pool", "Oh Wonder - Lose it",
    };
    public TabTwo() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_tab_two, container, false);
        lv = (ListView) view.findViewById(R.id.lv);
        adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, songs);
        lv.setAdapter(adapter);
        return view;
    }
}