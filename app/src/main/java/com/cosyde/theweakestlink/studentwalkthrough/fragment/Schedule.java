package com.cosyde.theweakestlink.studentwalkthrough.fragment;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cosyde.theweakestlink.studentwalkthrough.R;
import com.cosyde.theweakestlink.studentwalkthrough.adapter.ScheduleRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;


public class Schedule extends Fragment {

    private RecyclerView recyclerView;
    private ScheduleRecyclerAdapter adapter;

    public Schedule() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_schedule, container, false);
        return layout;
    }

    private void initRecycler(View layout) {
        recyclerView = (RecyclerView) layout.findViewById(R.id.schedule);
    }

    public static List<Schedule> getScheduleData() {
        List<Schedule> data = new ArrayList<>();
        String[] eName = {""};
        String[] eLoc = {""};
        String[] eHolder = {""};
        return data;
    }


}
