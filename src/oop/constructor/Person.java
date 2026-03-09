package oop.constructor;

public class Person {

    // declaration instance variable

    String name;
    int age;
    String address;

    // here we are not creating constructor
    // java compiler will automatically insert default constructor.

    void display(){

        System.out.println(name + " "+ age + " " + address);
    }

    public static void main(String[]args){

         // create object of class using new keyword
        Person obj = new Person();  // calling default constructor

        obj.display();
    }
}
