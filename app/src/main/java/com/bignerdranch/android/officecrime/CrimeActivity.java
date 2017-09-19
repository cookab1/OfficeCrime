package com.bignerdranch.android.officecrime;

//import android.app.Fragment;
import android.support.v4.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
} 
