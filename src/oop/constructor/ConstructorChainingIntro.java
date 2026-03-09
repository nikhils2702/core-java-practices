package oop.constructor;

class ConstructorParent{

    public ConstructorParent(){
        System.out.println("No-argument of ConstructorParent class");
    }
    public ConstructorParent(int a, String b){
        System.out.println("argument of ConstructorParent class");
    }
}

public class ConstructorChainingIntro extends ConstructorParent{

    public ConstructorChainingIntro(){
        System.out.println("No-argument of Constructor of child class");
    }
    public ConstructorChainingIntro(int a, String b){
        System.out.println("argument of Constructor of child class");

    }


}
