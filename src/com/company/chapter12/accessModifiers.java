package com.company.chapter12;
// Access modifier determines whether other class can use a particular field or invoke a particular method.can be
// public , private, protected or default(no modifier)
//if Modifier Public----  accessible in same class , subclass,pacakge, world
// if Modifer(Private) ---- accessible in same class , not accesible in subclass,pacakge, world
// if Modifer(protected) ---- accessible in same class ,subclass,pacakge not accesible in world
// if no Modifer (Default) ---- accessible in same class, pacakge , not accesible in subclass, world

// World ka matlab yahan ye hai ke na hi same pacakge , na same class na sub class outside in teeno cheezon ke world
// kehlaaiga

class C1{
    public int x =5;   // public
    protected int y =6;   // protected
    int z =7; ;  // no modifier
    private int a =8;; // private
    public void meth1(){  // hum print karke dekh rahe charon fields ko private, public, no modifier, protected ko
        // ke ye acessible hain same class me ke nahi tou uske liye meth1 ka mehthod banaya hai aur usme print kia hai aur phr
        // objet banakar call kia hai tou print horahi hain sari values tou iska matlab hai ke ye sari fields apni hi calss
        // me accessible ahin jese ke mene ooepr explanation me bhi likha tha
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
class C2 extends C1{ // ye subclass banai isliye ke dekhen ke konsi field subclass em accesible hai aur konsi nahi
    // explanation ke hisab se jo ooper hai likha hai ke srf public uar proted hi accessibe hain dosri class me ,
    // priavte aur no modifier allowed nahi



}
public class accessModifiers {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.meth1();
        // ab dekhna hai ke same pacakge me us ekarsakte hain ke nahi toue xaplanatio ke hisab se hum srf private modifier
        //w ali field ko his am epacakge me use nahi karsakteahin bakion ko karskate hain  neeche dekhen
        System.out.println(c1.x); // same pacakge me x use hoarhaahi allowed
        System.out.println(c1.y);  // same as y
        System.out.println(c1.z); // same as z
//        System.out.println(c1.a); // not allowed kuinke a private ahi

        C2 c2 = new C2();
        System.out.println(c2.x);
        System.out.println(c2.y);
//        System.out.println(c2.z);//  not allowed no modifier in subclass
//        System.out.println(c2.a); // not allowed private modifier in subclass

    }
}
