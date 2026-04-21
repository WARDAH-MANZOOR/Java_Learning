package com.company.chapter14;

import java.util.Scanner;

// Exception Class: We can write our custom exceptions using exception class
class MyException extends Exception{
    public String toString(){
        return " I am toString()";
    }

    public String getMessage(){
        return  " I am getMessage()";
    }
}
public class exceptionClass {
    public static void main(String[] args) {
        int a ;
        Scanner input = new Scanner(System.in);
        a =  input.nextInt();

        if(a<9){
            try{
                throw new MyException();

            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
            }
        }
    }
}
