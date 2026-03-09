package oop.polymorphisum.methodOverloading;

public class DuplicateMethod {

    public void show(int a, boolean b ){
        System.out.println();
    }

    public void show(int c, boolean b, int f){
        System.out.println();
    }
    public static void main(String[] args){
        DuplicateMethod obj = new DuplicateMethod();

        obj.show(89,true);

        System.out.println();

    }
}
