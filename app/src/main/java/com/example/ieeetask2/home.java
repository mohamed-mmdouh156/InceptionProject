package com.example.ieeetask2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class home extends AppCompatActivity {

    fragments fragment;
    TabLayout tabLayout ;
    ViewPager viewPager ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar;
        toolbar=findViewById(R.id.toolbar_main);

        setSupportActionBar(toolbar);


        id();

        fragment = new fragments (getSupportFragmentManager());



        fragment.add(new food_Fragment() , getString(R.string.home_layout_tab_food));
        fragment.add(new drink_Fragment() , getString(R.string.home_layout_tab_drinks));


        viewPager.setAdapter(fragment);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void id ()
    {
        tabLayout = findViewById(R.id.home_layout_tabs);
        viewPager = findViewById(R.id.home_layout_viewpager);
    }
}