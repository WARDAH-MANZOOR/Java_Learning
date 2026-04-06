package com.company.chapter5;
// FOR LOOP --- A for loop is usually used to execute a piece of code for specific number of times
public class forLoop {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }

        // odd numbers:
        int n = 20;
        for (int a=0;a<n;a++){
            System.out.println((2*a)+1);
        }
        //even numbers
        for (int a=0;a<n;a++){
            System.out.println(2*a);
        }

        // decrementing in loop
        for (int i=5;i>0;i--){
            System.out.println(i);
        }

    }
}
