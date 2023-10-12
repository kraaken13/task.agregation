package com.tasks.task6;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour) {
        this.hour = (hour >= 0 && hour < 24) ? hour : 0;
    }

    public void setMinute(int minute) {
        this.minute = (minute >= 0 && minute < 60) ? minute : 0;
    }

    public void setSecond(int second) {
        this.second = (second >= 0 && second < 60) ? second : 0;
    }

    public void addTime(int hours, int minutes, int seconds) {
        hour = (hour + hours) % 24;
        minute = (minute + minutes) % 60;
        second = (second + seconds) % 60;
    }

    public String getTime() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
