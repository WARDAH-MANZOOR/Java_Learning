package com.company.chapter4;
// Relational operators: <,>,<=,>=,!=,==
// Logical Operators:&&(and), ||(or), !(not)
public class RelationalAndLogicalOperators {
    public static void main(String[] args) {
        System.out.println("AND OPERATOR: true only if all statements true");
        boolean a = true;
        boolean b = true;
        boolean c = true;
        if (a && b && c){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println("OR OPERATOR: if only one statement true returns true");
        boolean d = true;
        boolean e = false;
        boolean f = true;
        if (d || e || f){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println("NOT OPERATOR: invert true to false and false to true");
        System.out.println(!a);
        System.out.println(!e);


    }
}
