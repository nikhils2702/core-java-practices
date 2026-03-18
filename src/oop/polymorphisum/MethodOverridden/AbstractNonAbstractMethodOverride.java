package oop.polymorphisum.MethodOverridden;


abstract class Parent1{
    void methodOne(){
        System.out.println("abstract class methode override");
    }

}
public class AbstractNonAbstractMethodOverride extends Parent1{
    void methodeOne(){
        System.out.println("Non-Abstract class methode Override");
    }

    public static void main(String[] args) {
        AbstractNonAbstractMethodOverride obj = new AbstractNonAbstractMethodOverride();
        obj.methodeOne();
    }
}
