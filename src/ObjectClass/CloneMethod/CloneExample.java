package ObjectClass.CloneMethod;
import java.lang.Cloneable;

class Animal implements Cloneable {
    String type;
    int age;

    Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneExample {
    public static void main(String[] args) {
        try {
            Animal original = new Animal("Dog", 3);
            System.out.println("Original: " + original.type + ", " + original.age);

            Animal cloned = (Animal) original.clone();
            System.out.println("Cloned:   " + cloned.type + ", " + cloned.age);

            // Modify the cloned object
            cloned.age = 5;
            cloned.type = "Cat";

            System.out.println("\nAfter modification:");
            System.out.println("Original: " + original.type + ", " + original.age);
            System.out.println("Cloned:   " + cloned.type + ", " + cloned.age);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
