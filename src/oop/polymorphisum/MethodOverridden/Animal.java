package oop.polymorphisum.MethodOverridden;

public class Animal {
    void eat(){
        System.out.println("Animal eat plants");
    }
}
class Lion extends Animal{
    void eat(){
        System.out.println("Lions eat flesh because they are carnivore");
    }

    public static void main(String[]args){
        Animal a = new Animal();
        a.eat(); // This statement will call eat() method of Animal class because
        // the reference variable is pointing to object of animal class.


        Animal a1 = new Lion();
        a1.eat();  // This statement will call eat() method of Lion class
        //because the reference variable is pointing towards the object of Loin class.
    }
}