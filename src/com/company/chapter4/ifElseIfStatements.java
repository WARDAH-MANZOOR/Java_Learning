package com.company.chapter4;
import java.util.Scanner;

public class ifElseIfStatements {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age>58){
            System.out.println("You are experienced");
        }
        else if (age>46){
            System.out.println("You are semi experienced");
        }
        else if(age>36){
            System.out.println("You are semi semi experienced");

        }
        else{
            System.out.println("You are not experienced");
        }

    }
}
