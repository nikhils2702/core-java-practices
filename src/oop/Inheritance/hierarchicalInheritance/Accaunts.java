package oop.Inheritance.hierarchicalInheritance;

public class Accaunts {
    void AccountID(){
        System.out.println("BKID00015");
    }
}
class SevingAccounts extends Accaunts{
    void Intrest(){
        System.out.println("Intrest is 7.6");
    }
}
class CurruntAccounts extends Accaunts{
    void Limits(){
        System.out.println("Limit is 1,00000");
    }

    public static void main(String[] args){
        SevingAccounts obj = new SevingAccounts();
        obj.AccountID();
        obj.Intrest();

        CurruntAccounts obj2 = new CurruntAccounts();
        obj2.AccountID();
        obj2.Limits();
    }
}
