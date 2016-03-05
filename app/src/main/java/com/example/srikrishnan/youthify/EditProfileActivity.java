package com.example.srikrishnan.youthify;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class EditProfileActivity extends AppCompatActivity {

    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.shitstuff) ;

        /**
         * Lets inflate the very first fragment
         * Here , we are inflating the TabFragment as the first Fragment
         */


        /**
         * Setup click events on the Navigation View Items.
         */

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @SuppressWarnings("StatementWithEmptyBody")
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();


                //if (menuItem.getItemId() == R.id.nav_popular)
                if (menuItem.getItemId() == R.id.nav_Post) {
                    Intent i = new Intent(getApplicationContext(),PostActivity.class);
                    startActivity(i);
                }
                if (menuItem.getItemId() == R.id.nav_Involved) {
                    Intent i = new Intent(getApplicationContext(),InvolvedActivity.class);
                    startActivity(i);
                }
                if (menuItem.getItemId() == R.id.nav_Interested) {
                    Intent i = new Intent(getApplicationContext(),InterestedActivity.class);
                    startActivity(i);
                }
                if (menuItem.getItemId() == R.id.nav_edit_profile) {
                    Intent i = new Intent(getApplicationContext(),EditProfileActivity.class);
                    startActivity(i);
                }
                if (menuItem.getItemId() == R.id.nav_Home) {
                    Intent i = new Intent(getApplicationContext(),CoreActivity.class);
                    startActivity(i);
                }

                return false;
            }

        });

        /**
         * Setup Drawer Toggle of the Toolbar
         */

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
                R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();

    }

    @Override
    public void onBackPressed() {
        Intent i=new Intent(this, CoreActivity.class);
        startActivity(i);

    }



}
