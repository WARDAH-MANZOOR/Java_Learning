package com.company;

// write a program to calculate percentage of a given student,
// his marks for 5 subjects must be taken as input, marks are out of 100

import java.util.Scanner;

public class percentageCalculation {
    public static void main(String[] args) {
        System.out.println("Board Percentage calculation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject 1 obtained marks ");
        float obtainedsubject1Marks = sc.nextFloat();
        System.out.println("Enter Subject 2 obtained marks ");
        float obtainedsubject2Markes = sc.nextFloat();
        System.out.println("Enter Subject 3 obtained marks ");
        float obtainedsubject3Markes = sc.nextFloat();
        System.out.println("Enter Subject 4 obtained marks ");
        float obtainedsubject4Markes = sc.nextFloat();
        System.out.println("Enter Subject 5 obtained marks ");
        float obtainedsubject5Markes = sc.nextFloat();

        float sumOfObtainedMarks = obtainedsubject1Marks + obtainedsubject2Markes + obtainedsubject3Markes +obtainedsubject4Markes + obtainedsubject5Markes;
        System.out.println("The sum of obtained marks is:");
        System.out.println(sumOfObtainedMarks);

        System.out.println("Enter Subject 1 total marks ");
        int totalSubject1Marks = sc.nextInt();
        System.out.println("Enter Subject 2 total marks ");
        int totalSubject2Marks = sc.nextInt();
        System.out.println("Enter Subject 3 total marks ");
        int totalSubject3Marks = sc.nextInt();
        System.out.println("Enter Subject 4 total marks ");
        int totalSubject4Marks = sc.nextInt();
        System.out.println("Enter Subject 5 total marks ");
        int totalSubject5Marks = sc.nextInt();

        int sumOFTotalMarks = totalSubject1Marks + totalSubject2Marks + totalSubject3Marks + totalSubject4Marks + totalSubject5Marks;
        System.out.println("The sum of total marks is:");
        System.out.println(sumOFTotalMarks);


        float percentage = (sumOfObtainedMarks / sumOFTotalMarks)*100;
        System.out.println("The percent of obtained marks is:");
        System.out.println(percentage);

    }
}
