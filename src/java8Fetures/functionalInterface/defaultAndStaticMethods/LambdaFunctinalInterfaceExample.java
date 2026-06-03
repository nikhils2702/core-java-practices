package java8Fetures.functionalInterface.defaultAndStaticMethods;


interface Test2{
    public int squreIt(int n);
}
public class LambdaFunctinalInterfaceExample {
    public static void main(String[] args) {
        Test2 t = n -> n * n;

        System.out.println(t.squreIt(6));
        System.out.println(t.squreIt(8));

    }
}

