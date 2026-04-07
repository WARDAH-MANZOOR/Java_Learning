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

        System.out.println("QUESTION # 04: Write a program to print multiplication table of 10 in reverse order");

        int table1 = 10 ;

        for(int a =10; a>=1;a--){
            System.out.printf("%d * %d = %d \n", table1, a, table1*a);
        }
        System.out.println("QUESTION # 05: Write a program to find factorial of a given number using for loop");
        int num = 5;   // jis number ka factorial chahiye
        int factorial = 1;

        for(int b = 1; b <= num; b++){
            factorial = factorial * b;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);

        System.out.println("QUESTION # 06: Repeat 5 using while loop:Write a program to find factorial of a given number using while loop");
        int num1 = 5;   // jis number ka factorial chahiye
        int factorial1 = 1;
        int d = 1;
        while(d<=num1){
            factorial1 = factorial1 * d;
            d++;

        }
        System.out.println("Factorial of " + num1 + " is: " + factorial1);

        System.out.println("QUESTION # 07: ");

    }
}

