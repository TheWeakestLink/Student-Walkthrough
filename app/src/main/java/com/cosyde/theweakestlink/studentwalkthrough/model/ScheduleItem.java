package com.cosyde.theweakestlink.studentwalkthrough.model;

/**
 * Created by mobile1 on 7/23/15.
 */
public class ScheduleItem {

    String schedHour;
    String schedMin;
    String schedAmPm;
    String eventName;
    String eventLoc;
    String eventHolder;

    public ScheduleItem(String schedHour, String schedMin, String schedAmPm, String eventName,
                       String eventLoc, String eventHolder) {

        this.schedHour = schedHour;
        this.schedMin = schedMin;
        this.schedAmPm = schedAmPm;
        this.eventName = eventName;
        this.eventLoc = eventLoc;
        this.eventHolder = eventHolder;

    }

    public String getSchedHour() {
        return this.schedHour;
    }

    public String getSchedMin() {
        return this.schedMin;
    }

    public String getSchedAmPm() {
        return this.schedAmPm;
    }

    public String getEventName() {
        return this.eventName;
    }

    public String getEventLoc() {
        return this.eventLoc;
    }

    public String getEventHolder() {
        return this.eventHolder;
    }

}
