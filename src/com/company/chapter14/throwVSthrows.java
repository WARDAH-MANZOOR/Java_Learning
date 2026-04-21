package com.company.chapter14;
// throw: the throw keyword is used to throw an exception explicitly by the programmer
// throws: trows keyword is used to declare an execption, this gives information to programmer that there might
// be an excetion so it is better to be prepared with a try catch block
class MyException1 extends Exception{
    public String toString(){
        return "Radius cannot be negative";
    }
    public String getMessage(){
        return "Radius cannot be negative";
    }
}

public class throwVSthrows {
    public static double area(int r)throws MyException1{
        if(r<0){
            throw new MyException1();
        }
        double area = Math.PI * r * r;
        return area;
    }
    public static int divide(int a , int b)throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            int c = divide(6,0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);

        }

        try{
            double area  = area(6);
            System.out.println(area);
        }
        catch(Exception e){
            System.out.println(e);

        }



    }
}
