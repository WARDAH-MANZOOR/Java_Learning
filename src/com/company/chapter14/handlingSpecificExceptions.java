package com.company.chapter14;

import java.util.Scanner;

public class handlingSpecificExceptions {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 56;
        marks[1] = 66;
        marks[2] = 76;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array index");
        int index = input.nextInt();
        System.out.println("Enter the number  which you want to divide");
        int number = input.nextInt();
        try {
            System.out.println("The value at array index entered is " + marks[index]);
            System.out.println("The value of array-value/number is: " + marks[index]/number);
        }
        catch (ArithmeticException e) { // handles arithmetic exceptions
            System.out.println("Arithmetic exception occured");
            System.out.println(e);

        }
        catch (ArrayIndexOutOfBoundsException e) { // handles ArrayIndexOutOfBoundsException exception
        System.out.println("Array index out of bound  exception occured");
        System.out.println(e);

        }
         catch (Exception e) { // handles all exceptions
            System.out.println("some other exception occured");
            System.out.println(e);

        }
    }
}
