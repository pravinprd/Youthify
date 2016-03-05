package com.example.srikrishnan.youthify;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by SRIKRISHNAN on 2/28/2016.
 */
public class MyPageAdapter extends FragmentPagerAdapter {
    private List<MyFragment> fragments;


    public MyPageAdapter(android.support.v4.app.FragmentManager fm, List<MyFragment> fragments) {

        super(fm);

        this.fragments = fragments;

    }

    @Override

    public android.support.v4.app.Fragment getItem(int position) {

        return this.fragments.get(position);

    }


    @Override

    public int getCount() {

        return this.fragments.size();

    }


}
