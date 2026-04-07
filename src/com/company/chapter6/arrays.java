package com.company.chapter6;
// ARRAY: Array is a collection of similar types of data, three ways to create array
// option 1---declaration in 1 line and memory allocation in second line
// int [] marks; --- declaration
// new int [10]; ---- memory allocation

// option 2 --- declaration +memory allocation single line
// int [] marks = new int[10]

// option 3 --- declare +initialize
//int [] marks = {67,44,33,78,99};
public class arrays {
    public static void main(String[] args) {
        int [] marks = new int[10]; // array for 10 elements
        marks[0]=44;
        marks[1]=55;
        marks[2]=66;
        marks[3]=77;
        marks[4]=88;
        marks[5]=99;
        marks[6]=99;
        marks[7]=99;
        marks[8]=99;
        marks[9]=99;
        System.out.println(marks[0]);



    }
}
