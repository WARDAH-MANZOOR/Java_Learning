package com.company.chapter7;

public class methodsConcept {
    static void tellJoke(){ // jab humne method se kuch bhi return nahi karwana hota touhum void use karte hain return type ki jaga
        System.out.println("hahahaha");
    }
    static void change(int a){
        a=98;
    }
    static void changeInArray(int [] arr){
        arr[0]=98;
    }
    public static void main(String[] args) {
        tellJoke();
        // CHANGING IN INTEGER
        int x = 45;
        change(x);
        System.out.println("The value of x after passing to change method is: " + x); // returns 45 beacuse x =45 is going towards cahnge method as a copy so it does not change here

        // CHANGING IN CASE OF ARRAY:
        int [] marks = {2,4,8,9,10};
        changeInArray(marks);
        System.out.println("The value of marks[0] after passing to change method is: " + marks[0]); //change hoga marks[0] aur
        // cahnge hokar 98 hojaiga jo ke changeInarray ke method me defined hai is waja se ke array as a refrence pass hota
        // hai tou ye change hoga, ye isliye hua kuinke yahan humne object ki copy banakar paas nahi ki yahan humne refernce
        // direct pass kia hia jiski wja se direct object me change hoga



    }
}
