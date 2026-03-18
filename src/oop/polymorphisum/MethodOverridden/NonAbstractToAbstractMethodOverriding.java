package oop.polymorphisum.MethodOverridden;

class Parent2{
    void methodeOne(){
        System.out.println("non abstract method");
    }
}
abstract public class NonAbstractToAbstractMethodOverriding extends Parent2{
    void methodOne(){
        System.out.println("abstract method");
    }

    public static void main(String[] args) {
        Parent2 obj = new Parent2();
        obj.methodeOne();

    }
}
