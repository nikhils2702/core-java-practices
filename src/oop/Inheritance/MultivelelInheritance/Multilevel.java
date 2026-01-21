package oop.Inheritance.MultivelelInheritance;

// multilevel
public class Multilevel {

    void Emp(){
        System.out.println("First Class");
    }
}

class Company1 extends Multilevel{

    void EmpName(){
        System.out.println("Akash");
    }
}

class Company2 extends Company1 {
    void EmpName2() {
        System.out.println("Jagtap");
    }

    public static void main(String[] args) {
        Company2 obj = new Company2();
        obj.EmpName2();
        obj.EmpName();
        obj.Emp();
    }
}