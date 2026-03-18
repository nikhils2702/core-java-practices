package oop.polymorphisum.methodOverloading.atomicPramotionOverLoding;

public class Case4 {
    public void methodOne(int i, float f){
        System.out.println("int float method");
    }
    public void methodSecond(float f, int i){
        System.out.println("float int method");
    }

    public static void main(String[] args) {
        Case4 obj =new Case4();

        obj.methodOne(40, 20.6f);
        obj.methodSecond(10.5f,20);
        obj.methodOne(10,30);
    }
}

