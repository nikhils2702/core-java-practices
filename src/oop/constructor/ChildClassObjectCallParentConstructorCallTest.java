package oop.constructor;

abstract class Parent{
    Parent(){
        System.out.println(this.hashCode());
    }
}
class Child extends Parent{
    Child(){
        System.out.println(this.hashCode());
    }
}
public interface ChildClassObjectCallParentConstructorCallTest {

    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.hashCode());
    }
}
