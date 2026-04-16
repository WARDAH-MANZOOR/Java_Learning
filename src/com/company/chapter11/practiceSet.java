package com.company.chapter11;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void changeNib(){
        System.out.println("Change Nib");
    }
    public void write(){
        System.out.println("Write");
    }
    public void refill(){
        System.out.println("Refill");
    }

}
class Monkey{
    void jump(){
        System.out.println("Jump");
    }
    void bite(){
        System.out.println("Bite");
    }
}
interface Animal{
    void eat();
    void sleep();
}
class Human extends Monkey implements Animal{
    public void eat(){
        System.out.println("Eat");
    }
    public void sleep(){
        System.out.println("Sleep");
    }
}
public class practiceSet {
    public static void main(String[] args) {
        System.out.println("PRACTICE QUESTIONS FOR CHAPTER 11");

        System.out.println("QUESTION # 01: Create an abstract class Pen with methods write() and refill() as abstract methods.");

        System.out.println("QUESTION # 02: Use the Pen class from Q1 to create a concrete class FountainPen with additional method changeNib().");
        FountainPen fountainPen = new FountainPen();
        fountainPen.write();
        fountainPen.refill();
        fountainPen.changeNib();

        System.out.println("QUESTION # 03: Create a class Monkey with jump() and bite() methods. Create a class Human which inherits this Monkey class and implements BasicAnimal interface with eat() and sleep methods.");
        Human human = new Human();
        human.jump();
        human.eat();
        human.sleep();
        human.bite();
        System.out.println("QUESTION # 04: Create a class Telephone with ring(), lift() and disconnect() methods as abstract methods. Create another class SmartTelephone and demonstrate polymorphism.");

        System.out.println("QUESTION # 05: Demonstrate polymorphism using Monkey class from Q3.");

        System.out.println("QUESTION # 06: Create an interface TVRemote and use it to inherit another interface SmartTVRemote.");

        System.out.println("QUESTION # 07: Create a class TV which implements TVRemote interface from Q6.");

    }
}
