package com.company.chapter8;
// Object Oriented Programming:  Solving a program by creating objects is one f the most popular approaches in programming
// this is called object oriented programming

// DRY --------- Donot repeat yourself
// Class ---- A class is a blueprint for creating objects(Student application form template without filled)
// Object ----- An object is an instantiation of a class , when a class is defined a template(info) is
// defiend. Memory is allocated only after object instantiation (student applcation form filled with real world data)

// Abstraction:  --- hiding internal details (show only essential info)
// Encapsulation:  ---- the act of putting various components together, sensitive data can be hidden from users
// Inheritance:  ----- The act of deriving new things from the existing things (example phone to smart phone(smart phone
// contains features from phone but it lso ahve its new features) inheritance implements DRY concept
// Polymorphism: ---- One entity many forms (example smart phon eko hum as a phone bhi us ekarte hain as a
// calculater bhi as a caldendar bhi)

class Employee{  // custom class with 2 attributes, we cannot make this class public by adding public add
    // the start of class because 1 file only contains 1 public class
    int id;
    String name;
}

class Employee1{  // adding method in custom class
    int id;
    String name;
    public void printDetails(){
        System.out.println("employee id is "+id);
        System.out.println("employee name is "+name);
    }
}
public class creatingCustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        //class Employee
        Employee emp = new Employee(); // instantiating a new Employee object
        // setting attributes/properties
        emp.id = 100;
        emp.name = "John";

        System.out.println(emp.id);
        System.out.println(emp.name);

        // class Employee1
        Employee1 emp1 = new Employee1();
        // 1st employee details
        emp1.id=66;
        emp1.name="Wardah";
        emp1.printDetails(); // printing by just calling a method

        // 2nd employee details if we want to add
        Employee1 emp2 = new Employee1(); // again instantiate for employee2
        emp2.id=77;
        emp2.name="Jane";
        emp2.printDetails();

    }

}
