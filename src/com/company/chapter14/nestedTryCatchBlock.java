package com.company.chapter14;

import java.util.Scanner;

public class nestedTryCatchBlock {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 56;
        marks[1] = 66;
        marks[2] = 76;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array index");
        int index = input.nextInt();

        try {
            System.out.println("Welcome");
            try{
                System.out.println(marks[index]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("sorry this index does not exist");
                System.out.println("Exception in level 2");
            }

        }
        catch (Exception e) { // handles all exceptions
            System.out.println("Exception in level 1");


        }
    }
}
