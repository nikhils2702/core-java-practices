package java8Fetures.functionalInterface.defaultAndStaticMethods;



interface Test1{

    public void methodOne(int a, int b);

}

public class FIDemo {
    public static void main(String[] args) {

        Test1 t =(a,b)-> System.out.println("The sum : "+ (a+b));
        t.methodOne(200,700);
        t.methodOne(30,50);
        t.methodOne(10,400);
    }
}
