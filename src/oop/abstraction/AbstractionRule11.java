package oop.abstraction;

abstract class StartEngine{
    public void usingKey(){
        System.out.println("Start Engine using key");
    }
    public void startRemote(){
        System.out.println("Start Engine using remote");
    }
}


class StartVehicle extends StartEngine{
   
}

public class AbstractionRule11 {

    public static void main(String[] args){
        StartVehicle obj = new StartVehicle();
        obj.startRemote();
        obj.usingKey();
    }

}
