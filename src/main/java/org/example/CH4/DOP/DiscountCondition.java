package org.example.CH4.DOP;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {
    private DiscountConditionType type;

    private int sequence;

    private DayOfWeek day;
    private LocalTime startTime;
    private LocalTime endTime;

    public void setType(DiscountConditionType type) {
        this.type = type;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public DiscountConditionType getType() {
        return type;
    }

    public int getSequence() {
        return sequence;
    }

    public DayOfWeek getDayOfWeek() {
        return day;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}
