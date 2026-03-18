package oop.polymorphisum.methodOverloading.atomicPramotionOverLoding;

public class Case5 {
    public void methodOne(int i){
        System.out.println("general method");
    }
    public void methodOne(int... i){
        System.out.println("var arg method");
    }

    public static void main(String[] args) {
        Case5 obj =new Case5();

        obj.methodOne();
        obj.methodOne(10,30);
        obj.methodOne(30);
    }
}
