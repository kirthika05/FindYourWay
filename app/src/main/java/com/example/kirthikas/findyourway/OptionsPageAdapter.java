package com.example.kirthikas.findyourway;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by kirthikas on 9/28/17.
 */

public class OptionsPageAdapter extends FragmentPagerAdapter {

    public OptionsPageAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new GridExamplesFragment();
            case 1:
                return new MinCostCustomFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Example Grids";
            case 1:
                return "Custom Grid";
            default:
                return null;
        }
    }
}
