package oop.Inheritance.MultivelelInheritance;

public class HDFCBank {
    void PuneBranch(){
        System.out.println("Customer Total Accounts in this Branch is 1,20,543 ");
    }
}

class BankOfIndia extends HDFCBank{
    void KharadiBranch(){
        System.out.println("Customer Total Accounts in this Branch is 1,00,763");
    }
}
class IDFCBank extends BankOfIndia{
    void WakadBranch(){
        System.out.println("Customer Total Accounts in this Branch is 80,933");
    }
}
class SBIBank  extends IDFCBank{
    void KatrajBranch(){
        System.out.println("Customer Total Accounts in this Branch is 1,20,793");
    }

    public static void main(String[] args){
        SBIBank obj = new SBIBank();
        obj.WakadBranch();
        obj.KatrajBranch();
        obj.KharadiBranch();
        obj.PuneBranch();
    }
}
