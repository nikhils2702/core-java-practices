package oop.polymorphisum.methodOverloading.atomicPramotionOverLoding;

public class Case1 {

    public void methodOne(int n){
        System.out.println(" int arg method");
    }
    public void methodSecond(float f){
        System.out.println("float arg method");
    }

    public static void main(String[] args) {

        Case1 obj = new Case1();

        obj.methodOne(10);
        obj.methodSecond(102);
//        obj.methodOne(10.4);
    }
}
