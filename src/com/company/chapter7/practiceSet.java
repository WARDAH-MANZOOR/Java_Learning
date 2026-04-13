package com.company.chapter7;

public class practiceSet {

    static void table( int n){
        for (int i = 1; i <= 10; i++){
            System.out.format(" %d x %d = %d \n", n,i,n*i);
        }
    }
    static void pattern1(int n ){
        for(int i =0; i<n; i++){
            for(int j =0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static int sumRec(int n ){
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    public static void main(String[] args) {
        System.out.println("PRACTICE QUESTIONS FOR CHAPTER 7");
        System.out.println("QUESTION # 01: Write a program to print multiplication table of number n");
        table(7);
        System.out.println("QUESTION # 02: Write a program using functions to print the following pattern \n\t *\n\t * *\n\t * * *\n\t * * * *");
        pattern1(8);
        System.out.println("QUESTION # 03: Write a recursive function to calculate teh sum of na natural numbers ");
        int a = sumRec(4);
        System.out.println(a);

    }
}
