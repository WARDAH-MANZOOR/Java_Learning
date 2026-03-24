package com.company.chapter1;


import java.util.Scanner;

public class chapter1PracticeSet {
    public static void main(String[] args) {
        System.out.println("PRACTICE QUESTIONS FOR CHAPTER 1 ");

        System.out.println("QUESTION # 01 : Write a Program to sum three numbers");
        int num1 = 44;
        int num2 = 47;
        int num3= 67;
        int sum = num1 + num2 + num3;
        System.out.println("The sum of the numbers is: " + sum);

        System.out.println("QUESTION # 02 : Write a Program to calculate CGPA using marks of three subjects out of 100");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter subject 1 marks");
        float subject1ObtainedMarks = sc1.nextFloat();
        System.out.println("Enter subject 2 marks");
        float subject2ObtainedMarks = sc1.nextFloat();
        System.out.println("Enter subject 3 marks");
        float subject3ObtainedMarks = sc1.nextFloat();
        // marks are out of 100 that's why we take average
        float averageMarks = (subject1ObtainedMarks + subject2ObtainedMarks + subject3ObtainedMarks)/3;
       // cgpa calculation 4 mans out of 4 gpa
        float cgpa = (averageMarks/100)*4;
        System.out.println("CGPA is: " + cgpa);

        // clear the buffer before taking name input
        sc1.nextLine();

        System.out.println("QUESTION # 03 : Write a Program which asks the user to enter his/her name and greets them with 'Hello <name>, have a good day' text");
        System.out.println("Enter your name");
        String name = sc1.nextLine();
        System.out.println("Hello "+ name + " ,have a good day");

        System.out.println("QUESTION # 04 : Write a Program to convert kilometers to miles");
        System.out.println("Enter your kilometers");
        float kilometers = sc1.nextFloat();
        float kiloToMiles = kilometers * 0.621371f; // 1km is equal to 0.621371 miles
        System.out.println("Kilometers to miles is: " + kiloToMiles);


        System.out.println("Write a Program to detect whether the number entered by user is integer or not");

        System.out.println("Enter a number");
        boolean num = sc1.hasNextInt();
        System.out.println(num);

    }
}
