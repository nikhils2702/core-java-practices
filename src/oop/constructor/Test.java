package oop.constructor;

public class Test {

    public Test() {
            System.out.println("no argument constructor");
        }
    public Test(int a) {
        System.out.println("no argument constructor");
    }
    public Test(int a,int b) {
        System.out.println("no argument constructor");
    }
        {
            System.out.println("instance block executed");
        }
        static{
            System.out.println("Ststic block executed");
        }
    public static void main(String[] args) {
        Test obj = new Test();
        Test obj1 = new Test(10);
        Test obj2 = new Test(12,30);
    }
}