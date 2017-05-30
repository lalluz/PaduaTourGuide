package com.example.android.paduatourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */

public class SectionAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public SectionAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /** Return the fragment in the desired position */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new WalkingFragment();
        } else if (position == 1){
            return new VisitFragment();
        } else if (position == 2){
            return new NearbyFragment();
        } else {
            return new FoodFragment();
        }
    }

    /** How many fragment/tabs there are */
    @Override
    public int getCount() {
        return 4;
    }

    /** Return the string to pass to the tablayout in TourActivity */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.walking);
        } else if (position == 1) {
            return mContext.getString(R.string.visit);
        } else if (position == 2) {
            return mContext.getString(R.string.nearby);
        } else {
            return mContext.getString(R.string.food);
        }
    }
}
