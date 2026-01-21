package oop.Inheritance.hierarchicalInheritance;

public class Haierarchical {
    void Test(){
        System.out.println("Call First");
    }
}

class Emp extends Haierarchical{
    void Test1(){
        System.out.println("one");
    }
}
class Emp2 extends Haierarchical{
    void Test2(){
        System.out.println("Two");
    }

    public static void main(String[] args){
        Haierarchical obj = new Emp2();


    }
}


