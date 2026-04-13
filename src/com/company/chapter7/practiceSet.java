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
    static void pattern2(int n){
        for(int i = n; i >= 1; i--){          // ✅ correct condition
            for(int j = 1; j <= i; j++){      // ✅ print i stars
                System.out.print("* ");       // print (not println)
            }
            System.out.println();             // next line
        }
    }
    static int fabonacci(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fabonacci(n-1)+fabonacci(n-2);
        }
    }
    static float average(int ...arr){
        // now arguments avaiable as int [] arr
        float result=0;
        for(int a:arr){
            result+=a;

        }
        return result/arr.length;

    }
    static void recursivePattern2(int n){
        if(n == 0){
            return;   // base case
        }

        // print one row
        for(int i = 0; i < n; i++){
            System.out.print("* ");
        }
        System.out.println();

        // recursive call
        recursivePattern2(n - 1);
    }

    static void recursivePattern1(int n){
        if(n == 0){
            return;   // base case
        }

        // pehle chhota problem solve karo
        recursivePattern1(n - 1);

        // phir current row print karo
        for(int i = 0; i < n; i++){
            System.out.print("* ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("PRACTICE QUESTIONS FOR CHAPTER 7");
        System.out.println("QUESTION # 01: Write a program to print multiplication table of number n\n ---------------------------------------------");
        table(7);
        System.out.println("QUESTION # 02: Write a program using functions to print the following pattern \n\t *\n\t * *\n\t * * *\n\t * * * *\n ---------------------------------------------");
        pattern1(8);
        System.out.println("QUESTION # 03: Write a recursive function to calculate teh sum of na natural numbers\n --------------------------------------------- ");
        int a = sumRec(4);
        System.out.println(a);

        System.out.println("QUESTION # 04: Write a function to print the following pattern: \n\t * * * *\n\t * * *\n\t * *\n\t *\n ---------------------------------------------");
        pattern2(9);
        System.out.println("QUESTION # 05: Write a function to print nth term of fabonacci series using recursion\n --------------------------------------------- ");
        // fabonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21,34, 55
        //  is question me nth term likha hai tou uska matlab 1 se start hoga agr index likha hota tou 0 se start hota aur agr
        //  index khud batay hua hota tou usse start hota
        int b = fabonacci(5);
        System.out.println(b);
        System.out.println("QUESTION # 06: Write  a function to find average of a set of numbers passed as argumenets\n ---------------------------------------------");
        System.out.println(average(5,6,8,9,1,2));
        System.out.println("QUESTION # 07: Repeat 4 using Recursion\n ---------------------------------------------");
        recursivePattern2(4);
        System.out.println("QUESTION # 08: Repeat 2 using Recursion\n ---------------------------------------------");
        recursivePattern1(4);

    }
}
