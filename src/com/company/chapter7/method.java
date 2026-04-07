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

    int logic1(int x ,int y){// without static
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*2;
        }
        return z;

    }
    public static void main(String[] args) {
        int  a= 2;
        int b=3;
        int c;
        c=logic(a,b); //  calling static method in main static method
        System.out.println(c);


        // calling methd without static by making object
        int  a1= 4;
        int b1=3;
        int c1;
        method obj= new method(); // creating object for non-static method ----class name method then obj then new then again class name
        c1=obj.logic1(a1,b1); // calling non-static method
        System.out.println(c1);

    }
}
