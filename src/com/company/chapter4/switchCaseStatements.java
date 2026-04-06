package com.company.chapter4;
import java.util.Scanner;

public class switchCaseStatements {
    public static void main(String[] args) {
        // SWICH CASE: is used when we have to amke a choice between number of given alternatives for a given variable
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("You are going to become adult");
                break;
            case 23:
                System.out.println("You are going to join a  job");
                break;
            case 60:
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy Your Life!");
        }


        // var can be an integer , character or string in java
        char var = 'r';
        switch(var){
            case 'r':
                System.out.println("You are going to become adult");
                break;
            case 'b':
                System.out.println("You are going to join a  job");
                break;
            case 'd':
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy Your Life!");
        }

    }
}
