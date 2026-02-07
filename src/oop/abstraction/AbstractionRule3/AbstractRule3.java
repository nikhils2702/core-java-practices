package oop.abstraction.AbstractionRule3;

//We can not create an object of abstract class.

abstract class Abstract{

    abstract void Display();

}

public class AbstractRule3 {
    public static void main(String[] args) {
        AbstractionRule3 ab = new AbstractionRule3();

       // Abstract obj = new Abstract();    //We can not create an object of abstract class.
    }

}
