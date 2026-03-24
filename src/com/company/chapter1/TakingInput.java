package com.company.chapter1;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking inputs from user");
        Scanner sc = new Scanner(System.in);
        System.out.println(" TAKING INPUTS AS INT");
        System.out.println("Enter Number 1 ");
        int a = sc.nextInt();
        System.out.println("Enter Number 2 ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these numbers is:");
        System.out.println(sum);


        System.out.println(" TAKING INPUTS AS FLOAT");
        System.out.println("Enter Number 1 ");
        float float1 = sc.nextFloat();
        System.out.println("Enter Number 2 ");
        float float2 = sc.nextFloat();
        float floatSum = float1 + float2;
        System.out.println("The sum of these numbers is:");
        System.out.println(floatSum);


        System.out.println("CHECKING THE INPUTS AS INT OR NOT");
        System.out.println("Enter Number ");
        boolean num1 = sc.hasNextInt();
        System.out.println(num1);

        sc.nextLine(); // 🔥 buffer clear karne ke liye
        sc.nextLine(); // 🔥 buffer clear karne ke liye


        System.out.println("TAKING STRING AS INPUT");
        System.out.println("Enter your name (only first word of input reads)");
        String name = sc.next(); // only reads and print 1st word of string(input)
        System.out.println(name);
        sc.nextLine(); // 🔥 again clear
        System.out.println("Enter your name (whole input reads)");
        String name1 = sc.nextLine(); // reads whole input
        System.out.println(name1);








    }
}
