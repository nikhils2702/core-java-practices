package oop.polymorphisum.MethodOverridden;

class Parent{
    public void Property(){
        System.out.println("cash + land + gold");
    }
    public void marry(){
        System.out.println("lakshmi");
    }
}
class Child extends Parent{
    public void marry(){
        System.out.println("3sh,4me,9tra");
    }

}
public class Test {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.marry();

        Child obj1 = new Child();
        obj1.marry();

        Parent obj2 = new Child();
        obj2.marry();

    }

}
