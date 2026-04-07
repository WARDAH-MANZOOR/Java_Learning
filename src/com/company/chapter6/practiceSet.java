package com.company.chapter6;

import static java.lang.Integer.sum;

public class practiceSet {
    public static void main(String[] args) {
        System.out.println("PRACTICE QUESTIONS FOR CHAPTER 6");

        System.out.println("QUESTION # 01: Create an array of 5 floats and calculate their sum");
        float [] marks = {55.55f,66.3f,34.33f,78.5f,21.8f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println(sum);

        System.out.println("QUESTION # 02: Write a program to find out whether a given integer is present in an array or not");
        float num = 34.33f;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("number is present in an array");
        }
        else{
            System.out.println("number is not present in an array");
        }
        System.out.println("QUESTION # 03: Calculate the average marks from an array containing marks of all students in Physics using for each loop");
        int [] Physics_marks = {56,67,87,87,23,55};
        sum = 0;
        for(int element:Physics_marks){
            sum = sum + element;
        }
        float avg =  sum/Physics_marks.length;
        System.out.println(avg);

        System.out.println("QUESTION # 04: Create a program to add two metrics of size 2x3");
        int [][] metric1 = {{34,54,21},
                            {23,65,20}};
        int [][] metric2 = {{21,33,58},
                            {69,54,32}};
        int [][] result = {{0,0,0},
                           {0,0,0}};
        for (int i=0;i<metric1.length;i++){//rows
            for (int j=0;j<metric1[i].length;j++){// columns
                System.out.format("Setting value for i =%d and j=%d \n",i,j);
                result[i][j] = metric1[i][j]+metric2[i][j];

            }
        }
        //for printing result:
        for (int i=0;i<metric1.length;i++){//rows
            for (int j=0;j<metric1[i].length;j++){// columns
                System.out.print(result[i][j]+" ");
                result[i][j] = metric1[i][j]+metric2[i][j];


            }

            System.out.println("");
        }


        System.out.println("QUESTION # 05: Write a program to reverese an array");
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        // Reversing the array in-place
        for(int i = 0; i < n / 2; i++){
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        // Print reversed array
        System.out.print("Reversed array: ");
        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println("");

        System.out.println("QUESTION # 06: Write a program to find maximum element in array");

        int max = arr[0]; // assume first element max

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Maximum element is: " + max);
        System.out.println("QUETSION # 07: Write  a program to find miniumum element in array");

        int min = arr[0]; // assume first element min

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Minimum element is: " + min);

        System.out.println("QUESTION # 08: Write a program to find whether an array is sorted or not");
        int[] arr1 = {12, 23, 33, 55, 67, 98};

        boolean isSorted = true;

        for(int i = 0; i < arr1.length - 1; i++){
            if(arr1[i] > arr1[i+1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
