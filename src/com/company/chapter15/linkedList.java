package com.company.chapter15;

import java.util.ArrayList;
import java.util.LinkedList;

// array resize nahi hosakta tha, tou arrayLis aya usne ye issue solve kardia jo bhi operations hum simple array par
// perform nahi karsakte thay wo asani se arrayList se hoskate hain par ab arrayList me bhi aik issue hai wo ye ke
// agr 2000 elements ka array hai aur humne uska 5th element remove karna hai tou 5th element remove karne ke baad
// sare elements ko shift hona parega peeche jisme bahut time lagjaaiga , is time ko issue ko solve karne ke liye
// linkedList ka use kia jata ahi
// linkedlist me har element aik ovject ki tarahh hota hai jiske aas previous elemnt ka refernce+ next element ka
// reference hota hai matlab ye ke wo previous elemnet + next element se connected ota hai, isse ye hota hai ke agr
// mujhe 2nd element par kuch add karna hai tou 1st element of 3rd element ka link banjaaiga 2nd element ke sath
// istarah koi bhi cheez shift nahi hogi sab ani jaga rahenge bas links add hojainge previous +necxt element ke sath.
// linkedlist aur arrayList ke methods takreean same hain linkedList me kuch additional methods hain
public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(0,10);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(6);


        list.addAll(list2); // adding list2 in list
        list.addLast(45); // linkedlist method, not in arrayList
        list.addFirst(450); // linkedlist method, not in arrayList

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
