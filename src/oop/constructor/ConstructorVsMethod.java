package oop.constructor;

public class ConstructorVsMethod {


    public ConstructorVsMethod() {// this is a constructor

        System.out.println("Non-access modifiers not apply with constructor, ");

        System.out.println("You not apply privet access modifier with constructor");

    }


    public void ConstructorVsMethod(){ // This is a method

        System.out.println("This is method because return type 'void' ");
    }

}