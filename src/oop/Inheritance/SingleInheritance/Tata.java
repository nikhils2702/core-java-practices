package oop.Inheritance.SingleInheritance;

public class Tata {
    void pune(){
        System.out.println("Karaj Branch Pune");
    }
}
 class Sierra extends Tata{
    void Black(){
        System.out.println("1.5 L.T engine");
    }

    public static void main(String[] args){
        Sierra obj = new Sierra();
        obj.pune();
        obj.Black();

     }
 }
