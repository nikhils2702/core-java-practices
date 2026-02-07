package oop.abstraction.AbstrsctionRule1;


import Static.StaticMethods.Rule4StaticMethode;

//It's not mandatory to have abstract method in abstract class.
abstract class Rule1Abstract{
    void show(){
        System.out.println("non abstract method first");
    }

    void add(){
        System.out.println("non abstract methode second");
    }

}


public class AbstractRule1 extends Rule1Abstract{
    public static void main(String[] args) {
        AbstractRule1 obj = new AbstractRule1();
        obj.add();
        obj.show();


    }



}
