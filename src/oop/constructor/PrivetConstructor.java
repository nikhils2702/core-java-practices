package oop.constructor;

public class PrivetConstructor {
       String name;
       int age;

       // constructor declare as a privet
    private PrivetConstructor(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name" + name);
        System.out.println("age" + age);
    }

    public static void main(String[]args){

        // Creating an object of a class within the same class.
        PrivetConstructor obj = new PrivetConstructor(" Nikhil",25);

        obj.display();

    }

}
