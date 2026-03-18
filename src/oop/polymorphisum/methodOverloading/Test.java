package oop.polymorphisum.methodOverloading;

public class Test {
    public void methodOne(){
        System.out.println("call first method");
    }
    public void methodSecond(int n){
        System.out.println("call second method");
    }
    public void methodThird(int n, String s){
        System.out.println("call Third method");
    }

    public static void main(String[] args) {

        Test obj = new Test();
        obj.methodOne();
        obj.methodSecond(10);
        obj.methodThird(20, "Nik");
    }
}
