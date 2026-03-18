package oop.polymorphisum.methodOverloading.atomicPramotionOverLoding;

public class Case2 {

    public void methodOne(String s){
        System.out.println("string version");
    }
    public void methodSecond(Object o){
        System.out.println("object version");
    }

    public static void main(String[] args) {
        Case2 obj = new Case2();

        obj.methodOne("nik");
        obj.methodSecond(new Object());
        obj.methodOne(null);
    }
}
