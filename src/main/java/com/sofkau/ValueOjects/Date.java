package com.sofkau.ValueOjects;

import java.time.LocalDate;

public class Date {
    private LocalDate date;

    public Date(String date) {
        this.date = LocalDate.parse(date);
    }

    public Date updateDate(String date) {
        return new Date(date);
    }
}
