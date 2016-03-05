package com.example.srikrishnan.youthify;


import android.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.AsyncTask;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    MyPageAdapter pageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final String PREFS_NAME = "MyPrefsFile";

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);






        if (settings.getBoolean("my_first_time", true)) {
            //the app is being launched for first time, do something
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            List<MyFragment> fragments = getFragments();

            pageAdapter = new MyPageAdapter(getSupportFragmentManager(), fragments);

            ViewPager pager = (ViewPager)findViewById(R.id.viewpager);
            pager.setPageTransformer(true, new DepthPageTransformer());

            pager.setAdapter(pageAdapter);
            Log.d("Comments", "First time");

            // first time task

            // record the fact that the app has been started at least once
            settings.edit().putBoolean("my_first_time", false).commit();
        }

        else
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Intent i=new Intent(this,LoginActivity.class);
            startActivity(i);
        }
    }
    private List<MyFragment> getFragments(){

        List<MyFragment> fList = new ArrayList<>();



        fList.add(MyFragment.newInstance("Welcome to Yocial!"));

        fList.add(MyFragment.newInstance("Got issues to Solve?"));

        fList.add(MyFragment.newInstance("Share your concerns!"));



        return fList;

    }

}
