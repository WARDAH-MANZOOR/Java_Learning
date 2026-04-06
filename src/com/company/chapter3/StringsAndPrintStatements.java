package com.company.chapter3;
import java.util.Scanner;

// STRINGS: strings immutable hote hain  matlab ye ke original string jo humne banaya ahi wo kabhi bhi
// change nahi hota hai copy me change hota hai original string wahi rehta hai
public class StringsAndPrintStatements {
    public static void main(String[] args) {
        String name = "Wardah";  // string
//        System.out.println(name);

        // PRINT STATEMENTS
        System.out.println("Wardah"); // print 1 empty line after printing(line break)
        System.out.print("Wardah"); // does not print any line
        int a = 5;
        float b =7.52387329f;
        System.out.printf("The value of a is %d and value of b is %f",a,b);// %d for int, %f for float , %c for char, %s for staring
        System.out.format("The value of a is %d and value of b is %f",a,b);  // same like printf

        Scanner sc = new Scanner(System.in);
//        String st = sc.next();// stores only first word
//        System.out.println(st); // print the first stored word
        String st1 = sc.nextLine(); // stores whole sring
        System.out.println(st1); // prints the whole stored string




    }
}
