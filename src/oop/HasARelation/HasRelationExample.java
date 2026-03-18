package oop.HasARelation;

class Engine{
    void functinality(){
        System.out.println("engine specific functinality");
    }
}
class Gearbox{
    void functinality(){
        System.out.println("engine specific functinality");
    }
}
class car{
    public static void main(String[] args) {
        Engine obj = new Engine();
        Gearbox obj1 = new Gearbox();
        obj.functinality();
        obj.functinality();
    }

}
public class HasRelationExample {
}
