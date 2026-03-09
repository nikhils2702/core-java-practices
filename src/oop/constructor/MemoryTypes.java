package oop.constructor;

public class MemoryTypes {
    int a = 10;
    String name = new String("java");
    //Reference = Actual object
    // Stack    = Heap


    public static void main(String[] args) {
        MemoryTypes obj = new MemoryTypes();

        System.out.println("int default value:" + obj.a);
        System.out.println("String default value:" + obj.name);
    }
}
