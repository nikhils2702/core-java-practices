package oop.polymorphisum.methodHiding;

class Parent{
    public static void methodOne(){
        System.out.println("parent class methodOne call");

    }
}
public class MethodHidingExample extends Parent{
    public static void methodOne(){
        System.out.println("call child class method");
    }

    public static void main(String[] args) {
        MethodHidingExample obj = new MethodHidingExample();
        obj.methodOne();
    }
}
