package oop.Inheritance.Hybrid;

class Animal{
    String Slow = "very slow";
    void Breth(){
        System.out.println("Brething..." + Slow);
    }
}
class Mammal extends Animal{
    int a = 10;
    void walk(){
        System.out.println("Mammal walking..." + a + "km");
    }
}
class Dog extends Mammal{
    void eat(){
        System.out.println("Dog eating...");
    }
}
class Cat extends Mammal{
    void eat(){
        System.out.println("Cat eating...");

    }
}

public class Main {
    public static void main(String[] args){

          Dog obj = new Dog();
          obj.Breth();
          obj.walk();
          obj.eat();

        Cat obj2 = new Cat();
           obj2.Breth();
           obj2.walk();
           obj2.eat();


    }
}
