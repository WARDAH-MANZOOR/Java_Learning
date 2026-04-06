package com.company.chapter3;

import java.sql.SQLOutput;
import java.util.Locale;

public class practiceSet {
    public static void main(String[] args) {
        System.out.println("PRACTICE QUESTIONS FOR CHAPTER 3 ");
        System.out.println("QUESTION # 01: Convert a string to lowercase ");
        String name = "Wardah";
        String lc = name.toLowerCase();
        System.out.println(lc);
        System.out.println("QUESTION # 02: Replace Spaces With Underscores");
        String name1 = "Wardah Manzoor";
        String Re = name1.replace(" ", "_");
        System.out.println(Re);
        System.out.println("QUESTION # 03: Replace name in the string");
        String Str = "Hello, Dear <|name|>";
        Str = Str.replace("<|name|>", "Wardah Manzoor ");
        System.out.println(Str);

        System.out.println("QUESTION # 04: Write a Program to detect double and triple spaces in a string");
        String str1 = " This String contains    docuble and   tripple     spaces";
        System.out.println(str1.indexOf("  ")); // checking double spaces  , returns -1 if no
        System.out.println(str1.lastIndexOf("   ")); // checking triple spaces returns -1 if no

        System.out.println("QUESTION # 05: Write a Program to format the following letter using exacpe sequence characters in letter format \n letter = \"Dear Wardah, This Java Course is nice. Thanks" );
        String Letter = "Dear Wardah, \n\tThis Java Course is nice. \nThanks";
        System.out.println(Letter);
    }
}
