package com.company.chapter3;

// STRINGS: strings immutable hote hain  matlab ye ke original string jo humne banaya ahi wo kabhi bhi
// change nahi hota hai copy me change hota hai original string wahi rehta hai
public class stringMethods {
    public  static void main(String args[]){
        String name = "   Wardah   ";
        System.out.println(name);

        // Length Method:
        int value = name.length();
        System.out.println(value);

        // toLowerCase Method:
        String Lc = name.toLowerCase();
        System.out.println(Lc);

        // toUpperCase Method
        String uc = name.toUpperCase();
        System.out.println(uc);

        // trim Method: removes all leading and trailing spaces
        String tr = name.trim();
        System.out.println(tr);

        // subString Method: Returns a substring from start to end (index starts from 0 )
        String subString = name.substring(0,6);
        System.out.println(subString);
    }
}

