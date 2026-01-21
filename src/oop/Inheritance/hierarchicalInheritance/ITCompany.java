package oop.Inheritance.hierarchicalInheritance;

public class ITCompany {
    void TotalCompany(){
        System.out.println("Total Company In IT 2");
    }
}
class ITCompany1 extends ITCompany{
    void TCS(){
        System.out.println("IT Company 1 TCS");
    }
}
class ITCompany2 extends ITCompany{
    void Infosys(){
        System.out.println("IT Company 2 Infosys");
    }

    public static void main(String[] args){
        ITCompany1 obj = new ITCompany1();
        obj.TotalCompany();
        obj.TCS();

        ITCompany2 obj2 = new ITCompany2();
        obj2.TotalCompany();
        obj2.Infosys();
    }
}
