package oop.Inheritance.Hybrid;

class Infosys {
    int Total = 23;
    void employee(){
        System.out.println("Employee is working" + Total + "On this project");
    }
    void serviceBase(){
        System.out.println("This company is service base");
    }
}
class SunTech extends Infosys{
    void employee() {
        System.out.println(" ");
    }
}
public class Companys {
    public static void main(String[] args) {
        SunTech obj = new SunTech();
        obj.employee();
        obj.serviceBase();
    }
}
