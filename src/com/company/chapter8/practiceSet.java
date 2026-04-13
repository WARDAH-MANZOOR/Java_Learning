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
        System.out.println("QUETSION # 04: Create a class rectangle with a method to initialize its sides, calculating area , its perimeter etc ");
        System.out.println("QUETSION # 05: Create a class Tommy for rockstar games capable of hitting(print hitting), running, firing etc");
        System.out.println("QUETSION # 06: Create a class circle with a method to initialize its sides, calculating area , its perimeter etc ");

    }
}
