package oop.polymorphisum.methodOverloading;

public class StaticPoly {

    void sum(int x, int y){
        int s = x + y;
        System.out.println("Sum of two numbers " + s);

    }
    void sum(int x, int y,int z){
        int s = x + y + z;
        System.out.println("Sum of three number :" + s);
    }

 public static void main(String[]args){
        StaticPoly obj = new StaticPoly();
        obj.sum(34,56);
        obj.sum(67,63,63);
 }
}
