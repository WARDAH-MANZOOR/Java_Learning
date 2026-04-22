package com.company.chapter15;

import java.util.Date;

public class dateClass {
    public static void main(String[] args) {
        // hum date time ko long me save karwaskate ahin ye safe hai
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        // date class
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());// time in milliseconds

    }
}
