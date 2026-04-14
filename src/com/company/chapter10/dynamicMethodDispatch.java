package com.company.chapter10;
class Phone{
    public void greeting(){
        System.out.println("hello world");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }
}
class SmartPhone extends Phone{
    public void welcome(){
        System.out.println("welcome to SmartPhone");
    }
    public void on(){
        System.out.println("Turning on smartPhone");
    }
}
public class dynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();// dynamic method dispatch
        obj.greeting();
        obj.on(); // ye smartphone ka run hoga kuinkeobject jo bana hai new SmartPhone bana hai
//        obj.welcome();   // --- ye call nahi kia jasakta kuinke reference tou Phone ka hihai na bhale obj
//        smartPhone banaya hai methodsare Phone class ke hi callhorahehain bas jo override horaha tah
//        uskeliyesceneriotha ke wo smartPhone se overried hoga kuinke override ke case me ye ye dekhta hai
//        ke object kiska bana hai , baki jo methods overrride nahi unke case me ye dkehta ahi ke reference kiska hai

    }
}
