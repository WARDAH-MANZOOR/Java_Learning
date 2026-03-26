package com.company.chapter2;
//PRECENDENCE AND ASSOCIATIVITY
// Precedence:
// precendence means konsa operator kis operator se bara hai java programming language
// me BODMAS rule appLy nahi hota hai isme precendence dekhi jati hai operators ki ke konsa
// operator kis operator s ebara hai ab iska kese failsa hoga ke konsa operator kisse bara hai
// tou ye hum Java_Complete_Notes ke folder me jakar dekh sakte hain usme Type Conversion,
// Presendence and Associativity ke name se aik pdf file hai usse pata chal jaaiga usme precendence
// ka column hai usme numbers hain usme Precendence ke column me mention hai ke multiplocation
// ki precendence 12 hai addition ki 11 aur is hi tarah baki operators ki bhi likhi hai ab agr humare
// paas koi aesi expression ati ahi jisme multiplication aur addition dono horahi hon tou precendence
// ke hisab se wo expression solve hogi multiplication ki precendence ziada hai tou pehle wo hoga phr add hoga
// Associativity:
// agr istarah hojai ke aik expression me multiplication aur division horahi hai tou table me jakar dekhenge
// tou pata chalega ke dono ki precendece same hai 12 tou ab kia karen tou yahan ata hai Associativity ka concept
// phr Associativity ka column check hoga ke usme kia likha hai usme jese left to right likha hai tou phr expression
// left to right ke hsiab se solve hogi tou ye hai precendence aur associativity ka concept jo ke tale me sab mention
// bhi hai har operator ke liye

public class precedenceAndAssociativityOfOperators {
    public static void main(String[] args) {
        // Precedence:
        int a = 60 * 5 + 60 - 5; // evaluation on the basis of precedence as * have higher precendence over -  (first 60 * 5) then (60 -5 )
        System.out.println(a);
        // Associativity:
        int b = 60 * 5 + 60 / 5; // multiply and divide both have same precedence so that this expression evaluate on the basis of associativity (left to right) first solve 60 *5 then 60 /5
        System.out.println(b);
        // Quik Quiz
        int x = 10;
        int y = 20;
        int z = 5;
        int c = x-y/2;
        System.out.println(c);
        int d = (y*y - 4*x*z)/(2*x);
        System.out.println(d);


    }
    }
