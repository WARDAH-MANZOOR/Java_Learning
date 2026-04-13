package com.company.chapter8;
class Employees{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class cellPhone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void calling(){
        System.out.println("Calling");
    }
    public void vibrating(){
        System.out.println("Vibrating");
    }
}
class square{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class rectangle{
    int length;
    int width;
    public int area(){
        return length * width;
    }
    public int perimeter(){
        return 2*(length + width);
    }
}
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from enemy");
    }
    public void fire(){
        System.out.println("firing on the enemy");
    }
}
class circle{
    int radius;
    float pie;
    public float area(){
        return pie * (radius*radius);
    }
    public float perimeter(){
        return 2*pie*radius;
    }
}
public class practiceSet {
    public static void main(String[] args) {
        System.out.println("PRACTICE QUESTIONS FOR CHAPTER 8");

        System.out.println("QUETSION # 01: Create a class employee with following properties and methods:\n salary (property: int) \n getSalry (method: returning int)\n name (property: string)\n getName (method: returning string)\n setName (method: changing name)");
        Employees wardah = new Employees();
        wardah.setName("Wardah");// settinga name
        System.out.println(wardah.getName());// getting setted name
        wardah.salary = 100;
        System.out.println(wardah.getSalary()); // getting salary

        System.out.println("QUETSION # 02: Create a class cellpone with methods to print \"ringing\",\"vibrating\" etc ");
        cellPhone phone = new cellPhone();
        phone.ring();
        phone.calling();
        phone.vibrating();

        System.out.println("QUETSION # 03: Create a class square with a method to initialize its sides, calculating area , its perimeter etc");
        square sq = new square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        System.out.println("QUETSION # 04: Create a class rectangle with a method to initialize its sides, calculating area , its perimeter etc ");
        rectangle rt = new rectangle();
        rt.length = 25;
        rt.width = 45;
        System.out.println(rt.area());
        System.out.println(rt.perimeter());

        System.out.println("QUETSION # 05: Create a class Tommy for rockstar games capable of hitting(print hitting), running, firing etc");
        Tommy tommy = new Tommy();
        tommy.hit();
        tommy.run();
        tommy.fire();
        System.out.println("QUETSION # 06: Create a class circle with a method to initialize its sides, calculating area , its perimeter etc ");
        circle  circle = new circle();
        circle.radius = 45;
        circle.pie = 3.14f;
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
    }
}
