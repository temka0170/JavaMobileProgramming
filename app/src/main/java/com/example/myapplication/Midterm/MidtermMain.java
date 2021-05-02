package com.example.myapplication.Midterm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.myapplication.Lesson7.Tab;
import com.example.myapplication.Lesson7.TabOne;
import com.example.myapplication.Lesson7.TabThree;
import com.example.myapplication.Lesson7.TabTwo;
import com.example.myapplication.R;
import com.google.android.material.tabs.TabLayout;

public class MidtermMain extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm_main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Fragment 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Fragment 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Fragment 3"));
        tabLayout.addTab(tabLayout.newTab().setText("Fragment 4"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager=(ViewPager) findViewById(R.id.viewPager);
        PageAdapter adapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    public class PageAdapter extends FragmentStatePagerAdapter {
        int countTab;

        public PageAdapter(@NonNull FragmentManager fm, int countTab) {
            super(fm);
            this.countTab = countTab;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new FragmentOne();
                case 1:
                    return new FragmentTwo();
                case 2:
                    return new FragmentThree();
                case 3:
                    return new FragmentFour();
            }
            return new FragmentOne();
        }

        @Override
        public int getCount() {
            return countTab;
        }
    }
}