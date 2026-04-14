package com.company.chapter9;

class Cylinder{
    int radius;
    int height;
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getRadius(){
        return this.radius;
    }
    public int getHeight(){
        return this.height;
    }
}
public class practiceSet {
    public static void main(String[] args) {
        System.out.println("PRACTICE QUESTIONS FOR CHAPTER 9");

        System.out.println("QUESTION # 01: Create a class cylinder and use getters and setters to set its radius and height ");
        Cylinder c = new Cylinder();
        c.setRadius(5);
        c.setHeight(5);
        System.out.println(c.getRadius());
        System.out.println(c.getHeight());
        System.out.println("QUESTION # 02: Use question 1 to calculae surface area and volume of cylinder");
        System.out.println("QUESTION # 03: Use a constructor and repeat quetsion 1");
        System.out.println("QUESTION # 04: Oberload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters");
        System.out.println("QUESTION # 05: Repeat question1 for sphere");
    }
}
