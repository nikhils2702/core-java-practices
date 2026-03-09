package oop.polymorphisum.MethodOverridden;

public class Base {
    void m1() {
        System.out.println("m1-Base");
    }
}

class Derived extends Base {
    void m1(){
        System.out.println("m1-Derived");
    }

    public static void main(String[]args){
        Derived obj = new Derived();
        obj.m1();  // calling m1 methode of class derived.

        Base obj1 = new Base();
        obj1.m1();  // Calling m1() method of class Base.
    }
}
