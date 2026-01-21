package oop.Inheritance.hierarchicalInheritance;

public class India {
    void State(){
        System.out.println("Total 28 state in India");
    }
}
class Maharastra extends India{
    void District(){
        System.out.println("total 36 District in maharastra");
    }
}
class Himachal extends India{
    void District(){
        System.out.println("total 25 District in Himachal");
    }
}
