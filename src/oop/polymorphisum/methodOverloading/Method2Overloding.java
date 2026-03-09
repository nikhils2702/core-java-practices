package oop.polymorphisum.methodOverloading;

public class Method2Overloding {
    void show(int a){
        System.out.println("non static method");
    }
    static void show(){
        System.out.println("Static method");
    }

    public static void main(String[]args){
        Method2Overloding obj = new Method2Overloding();
        Method2Overloding.show(); // call static method

    }
}
