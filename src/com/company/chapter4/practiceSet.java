package com.company.chapter4;
import java.util.Scanner;

public class practiceSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PRACTICE QUESTIONS FOR CHAPTER 4");
        System.out.println("QUESTION # 01: What will be the output of this program");
        int a = 10;
        if(a==11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am NOT 11");
        }

        System.out.println("QUESTION # 02: Write a program to find out whether a student is pass or fail, it rquires total \n 40% and atleast 33% in each subject to pass.Assume 3 subjects and take marks as a input from user ");
        byte m1,m2,m3;
        System.out.println("Enter Your Physics Marks");
        m1=sc.nextByte();
        System.out.println("Enter Your Chemistry Marks");
        m2=sc.nextByte();
        System.out.println("Enter Your Mathematics Marks");
        m3=sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your average is "+avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations! You are promoted");
        }
        else{
            System.out.println("You are not promoted");
        }

        System.out.println("QUESTION # 03 Calculate income tax paid by an employee to the government as per the slabs mentioned below\n\t Income Slab  \t Tax \n\t 2.5L-5.0L  \t 5%\n\t 5.0L-10.0L  \t 10%\n\t Above 10.0L  \t 30%\n Note: There is no tax below 2.5 lac income.Take amount as an input from user");
        float income = sc.nextFloat();

        float tax = 0;

        if(income <= 2.5f){
            tax = 0;
        }
        else if(income <= 5.0f){
            tax = (income - 2.5f) * 0.05f;
        }
        else if(income <= 10.0f){
            tax = (5.0f - 2.5f) * 0.05f; // first slab
            tax += (income - 5.0f) * 0.10f; // second slab
        }
        else{
            tax = (5.0f - 2.5f) * 0.05f; // first slab
            tax += (10.0f - 5.0f) * 0.10f; // second slab
            tax += (income - 10.0f) * 0.30f; // third slab
        }

        System.out.println("Your tax is: " + tax + " lac");

        System.out.println("QUESTION # 04: Write a program to find out the day of the week by given the number [1 for monday, 2 for tueday and so on]");
        int day = sc.nextInt();
        switch(day){
            case 1 -> System.out.println("Its Monday");
            case 2 -> System.out.println("Its Tuesday");
            case 3 -> System.out.println("Its Wednesday");
            case 4 -> System.out.println("Its Thursday");
            case 5 -> System.out.println("Its Friday");
            case 6 -> System.out.println("Its Saturday");
            case 7 -> System.out.println("Its Sunday");
            default -> System.out.println("Invalid day");

        }
        System.out.println("QUESTION # 05: Write a program to find whether the year entered by user is a leap year or not?");
        int year = sc.nextInt();
        if (year%400==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }

        System.out.println("Write a program to find out the type of website from the url \n .com --- commercial website \n .org ---  organizational website \n .pk --- pakistani website");
        String website = sc.next();
        if (website.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("Organizational website");
        }
        else if(website.endsWith(".pk")){
            System.out.println("Pakistani website");
        }
        else{
            System.out.println("Invalid website");
        }


    }
}
