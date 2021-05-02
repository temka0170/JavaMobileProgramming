package com.example.myapplication.Midterm;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.example.myapplication.Lesson7.Item;
import com.example.myapplication.Lesson7.MyAdapter;
import com.example.myapplication.R;

import java.util.ArrayList;

public class FragmentThree extends Fragment {

    private GridView gallery;
    private ArrayList imgs=new ArrayList<>();
    private String[] infos = {
            "person 1", "person 3", "test",
            "slide 1", "slidee 3", "usa",
            "korea", "germany", "england",
            "canada", "mongolia"
    };

    public FragmentThree() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_three, container, false);
        gallery = (GridView) view.findViewById(R.id.gv);
        imgs.add(R.drawable.person1);
        imgs.add(R.drawable.person3);
        imgs.add(R.drawable.test);
        imgs.add(R.drawable.slide1);
        imgs.add(R.drawable.slidee3);
        imgs.add(R.drawable.usa);
        imgs.add(R.drawable.korea);
        imgs.add(R.drawable.germany);
        imgs.add(R.drawable.england);
        imgs.add(R.drawable.canada);
        imgs.add(R.drawable.mongolia);
        MyAdapter myAdapter=new MyAdapter(getActivity(),R.layout.grid_view_items,imgs);
        gallery.setAdapter(myAdapter);
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(
                        getActivity(),
                        GalleryInfo.class
                );
                i.putExtra("png", (Integer) imgs.get(position));
                i.putExtra("info", infos[position]);
                startActivity(i);
            }
        });

        return view;
    }
}