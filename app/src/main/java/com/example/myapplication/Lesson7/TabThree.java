package com.example.myapplication.Lesson7;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import java.util.ArrayList;

import com.example.myapplication.R;

import java.util.ArrayList;

public class TabThree extends Fragment {

    private GridView gallery;
    private ArrayList imgs=new ArrayList<>();

    public TabThree() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_three, container, false);
        gallery = (GridView) view.findViewById(R.id.gv);
        imgs.add(new Item("person 1",R.drawable.person1));
        imgs.add(new Item("person 2",R.drawable.person3));
        imgs.add(new Item("Landscape",R.drawable.test));
        imgs.add(new Item("Photo1",R.drawable.slide1));
        imgs.add(new Item("Photo2",R.drawable.slidee3));
        imgs.add(new Item("USA",R.drawable.usa));
        imgs.add(new Item("Korea",R.drawable.korea));
        imgs.add(new Item("Germany",R.drawable.germany));
        imgs.add(new Item("England",R.drawable.england));
        imgs.add(new Item("Canada",R.drawable.canada));
        imgs.add(new Item("Mongolia",R.drawable.mongolia));
        MyAdapter myAdapter=new MyAdapter(getActivity(),R.layout.grid_view_items,imgs);
        gallery.setAdapter(myAdapter);
        return view;
    }
}