package com.example.omidn.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainListFragment extends Fragment implements View.OnClickListener {
    private RecyclerView mAppRecyclerView;



    @Override
    public void onClick(View v) {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_list,container,false);

        setupRecyclerView(view);



        return view;
    }

    private void setupRecyclerView(View view) {
        mAppRecyclerView=view.findViewById(R.id.app_list_recyclerview);
        mAppRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}
