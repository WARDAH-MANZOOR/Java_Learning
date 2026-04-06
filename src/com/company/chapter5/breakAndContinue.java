package com.company.chapter5;
// BREAK STATEMENT-- Breaks the loop no matter condition true or false if break then break
// CONTINUE STATEMENT-- continue statemnet continues and skip the code part where condition true ,
// example ke tor par consition me hai ke i ki value jab 2 ho tou continue ho tou kai hoga ke oop
// ke andar jo bhi aur stements hongi jese har baar increment ke baad loop running printhona wo bhi
// skip hojaiga aur next iteration par chala jaainga
public class breakAndContinue {
    public static void main(String[] args) {
        // break statement for -- for loop
        System.out.println("BREAK STATEMENT FOR --FOR LOOP");
        for(int i = 0;i<5;i++){
            System.out.println(i);
            System.out.println("Loop Running");
            if(i==2){
                System.out.println("Loop Breaked");
                break;
            }
        }

        // continue statement for -- for loop
        System.out.println("CONTINUE STATEMENT FOR --FOR LOOP");
        for(int i = 0;i<5;i++){
            if(i==2){
                System.out.println("Loop Continued");
                continue;
            }
            System.out.println(i);
            System.out.println("Loop Running");
        }

        // break statement for -- while loop
        System.out.println("BREAK STATEMENT FOR -- WHILE LOOP");
        int i = 0;
        while(i<5){
            System.out.println(i);
            System.out.println("Loop Running");
            if(i==2){
                System.out.println("Loop Breaked");
                break;
            }
            i++;
        }

        // continue statement for --while loop
        System.out.println("CONTINUE STATEMENT FOR -- WHILE LOOP");

        int c = 0;
        while(c < 5){
            if(c == 2){
                c++; // 🔥 increment before continue
                System.out.println("Loop Continued");
                continue;
            }

            c++;
            System.out.println(c);
            System.out.println("Loop Running");
        }

        //break statement for -- do while loop
        System.out.println("CONTINUE STATEMENT FOR -- DO WHILE LOOP");
        int b = 0;
        do{
            System.out.println(b);
            System.out.println("Loop Running");
            if(b==2){
                System.out.println("Loop Breaked");
                break;
            }
            b++;
        }while(b<5);

        // continue statement for -- do while loop
        System.out.println("CONTINUE STATEMENT FOR -- DO WHILE LOOP");

        int d = 0;
        do{
            if(d == 2){
                d++; // 🔥 increment before continue
                System.out.println("Loop Continued");
                continue;
            }
            d++;
            System.out.println(d);
            System.out.println("Loop Running");
        }while(d < 5);


        System.out.println("Loop ends here");
    }
}
