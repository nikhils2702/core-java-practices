package oop.abstraction.AbstractionRule5;

//If concrete/non-concrete class extends abstract class, then its mandatory
//for that child class to provide method implementation of abstract method of super class.


abstract class Rule5Parent{

    abstract void test();


}

public class Rule5Abstraction extends Rule5Parent {

    void test(){
        System.out.println("here child is concrete class so we must" +
                "provide implementation to abstract methode of parent clas ");
    }



    public static void main(String[] args) {
        Rule5Abstraction obj = new Rule5Abstraction();
        obj.test();
    }
}
