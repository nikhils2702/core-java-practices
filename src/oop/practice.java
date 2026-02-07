package oop;

abstract class animal{
    abstract void eat();
}
class Cat extends animal{
    void eat(){
        System.out.println("Cat is eating");
    }
}

public class practice {
    public static void main(String[] args) {
        animal obj = new Cat();
        obj.eat();
    }
}
