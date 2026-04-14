package com.company.chapter9;

class Cylinder{
    private int radius;
    private int height;
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

class SurfaceAreaAndValoumneOfCylinder{
    private int radius;
    private int height;
    float pie = 3.14f;
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public float AreaOfCylinder(){
        float AreaOfCylinder = (2 * pie * (radius*radius)) + (2* pie * radius * height);
        return AreaOfCylinder;
    }
    public float VolumeOfCylinder(){
        float VolumeOfCylinder = pie * (radius * radius) * height;
        return VolumeOfCylinder;
    }


}
class CylinderUsingConstructor{
    private int radius;
    private int height;
    public CylinderUsingConstructor(){
        radius = 100;
        height = 50;
    }
    public int getRadius(){
        return this.radius;
    }
    public int getHeight(){
        return this.height;
    }

}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public Rectangle() {
        this.length = 55;
        this.length = 34;
    }

    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }

}
class Sphere{
    private int radius;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return this.radius;
    }
}
public class practiceSet {
    public static void main(String[] args) {
        System.out.println("PRACTICE QUESTIONS FOR CHAPTER 9");

        System.out.println("QUESTION # 01: Create a class cylinder and use getters and setters to set its radius and height ");
        Cylinder c = new Cylinder();
        c.setRadius(5);
        c.setHeight(6);
        System.out.println(c.getRadius());
        System.out.println(c.getHeight());
        System.out.println("QUESTION # 02: Use question 1 to calculate surface area and volume of cylinder");
        SurfaceAreaAndValoumneOfCylinder  s = new SurfaceAreaAndValoumneOfCylinder();
        s.setRadius(5);
        s.setHeight(6);
        System.out.println(s.VolumeOfCylinder());
        System.out.println(s.AreaOfCylinder());
        System.out.println("QUESTION # 03: Use a constructor and repeat question 1");
        CylinderUsingConstructor cc = new CylinderUsingConstructor();
        System.out.println(cc.getRadius());
        System.out.println(cc.getHeight());

        System.out.println("QUESTION # 04: Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters");
        Rectangle r = new Rectangle(45,22);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

        System.out.println("QUESTION # 05: Repeat question1 for sphere");
        Sphere sp = new Sphere();
        sp.setRadius(5);
        System.out.println(sp.getRadius());
    }
}
