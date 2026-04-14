package com.company.chapter10;
// Inheritance: Inheritance is used to borrow properties and methods from an existing class
class Base{  // parent class/base class, super class
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void printme(){
        System.out.println("hello i am wardah");
    }
}
class Derived extends Base{ // derived/child/sub class (this derived class inherits all features of base class by
    // using extend keyword
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        // parent class
        Base base = new Base();
        base.setX(23);
        System.out.println("base.getX() = " + base.getX());

        // derived class
        Derived d = new Derived();
        d.setY(7);
        System.out.println(d.getY());
        d.setX(8); // parent class method available in derive class
        System.out.println(d.getX());


    }
}
