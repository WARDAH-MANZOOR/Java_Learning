package com.company.chapter15;

import java.util.HashSet;

// hashing technique: technique to convert key value pairs in indexes, matlab ye ke konse key value pairs konse indexes
// par storekiye jaainge
// hashing technique se searching aur insertion  bahut fast hojati hai ye remainder ke basis par store karata hai
// element matlab ye ke ab jese ye ke array ka size 10 hai aur humne value store karni hai '72' tou iska mod niklega
// 72(value to store % 10 (array size) phr iska jo reminder aaiga jese iska remainder 2 aya tou ye 72 ki value index 2
// par save hogi, ab isme bhi issues hain wo ye ke agr 3 values save karwani hain aur 2 values ka remainder same aya
// jese 3 aya remainder tou ab aik hi index par 2 values kese dalen tou isko kehte hain hash collision tou iske
// liye open addressing ki technique us ehoti hai ke aik value tou apne hi remainder wale index par save hojati aur
// dosri value kissi bhi khali space me , isko dosri atrah bhi kia jaskata hai chaining method ke through usme ye
// hota hai ke ab dono values ka remainder 3 hai matlab dono values ko 3rd index par dalna hai tou uske liye
// us third index par aik linkedlist banai jatihai aur phr us linkedlist me dono values dal di jati hain isse
// chaining method kehte hain
// hashing classes: hashMap, ahshTable, hashSet,linkedHashMap
public class hashingTechniqueAndHashClassHashSet {
    public static void main(String[] args) {
//        HashSet<Integer> hashSet = new HashSet<Integer>();// agr hum without initial capacity ke argumnet ke likhenege
        // tou initial capacity 16 set hogi aur load factor 0.75
        HashSet<Integer> hashSet = new HashSet<Integer>(6,0.5f);
        hashSet.add(1);
        hashSet.add(22);
        hashSet.add(3);
        hashSet.add(41);
        System.out.println(hashSet);
    }
}
