package oop.abstraction.AbstractionRule4;

//If one abstract class extends another abstract class.
//then it's not mandatory for that child class to provide method implementations of
//abstract method of super class.

abstract class Rule4Parent{

     void test(){

     }

}

abstract class Rule4Child extends Rule4Parent{

    void test(){
        System.out.println("one abstract class extends for another abstract class"+
                " and providing implementation to abstract methode ");
    }



}
public class RuleNo4Abstraction {

    public static void main(String[] args) {


    }
}
