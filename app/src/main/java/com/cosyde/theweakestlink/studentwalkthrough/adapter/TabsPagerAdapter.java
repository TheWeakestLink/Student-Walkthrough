package com.cosyde.theweakestlink.studentwalkthrough.adapter;

import com.cosyde.theweakestlink.studentwalkthrough.fragment.Schedule;
import com.cosyde.theweakestlink.studentwalkthrough.fragment.Directory;
import com.cosyde.theweakestlink.studentwalkthrough.fragment.Events;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mobile1 on 7/22/15.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {


    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                // the Schedule fragment
                return new Schedule();
            case 1:
                // the Directory fragment
                return new Directory();
            case 2:
                // the Events fragment
                return new Events();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

}
