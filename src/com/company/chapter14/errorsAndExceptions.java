package com.company.chapter14;

import java.util.Scanner;

// There are three types of errors:
// logical errors, syntax errors, runtime errors
// syntax errors: wo error jo programmer ki ghalti kiw aj se ho jese comma lagana bhool gaye ya is hi tarah ki koi ghalti
// logical errros: ye wo errors hain ke jo cheez hum apne program se chahrah ehote hain par wo ho nahi rahi hoti
// example ke tor par program ppoora run hogaya execute hoga mujhe page par name inut karne par name print bhi karwana
// tha par w print ho hinahi raha uski jaga kuch aur horaha hai tou ye logical error hai
// runtime erros: jab sab sahi chalraha ho run horaha ho sab kuch par program crash hojai koi input user ne bahut ara daldia
// ho ya phr api work na karrahi ho data sahi se na araha ho usko runtime errors kehte hain
public class errorsAndExceptions {
    public static void main(String[] args) {

        // syntax error demo
//        int a = 7 // without semi colon
//        b =9; // b not declared

        // logial error demo:
        // ye program sahi se chalraha ahi par ye 9 bhi print karraha hai jo prime number nahi hai
        // tou is waja se ye aik logical error hai jo programmer k khud find karna parta hai sab sahi chalne ke baa bhi
        // cheezen sahi se na chalna
        System.out.println(2);
        for(int i =1 ;i<5;i++){
            System.out.println(2*i+1);
        }

        // runtime error demo:
        // ye program bhi bilkl theek chalega koi issue nahi hoga par jese hi user
        // ne agr 0 input me dedia program crash hojiaga ye runtime error hai
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println("nteger part of 1000 divided by number is " + 1000/num );


    }
}
