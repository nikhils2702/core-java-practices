package oop.polymorphisum.methodOverloading;

public class Addition {
    public void add(int a, int b){
        System.out.println(a + b);
    }
    void add(int a, int b, int c){

        System.out.println(a + b + c);
    }

    public static void main(String[] args){

        Addition obj = new Addition();
        obj.add(36,72); // Calling add() method by passing two argument values.
        obj.add(81,63,54);  // Calling add() method by passing three argument values

    }
}
