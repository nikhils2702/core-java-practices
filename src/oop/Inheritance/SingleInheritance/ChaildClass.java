package oop.Inheritance.SingleInheritance;

// Single oop.Inheritance

class ParentClass{
    void Test(){
        System.out.println("ParentClass Method ");
    }

}
public class ChaildClass  extends ParentClass{

    void Test2(){

        System.out.println("ChaildClass Method");
    }

    public static void main(String[] args){

        ChaildClass obj = new ChaildClass();
         obj.Test2();
         obj.Test();

    }
}
