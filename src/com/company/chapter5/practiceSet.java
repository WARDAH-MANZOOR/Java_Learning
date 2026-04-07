package com.company.chapter5;
import java.util.Scanner;
public class practiceSet {
    public static void main(String[] args) {
        System.out.println("PRACTICE QUESTIONS FOR CHAPTER 5");
        Scanner sc = new Scanner(System.in);
        System.out.println("QUESTION # 01: Write a program to print the following pattern:\n * * * *\n * * *\n * *\n *");
        int n = 4;
        for (int i = n;i>0;i--){
            for (int j = n;j<i;j++){
                System.out.print("*");
            }

        }

        System.out.println("QUESTION # 02: Write a program to sum first n even numbers using while loop");
        int i = 1;
        int sum = 0;
        while(i <= 10){
            int even = 2*i;
            sum = sum + even;
            i++;
        }
        System.out.println("Sum of even numbers!" + sum);

        System.out.println("QUESTION # 03: Write a program to print multiplication table of a given number n");
        int table = sc.nextInt();
        for(int a = 1; a<=10;a++){
            System.out.printf("%d * %d = %d \n", table, a, table*a);
        }
    }
}

