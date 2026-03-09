package oop.constructor;

public class MethodeVsConstructor {

    public MethodeVsConstructor() {
        System.out.println("this is Constructor");
    }
    public void MethodeVsConstructor(){
        System.out.println(" this is Method");
    }

    public static void main(String[]args){
        MethodeVsConstructor obj = new MethodeVsConstructor();
        obj.MethodeVsConstructor();
    }
}
