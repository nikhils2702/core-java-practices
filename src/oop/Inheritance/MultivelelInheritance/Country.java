package oop.Inheritance.MultivelelInheritance;

public class Country {
    void CountryPopulation(){
        System.out.println("population of country is a 1.4 cr ");
    }
}
class State extends Country{
    void StatePopulation(){
        System.out.println("Population of staste is a 30 cr");
    }
}
class District extends State{
    void DistrictPopulation(){
        System.out.println("Population of District is a 31.4 L ");
    }
}
class Taluka extends District{
    void TalukaPopulation(){
        System.out.println("Population of Taluka is a 1.62 L ");

    }
}
class Village extends Taluka{
    void VillagePopulation(){
        System.out.println("Population of Village is a 4 Thousand");
    }

    public static void main(String[] args){
        Village obj = new Village();
       obj.CountryPopulation();
        obj.StatePopulation();
        obj.DistrictPopulation();
        obj.TalukaPopulation();
        obj.VillagePopulation();
    }
}
