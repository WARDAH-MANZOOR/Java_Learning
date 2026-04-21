package com.company.chapter14;

import java.util.Scanner;

// Custom Exception for Q4 & Q5
class MaxRetriesException extends Exception{
    public String toString(){
        return "Max retries reached!";
    }
    public String getMessage(){
        return "You have exceeded maximum retries.";
    }
}

public class practiceSet {

    // ===================== QUESTION # 05 METHOD =====================
    public static void accessArray(int[] arr) throws MaxRetriesException {
        Scanner input = new Scanner(System.in);
        int index;
        int i = 0;

        while(true){
            System.out.println("Enter array index:");
            index = input.nextInt();
            try{
                System.out.println("Value: " + arr[index]);
                break;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid index!");
                i++;
                if(i >= 5){
                    throw new MaxRetriesException();
                }
            }
        }
    }

    public static void main(String[] args) {

        // ===================== QUESTION # 01 =====================
        System.out.println("QUESTION # 01: Write a Java program to demonstrate syntax, logical & runtime errors.");

        // Syntax Error (commented because it won't compile)
        // int a = 5  // missing semicolon

        // Logical Error
        int a = 10;
        int b = 5;
        System.out.println("Logical Error Example (Wrong addition): " + (a - b)); // should be +

        // Runtime Error
        try{
            int c = 10/0;
        }
        catch(Exception e){
            System.out.println("Runtime Error: " + e);
        }


        // ===================== QUESTION # 02 =====================
        System.out.println("QUESTION # 02: Write a Java program that prints \"Haha\" during Arithmetic exception and \"Hehe\" during an Illegal argument exception.");


        try{
            int x = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }

        try{
            int age = -5;
            if(age < 0){
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Hehe");
        }


        // ===================== QUESTION # 03 =====================
        System.out.println("QUESTION # 03: Write a program that allows you to keep accessing an array until a valid index is given. If max retries exceed 5 print \"Error\".");

        int [] arr = {10,20,30};
        Scanner input = new Scanner(System.in);
        int index;
        int i = 0;

        while(true){
            System.out.println("Enter array index:");
            index = input.nextInt();
            try{
                System.out.println("Value: " + arr[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index!");
                i++;
                if(i >= 5){
                    System.out.println("Error");
                    break;
                }
            }
        }


        // ===================== QUESTION # 04 =====================
        System.out.println("QUESTION # 04: Modify program in Q3 to throw a custom exception if max retries are reached.");

        int j = 0;
        while(true){
            System.out.println("Enter array index:");
            index = input.nextInt();
            try{
                System.out.println("Value: " + arr[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index!");
                j++;
                if(j >= 5){
                    try{
                        throw new MaxRetriesException();
                    }
                    catch (Exception ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
            }
        }


        // ===================== QUESTION # 05 =====================
        System.out.println("QUESTION # 05: Wrap the program in Q3 inside a method which throws your custom exception.");

        try{
            accessArray(arr);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}