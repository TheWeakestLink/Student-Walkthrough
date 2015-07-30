package com.cosyde.theweakestlink.studentwalkthrough.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cosyde.theweakestlink.studentwalkthrough.R;
import com.cosyde.theweakestlink.studentwalkthrough.model.ScheduleItem;

import java.util.ArrayList;

/**
 * Created by lexus on 7/23/15.
 * <p/>
 * This is the class for the Schedule's RecyclerView
 * The recycler view will hold the events of the students for that day
 */

public class ScheduleRecyclerAdapter extends RecyclerView.Adapter<ScheduleRecyclerAdapter.ScheduleRecyclerViewHolder> {

    LayoutInflater inflater;
    Context context;
    ArrayList<Object> data;

    public ScheduleRecyclerAdapter(Context context, ArrayList<Object> data) {
        this.data = data;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public ScheduleRecyclerAdapter.ScheduleRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.cardview_schedule, parent, false);
        ScheduleRecyclerViewHolder holder = new ScheduleRecyclerViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ScheduleRecyclerViewHolder holder, int position) {

        final ScheduleItem current = (ScheduleItem) data.get(position);

        holder.schedHour.setText(current.getSchedHour());
        holder.schedMin.setText(current.getSchedMin());
        holder.schedAmPm.setText(current.getSchedAmPm());
        holder.eventName.setText(current.getEventName());
        holder.eventLoc.setText(current.getEventLoc());
        holder.eventHolder.setText(current.getEventHolder());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ScheduleRecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView schedHour;
        TextView schedMin;
        TextView schedAmPm;
        TextView eventName;
        TextView eventLoc;
        TextView eventHolder;

        public ScheduleRecyclerViewHolder(View v) {
            super(v);

            schedHour = (TextView) v.findViewById(R.id.sched_hour);
            schedMin = (TextView) v.findViewById(R.id.sched_min);
            schedAmPm = (TextView) v.findViewById(R.id.sched_ampm);
            eventName = (TextView) v.findViewById(R.id.event_name);
            eventLoc = (TextView) v.findViewById(R.id.event_loc);
            eventHolder = (TextView) v.findViewById(R.id.event_holder);
        }
    }
}
