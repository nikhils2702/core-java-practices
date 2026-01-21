package oop.Inheritance.MultivelelInheritance;

public class Mahendra {
    void XUV700(){
        System.out.println("Mileage is 22 kmpl");
    }
}
class Tata extends Mahendra {
    void NexonEV(){
        System.out.println("Mileage is 26 kmpl");
    }
}
class Suzuki extends Tata{
    void Brezza(){
        System.out.println("Mileage is 24 kmpl");
    }

    public static void main(String[] args) {
        Suzuki obj = new Suzuki();
        obj.XUV700();
        obj.NexonEV();
        obj.Brezza();
    }
}
