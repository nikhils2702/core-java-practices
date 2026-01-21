package oop.abstraction;

abstract class WayOfEating{
    abstract void eat();


}

class IndianWayEating extends WayOfEating{
    void eat(){
        System.out.println("Indian people use their hands for eating");
    }
}

class WesternWayEating extends WayOfEating{
    void eat(){
        System.out.println("Western people use their spoon for eating");
    }
}

public class WhyWeNeedAbstraction {

    public static void main(String[] args) {

         IndianWayEating obj = new IndianWayEating();
         obj.eat();

         WesternWayEating obj1 = new WesternWayEating();
         obj1.eat();
    }
}
