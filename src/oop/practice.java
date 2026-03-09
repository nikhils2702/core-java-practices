package oop;

abstract class Animal {
  public Animal(){
      System.out.println("Hello");
    }

    abstract void eat();
}
class Cat extends Animal {
    void eat(){
        System.out.println("Cat is eating");
    }
}

public class practice {
    public static void main(String[] args) {
        Animal obj = new Cat();
        obj.eat();
    }
}




