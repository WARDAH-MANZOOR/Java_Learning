package com.company.chapter11;
// interface ko inteface ke andar inherit kia jaskata hai extends ke keyword s eyahan inheritance ka concept ata hai
// matlab ye ke hum interface ko class ke andar inherit(extend) nahi karsakte humme implement karna parta hai aurinterface
// ke methods ko override karna parta hai ,ab ye hai ke jese humne aik interface banaya ab humme dosre interface me wahi same
// methods chahiye tou dsre interface me usko dobara tou define nahi karenge DRY(DONOT REPEAT YOURSELF) ke hsiab se is
// waja se hum aik interfaceko dosre interface me inherit karlenge , interface  dosre interface me inherit ho sakta hai
// kisis class me interface inherit(extend) nahi hota implement hota hai
interface sampleInterface{
    void meth1();
    void meth2();

}
interface childSampleInterface extends sampleInterface{ // I WANT METH1 AND METH2 IN THIS INTERFACE THATS WHY WE INHERIT
    // BY USING EXTENDS KEYWORD
    void meth3();
    void meth4();
}
class SampleClass implements childSampleInterface{
    // meth1 aur meth2 bhi define karna para kuinke meth1 aur meth2 childSampleInterface me inherited hain
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class inheritanceInInterfaces {
    public static void main(String[] args) {

    }
}
