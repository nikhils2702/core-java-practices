package oop.constructor;

public class TypeOfConstructor {

    public TypeOfConstructor() {
        System.out.println("Constructor Called");
    }
    public TypeOfConstructor(int a) {
        System.out.println("1 arg Constructor Called");
    }
    public TypeOfConstructor(String name, int b) {
        System.out.println("2 arg Constructor Called");

    }
    public static void main(String[]args){

        TypeOfConstructor c = new TypeOfConstructor();
        TypeOfConstructor c2 = new TypeOfConstructor("java", 100);

    }
}
