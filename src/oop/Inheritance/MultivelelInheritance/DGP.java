package oop.Inheritance.MultivelelInheritance;

public class DGP {
    void DGPSalary(){
        System.out.println("Basic Salary of is a 2,50,000");
    }
}
class ADGP extends DGP{
    void ADGPSalary(){
        System.out.println("Basic Salary is a 1,82,000");
    }
}
class IGP extends ADGP {
    void IGPSalary(){
        System.out.println("Basic salary is a 1,44,000");
    }
}
class DIGP extends IGP{
    void DIGPSalary(){
        System.out.println("Basic salary is a 1,31,200");
    }
}
class SSP extends DIGP{
    void SSPSalary(){
        System.out.println("Basic salary is a 1,20,000");
    }

    public static void main(String[] args){
        SSP obj = new SSP();
        obj.DGPSalary();
        obj.ADGPSalary();
        obj.IGPSalary();
        obj.DIGPSalary();
        obj.SSPSalary();


    }
}
