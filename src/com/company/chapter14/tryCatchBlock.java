package com.company.chapter14;

public class tryCatchBlock {
    public static void main(String[] args) {
        int a = 6789;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("THe result of c is: " + c);

        }
        catch(Exception e){
            System.out.println("We failed to devide. Reason: ");
            System.out.println(e);

        }
        System.out.println("End of the program");

    }
}
