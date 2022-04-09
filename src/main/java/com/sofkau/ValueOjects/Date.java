package com.sofkau.ValueOjects;

import java.time.LocalDate;


public class Date {
    private LocalDate date;

    public Date(LocalDate date) {
        this.date = date;
    }

    public static Date date(String date) {
        String[] dateSplit = date.split("/");
        String dateFormat = dateSplit[2] + "-" + dateSplit[1] + "-" + dateSplit[0];
        return new Date(LocalDate.parse(dateFormat));
    }

    @Override
    public String toString() {
        return "Date{" +
                "date=" + date +
                '}';
    }
}
