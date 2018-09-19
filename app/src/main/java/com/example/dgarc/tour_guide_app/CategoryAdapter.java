package com.example.dgarc.tour_guide_app;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 *CategoryAdapter is a  FragmentPagerAdapter that can provide the layout for
 * each list item based on a data source which is a list of location objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new CategoryAdapter object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the Fragment that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SantaMonicaFragment();
        } else if (position == 1) {
            return new HollywoodFragment();
        } else if (position == 2) {
            return new DowntownFragment();
        } else {
            return new LaCanadaFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Santa_Monica);
        } else if (position == 1) {
            return mContext.getString(R.string.Hollywood);
        } else if (position == 2) {
            return mContext.getString(R.string.Downtown);
        } else {
            return mContext.getString(R.string.La_Canada);
        }
    }
}
