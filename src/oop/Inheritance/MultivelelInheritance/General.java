package oop.Inheritance.MultivelelInheritance;

public class General {
    void GeneralSalary(){
        System.out.println("Basic Monthly Salary is a 2,50,000 L");
    }
}
class LieutenantGeneral extends General{
    void LieutenantGeneralSalary(){
        System.out.println("Basic Monthly Salary Is a 1'82'200 to 2'50'00");
    }
}
class MejorGeneral extends LieutenantGeneral{
    void MejorGeneralSalary(){
        System.out.println("Basic Monthly Salary is a 1,44,200 to 2,14,200");
    }
}
class Brigadier extends MejorGeneral{
    void BrigadierSalary(){
        System.out.println("Basic Monthly Salary is a 1,39,600 to 2,17,600");
    }
}
class Colonel extends Brigadier{
    void ColonelSalary(){
        System.out.println("Basic Monthly Salary is a 1,30,600 to 2,14,600");
    }

    public static void main(String []args){
        Colonel obj = new Colonel();
        obj.GeneralSalary();
        obj.LieutenantGeneralSalary();
        obj.MejorGeneralSalary();
        obj.BrigadierSalary();
        obj.ColonelSalary();
    }
}

