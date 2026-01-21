package oop.abstraction;

abstract class Setting { //abstract class
    int volume = 72;

    public void config() {   //This is non-abstract method
        System.out.println("Volume is " + volume);
    }

}

    class SoundSetting extends Setting{

    }


public class AbstractionRule1 {
    public static void main(String[] args){

        SoundSetting obj = new SoundSetting();

        obj.config();
    }
}
