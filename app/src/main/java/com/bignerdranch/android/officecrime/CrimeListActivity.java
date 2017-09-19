package com.bignerdranch.android.officecrime;

import android.support.v4.app.Fragment;

/**
 * Created by user on 9/18/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
