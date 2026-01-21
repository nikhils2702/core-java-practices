package oop.Inheritance.MultivelelInheritance;

public class Multilevel2 {

    void Test(){
        System.out.println("First class");
    }
}

class Multilevel3 extends Multilevel2{
    void Test2(){
        System.out.println("First Class Gread");
    }
}

class Multilevel4 extends Multilevel3{
    void Test3(){
        System.out.println("second class");
    }

    public static void main(String[]args){
        Multilevel4 obj = new Multilevel4();
        obj.Test();
        obj.Test2();
        obj.Test3();


    }
}
