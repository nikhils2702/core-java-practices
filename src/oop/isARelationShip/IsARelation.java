package oop.isARelationShip;

class Parent{
    void methodOne(){
        System.out.println("method one access");
    }
}
class Child extends Parent{
    void methodTwo(){
        System.out.println("Method two Access");
        }
}
public class IsARelation {
    public static void main(String[] args) {

        Parent obj = new Parent();
        obj.methodOne();
//        obj.methodTwo();  // object create only parent class therefore call only parent class method

        Child obj1 = new Child();
        obj1.methodOne();
        obj1.methodTwo();

        Parent obj2 = new Child();
        obj2.methodOne();
//        obj2.methodTwo();  //reference Parent class then call only Parent class

//        Child obj3 =new Parent();  //CE. Incomplete type of found
//        obj1.methodOne();
//        obj1.methodTwo();

    }
}
