package com.company.chapter6;

import static java.lang.Integer.sum;

public class practiceSet {
    public static void main(String[] args) {
        System.out.println("PRACTICE QUESTIONS FOR CHAPTER 6");

        System.out.println("QUESTION # 01: Create an array of 5 floats and calculate their sum");
        float [] marks = {55.55f,66.3f,34.33f,78.5f,21.8f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println(sum);

        System.out.println("QUESTION # 02: Write a program to find out whether a given integer is present in an array or not");
        float num = 34.33f;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("number is present in an array");
        }
        else{
            System.out.println("number is not present in an array");
        }
        System.out.println("QUESTION # 03: Calculate the average marks from an array containing marks of all students in Physics using for each loop");
        System.out.println("QUESTION # 04: Create a program to add two metrics of size 2x3");
        System.out.println("QUESTION # 05: Write a program to reverese an array");
        System.out.println("QUESTION # 06: Write a program to find maximum element in array");
        System.out.println("QUETSION # 07: Write  aprogram to find miniumum element in array");
        System.out.println("QUESTION # 08: Write a program to find whether an array is sorted or not");
    }
}
