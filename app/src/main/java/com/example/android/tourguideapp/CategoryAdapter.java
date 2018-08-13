package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FamousplacesFragment();
        } else if (position == 1) {
            return new HospitalsFragment();
        } else if (position == 2) {
            return new ClubsFragment();
        } else {
            return new RestaurantsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return "Famous places";
            case 1:
                return "Hospitals";
            case 2:
                return "Clubs";
            case 3:
                return "Restaurants";
            default:
                return null;
        }
    }
}

