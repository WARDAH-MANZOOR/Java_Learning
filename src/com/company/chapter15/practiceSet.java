package com.company.chapter15;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class practiceSet {
    public static void main(String[] args) {
        System.out.println("PRACTICE QUESTIONS FOR CHAPTER # 15");

        System.out.println("QUESTION # 01: Create an ArrayList and store names of 10 students inside it. Print it using a for-each loop.");
        ArrayList<String> students = new ArrayList<>();

        students.add("wardah");
        students.add("amber");
        students.add("haaiqah");
        students.add("malaaikah");
        students.add("abdullah");
        students.add("bynysh");
        students.add("amber");
        students.add("shama");
        students.add("ramsha");
        students.add("sana");



        // Printing using for-each loop
        for(String name : students){
            System.out.println(name);
        }
        System.out.println("QUESTION # 02: Use the Date class in Java to print time in the following format: 21:47:02");
        Date date = new Date();

        // Extract time
        int hours = date.getHours();
        int minutes = date.getMinutes();
        int seconds = date.getSeconds();

        // Format output
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);

        System.out.println("QUESTION # 03: Repeat Question # 02 using the Calendar class.");
        Calendar calendar = Calendar.getInstance();

        int hours1 = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes1 = calendar.get(Calendar.MINUTE);
        int seconds1 = calendar.get(Calendar.SECOND);

        System.out.printf("%02d:%02d:%02d\n", hours1, minutes1, seconds1);

        System.out.println("QUESTION # 04: Repeat Question # 02 using the java.time API.");
        LocalTime localTime = LocalTime.now();


        System.out.printf("%02d:%02d:%02d\n",
                localTime.getHour(),
                localTime.getMinute(),
                localTime.getSecond());

        System.out.println("QUESTION # 05: Create a Set in Java. Try to store duplicate elements inside this set and verify that only one instance is stored.");
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Ali");
        hashSet.add("Ahmed");
        hashSet.add("Ali");   // duplicate
        hashSet.add("Sara");
        hashSet.add("Ahmed"); // duplicate

        // Printing set
        for(String name : hashSet){
            System.out.println(name);
        }

        // Size check
        System.out.println("Total elements in set: " + hashSet.size());
    }
}
