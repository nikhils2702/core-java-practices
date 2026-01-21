package oop.abstraction;

abstract class Vehicle{
    public abstract void drive();

    public void brack(){
        System.out.println("push the brack");
    }
}

class Car extends Vehicle{
    public void derive(){
        System.out.println("Start the car");
    }
}

public class AbstractionRule2 {

    public static void main(String[] args){
        Car obj = new Car();
        obj.drive();
    }
}
