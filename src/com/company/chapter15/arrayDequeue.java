package com.company.chapter15;

import java.util.ArrayDeque;
import java.util.LinkedList;

// arrayDequeue me insersion aur deletion asan hoti hai humme bas ye batana hota hai ke last me insert ya delete karba
// hai ya shuru me ye khud hi phr add /delete kardeta hai shuru me bhi last me bhi aur phr usko manage bhi khud karta
// hai humme tension nahi leni hoti ke hum array exactly kis sie ka banain, humme index ki tension lene ki zaroorat nahi
// hoti ke konsa element kis index par store karna hai ye arrayDequeue khud karta hai
// dequeue ka matlab hota hai ke double queue , matlab ye ke insertion dletion hum agay peeche dono side se karsakte
// normal queueu me agy se deletion aur peeche se insertion hoti hai
public class arrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(1);
        ad1.add(20);
        ad1.add(34);
        ad1.add(41);
        ad1.add(57);
        ad1.addLast(45);
        ad1.addFirst(450);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

    }
}
