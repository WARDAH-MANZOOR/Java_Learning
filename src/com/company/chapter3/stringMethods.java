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
        String subString = name.substring(4); // starts from index 4 till end
        System.out.println(subString);
        String subString2 = name.substring(0,6); // proper indexing start(included) +end (excluded)
        System.out.println(subString2);

        // Replace Method:
        // character replacement
        String re =name.replace('W','P');// replaces W with P(replaces all occurences of W with P
        System.out.println(re);
        // String Replacement:
        String rep = name.replace("War","Per"); // replaces War with Per in all places(occurences) of string
        System.out.println(rep);

        // StartWith Method;
        System.out.println(name.startsWith("   Wa"));

        // endsWith Method:
        System.out.println(name.endsWith("Wa"));

        // charAt Method: Returns character for desired index from string
        System.out.println(name.charAt(6));

        // indexof Method:returns index for the given sub string
        String name1 = "Harrryrry";
        System.out.println(name1.indexOf("ar")); // returns first occurence index of substring
        System.out.println(name1.indexOf("ry",5)); // start finding the ry index from index 5
        System.out.println(name1.indexOf("Her")); // jo substring nahi milega uspar -1 return karta hai

    }
}

