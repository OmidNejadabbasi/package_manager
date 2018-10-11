package com.example.omidn.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

abstract class SingleFragmentActivity extends AppCompatActivity{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm= getSupportFragmentManager();
        Fragment fragment= fm.findFragmentById(R.id.fragment_container);
        if(fragment==null)
            fragment=createFragment();
        fm.beginTransaction().replace(R.id.fragment_container,fragment).commit();
    }
    protected abstract Fragment createFragment();
}
