package Static.StaticBlock;

abstract class Parent{
    static{
        System.out.println("Static block executed");
    }
}
class Child extends Parent{
    static{
        System.out.println("Child block executed");
    }
}

public class StaticPractice {
    public static void main(String[] args) {
        Child child = new Child();

    }
}
