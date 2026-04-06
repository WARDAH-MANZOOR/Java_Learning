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
    }
}
