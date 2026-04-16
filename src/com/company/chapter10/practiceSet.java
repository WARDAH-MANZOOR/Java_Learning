package com.company.chapter10;
class circle{
    public void circle(){
        System.out.println("Hello i am circle");
    }
}
class cylinder extends circle{
    public void cylinder(){
        System.out.println("Hello i am cylinder");
    }


}


class Rectangle{
    public void rectangle(){
        System.out.println("Hello i am rectangle");
    }
}
class cuboid extends Rectangle{
    public void cuboid(){
        System.out.println("Hello i am cuboid");
    }
}

class circle1{
    int radius;
    circle1(int radius){
        this.radius = radius;
    }

    public double area(){
        double area =  Math.PI * (this.radius * this.radius);
        System.out.println(area);
        return area;
    }
}
class cylinder1 extends circle1{
    int height;
    cylinder1(int radius, int height){
        super(radius);
        this.height = height;

        System.out.println("Hello i am cylinder");
    }
    public double volume(){
        double volume =  Math.PI * (this.radius * this.radius) * height;
        System.out.println(volume);
        return volume;
    }
}
class Rectangle1 {
    private int length;
    private int width;

    // Constructor
    Rectangle1(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Getter & Setter for length
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Getter & Setter for width
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Area Method
    public double area() {
        double area = length * width;
        System.out.println("Area: " + area);
        return area;
    }
}

// Cuboid class
class Cuboid1 extends Rectangle1 {
    private int height;

    // Constructor
    Cuboid1(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    // Getter & Setter for height
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Volume Method
    public double volume() {
        double volume = getLength() * getWidth() * height;
        System.out.println("Volume: " + volume);
        return volume;
    }
}

public class practiceSet {
    public static void main(String[] args) {
        System.out.println("PRACTICE QUESTIONS FOR CHAPTER 10");

        System.out.println("QUESTION # 01: Create a class cirle and use inheritance to create another class cylinder from it");
        cylinder cylinder = new cylinder();
        cylinder.circle();
        cylinder.cylinder();

        System.out.println("QUESTION # 02: Create a class Rectangle and use inheritance to create another class cuboid. Try to keep it as close to real world as possible ");
        cuboid cuboid = new cuboid();
        cuboid.rectangle();
        cuboid.cuboid();

        System.out.println("QUESTION # 03: Create methods for area and volumne in question 1");
        cylinder1 cylinder1 = new cylinder1(30,56);
        cylinder1.area();
        cylinder1.volume();

        System.out.println("QUESTION # 04: Create methods for area and volume in question 2, also create getters and setters");
        Cuboid1 cuboid1 = new Cuboid1(8,4,10);
        cuboid1.area();
        cuboid1.volume();


    }
}
