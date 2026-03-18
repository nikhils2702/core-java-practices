package oop.polymorphisum.MethodOverridden;

class Parent4{
    public void methodOne(int...i){
        System.out.println("parent class method call");
    }
}
class Child4 extends Parent4{
    public void methodOne(int i){
        System.out.println("child class method call");
    }
}
public class VarArgOverridingTest {
    public static void main(String[] args) {
        Parent4 obj = new Parent4();
        obj.methodOne(20);

        Child4 obj1 = new Child4();
        obj1.methodOne(10);

        Parent4 obj3 =new Child4();
        obj3.methodOne(10);

    }
}
