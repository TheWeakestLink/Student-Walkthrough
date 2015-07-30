package com.cosyde.theweakestlink.studentwalkthrough.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cosyde.theweakestlink.studentwalkthrough.R;
import com.cosyde.theweakestlink.studentwalkthrough.model.ScheduleItem;

import java.util.Collections;
import java.util.List;

/**
 * Created by mobile1 on 7/29/15.
 */
public class EventsRecyclerAdapter extends RecyclerView.Adapter<EventsRecyclerAdapter.EventsRecyclerViewHolder>{

    List<ScheduleItem> data = Collections.emptyList();
    Context context;
    LayoutInflater inflater;

    public EventsRecyclerAdapter(Context context, List<ScheduleItem> data) {
        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public EventsRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.cardview_events, parent, false);
        EventsRecyclerViewHolder holder = new EventsRecyclerViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(EventsRecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class EventsRecyclerViewHolder extends RecyclerView.ViewHolder {

        public EventsRecyclerViewHolder(View itemView) {
            super(itemView);
        }

    }

}
