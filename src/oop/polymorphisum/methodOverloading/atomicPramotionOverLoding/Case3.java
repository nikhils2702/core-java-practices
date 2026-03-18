package oop.polymorphisum.methodOverloading.atomicPramotionOverLoding;

public class Case3 {
    public void methodOne(String s){
        System.out.println("String version");
    }
    public void methodSecond(StringBuffer sb){
        System.out.println("StringBuffer version");
    }

    public static void main(String[] args) {
        Case3 obj =new Case3();

        obj.methodOne("nik");
        obj.methodSecond(new StringBuffer("TDIT"));
        obj.methodOne(null);
    }
}
