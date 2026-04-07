package com.company.chapter7;

public class method {

    // creating method
    static int logic(int x ,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*2;
        }
        return z;

    }
    public static void main(String[] args) { // callingmethod in main class
        int  a= 2;
        int b=3;
        int c;
        c=logic(a,b); // here calling method
        System.out.println(c);
    }
}
