package com.company.chapter7;
//Variable Arguments --- ye hai ke agr jese aik method hai sum ka usme 2 hi parameters hain tou arguments bhi wo srf
// 2 hi receive karega tou agr mujhe aik aesa function banana hai ke me bhale jitne bhi arguments paas karoon wo sum hojain to uske liye variable
// Arguments ka concept use hota hai jisme ye hota hai ke srae arguments aik array me save hojate aur phr uspar sum apply hoga

public class variableArguments {
    static int sum(int ...arr){// isme bhale aik argument do , bhale 10 do ya bhale na do koi farq nahi parega
        // now arguments avaiable as int [] arr
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;

    }
    static int sum1(int x,int ...arr){ // atleast one argument dena parega aur ziada se ziada jitne deden
        // now arguments avaiable as int [] arr
        int result=x;
        for(int a:arr){
            result+=a;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("the sum of 3 arguments are "+ sum(2,4,5));
        System.out.println("the sum of 8 arguments are "+ sum(2,4,5,5,6,2,1,7));
        System.out.println("the sum of 5 arguments are "+ sum1(2,4,5,5,7));


    }
}
