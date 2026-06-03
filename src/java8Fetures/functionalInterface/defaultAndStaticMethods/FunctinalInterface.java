package java8Fetures.functionalInterface.defaultAndStaticMethods;


interface Test{

    public void methodOne();
}
public class FunctinalInterface {

    public static void main(String[] args) {
        Test t = () -> System.out.println("Hello ... By lambda expression");
        t.methodOne();
        t.methodOne();
    }



}
