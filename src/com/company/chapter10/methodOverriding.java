package com.company.chapter10;
class A{
    public void method1(){
        System.out.println("hellow i am method 1 of class A");
    }
    public void method2(){
        System.out.println("hellow i am method 2 of class A");
    }
}
class B extends A{ // class B class A se inherited hai iska matlb hai ke class A ke sare methods class B me majood hain
    public void method1(){ // class A ke andar method1 pehle se majood hai with no parameters aur humne class B me dobara
        // banaya tou same name with no parameters tou iska matlab hai ke hum class A ke method 1 ko override kararhe hain
        System.out.println("hellow i am method 1 of class B");
    }
    public void method3(){
        System.out.println("hellow i am method 3 of class B");
    }

        }
public class methodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.method1();
        B b = new B();
        b.method1();// ye pehle class A me gaya wahan method1 uthaya jisme koi parameters nahi thay phr class B ke paas gaya
        // tou dekha ke class B me bhi method1 ke name se method hai aur usme bhi koi parameters nahi hain  tou phr isne
        // class A ke method1 ko override karra=dia aur class B ke method1 ko printkia

    }
}
