package java8Fetures.functionalInterface.functionalInterfaceWRTInheritance;



public class Main {
    @FunctionalInterface
    interface  addition{

        void sum(int a, int b);
    }


    public static void main(String[] args) {

        System.out.println("My System start");
        addition add=(a,b)-> System.out.println( a + b);
        add.sum(19,26);




    }
}
