package com.company.chapter15;
// array list is the modified version of array, jo cheezen hum array me nahi karsakte ahin wo
// hum arrayLst se karsakte hain

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(0,10);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(6);


        list.addAll(list2); // adding list2 in list
//        list.addAll(0,list2);// index 0 par list 2 ko dalo
//        list.clear(); // sare elements clear kardo list ke
        System.out.println(list.contains(19));
        System.out.println(list.indexOf(6));
        System.out.println(list.lastIndexOf(6));
        list.set(1,17);


        for(int i =0; i<list.size();i++){
            System.out.print(list.get(i));
            System.out.print(", ");
        }

    }
}
