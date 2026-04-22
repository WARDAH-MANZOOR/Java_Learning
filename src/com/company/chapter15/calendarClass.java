package com.company.chapter15;

import java.util.Calendar;

// calendar class is an abstract class
public class calendarClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.getTimeZone());
        System.out.println(calendar.getTimeZone().getID());
        System.out.println(calendar.getTime());

    }
}
