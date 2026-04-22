package com.company.chapter15;
// Date is stored in the form of long number, this long number holds the number of milliseconds passed
// since 1 jan 1970
// java assumes that 1900 is the start year which means it calculates years passed since 1900 whenever we ask it for
// years passed
// System.curentTimeMillis() returns numbers of milliSeconds passed once no, of milliseconds are calculated, we can calculate
// seconds, minutes and years passed
//1000 → 1 second = 1000 milliseconds
//60 → 1 minute = 60 seconds
//3600 → 1 hour = 60 × 60 = 3600 seconds
//24 → 1 day = 24 hours
//365 → 1 year ≈ 365 days
public class dateAndTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); // kitne milliseconds ho chuke hain abhi tak 1jan 1970 se ab tak
        System.out.println(System.currentTimeMillis()/1000); // for seconds
        System.out.println(System.currentTimeMillis()/1000/60);// for minutes
        System.out.println(System.currentTimeMillis()/1000/3600); // for hours
        System.out.println(System.currentTimeMillis()/1000/3600/24); // for days
        System.out.println(System.currentTimeMillis()/1000/3600/24/365); // for years

    }
}
