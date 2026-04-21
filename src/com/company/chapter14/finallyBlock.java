package com.company.chapter14;
// finally block contains the code which is always executed whether the exception is handled or not .
// It is sued to exceute teh code containing instructions to release the system resources, close a connection etc.
public class finallyBlock {
    public static int greet(){
        try{
            int a = 50;
            int b =2;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {// bhale ooper error bhi print hga phr bhi ye block chalega hi chalega
            System.out.println("This is the end of this function ");
        }
        return 0;

    }

    public static void main(String[] args) {
        System.out.println(greet());


    }
}
