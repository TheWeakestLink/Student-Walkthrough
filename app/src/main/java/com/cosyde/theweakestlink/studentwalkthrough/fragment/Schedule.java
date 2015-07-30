package com.cosyde.theweakestlink.studentwalkthrough.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cosyde.theweakestlink.studentwalkthrough.App;
import com.cosyde.theweakestlink.studentwalkthrough.R;
import com.cosyde.theweakestlink.studentwalkthrough.adapter.ScheduleRecyclerAdapter;
import com.cosyde.theweakestlink.studentwalkthrough.model.ScheduleItem;

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
        TextView checkOnline = (TextView) layout.findViewById(R.id.txtNone);

        if (App.isOnline()) {
            checkOnline.setText("You are online");
        } else {
            checkOnline.setText("You are offline");
        }

        return layout;
    }

    private void initRecycler(View layout) {
        recyclerView = (RecyclerView) layout.findViewById(R.id.schedule);
    }

    public static List<Schedule> getScheduleData() {
        List<Schedule> data = new ArrayList<>();
        String[] eHour = {"8"};
        String[] eMin = {"30"};
        String[] eAmPm = {"am"};
        String[] eName = {"Copro 2"};
        String[] eLoc = {"212"};
        String[] eHolder = {"JAS"};

        for (int i = 0; i < eName.length; i++) {
            ScheduleItem current = new ScheduleItem(eHour[i], eMin[i], eAmPm[i], eName[i], eLoc[i], eHolder[i]);
        }


        return data;
    }


}
