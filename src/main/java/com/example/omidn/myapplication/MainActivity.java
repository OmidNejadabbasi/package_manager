package com.example.omidn.myapplication;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends SingleFragmentActivity {

    public static final String MAIN_ACTIVITY = "MAIN ACTIVITY";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected Fragment createFragment() {
        MainListFragment listFragment=new MainListFragment();

        Log.d( MAIN_ACTIVITY,"fagment created !!!");
        return listFragment;
    }
}
