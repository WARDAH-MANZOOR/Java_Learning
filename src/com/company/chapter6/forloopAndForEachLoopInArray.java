package com.company.chapter6;

public class forloopAndForEachLoopInArray {
    public static void main(String[] args) {
        // integer array
        int [] marks = {33,55,77,32,98};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks.length);

        // float array
        float [] marks1 = {33.66f,55.4f,77.2f,32.3f,98.89f};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks1.length);

        // string array
        String [] students = {"wardah","sana","haaiqah"};
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students.length);


        // printing array elements using for loop
        System.out.println("Printig using for loop");
        int [] marks2 = {33,55,33,32,98};
        for(int i=0;i<=marks2.length-1;i++){
            System.out.println(marks2[i]);
        }

        System.out.println("printing using for loop in reverese order");
        int [] marks3 = {33,55,33,32,98};
        for(int i=marks3.length-1;i>0;i--){
            System.out.println(marks3[i]);
        }

        System.out.println("printing using for each loop");
        for (int element : marks3) {
            System.out.println(element);
        }






    }
}
