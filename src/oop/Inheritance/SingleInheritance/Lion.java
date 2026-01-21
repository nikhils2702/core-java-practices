package oop.Inheritance.SingleInheritance;

public class Lion {
    void Name(){
        System.out.println("Scar");
    }
}

class LionCube extends Lion{
    void CubeName(){
        System.out.println("Simbha");
    }

    public static void main(String[] args){
        LionCube obj=new LionCube();
        obj.Name();
        obj.CubeName();


    }
}
