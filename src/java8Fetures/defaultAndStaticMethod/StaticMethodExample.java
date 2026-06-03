package java8Fetures.defaultAndStaticMethod;

interface Interf{

    public static void methodOne(){
        System.out.println("Method one call");
    }
}
public class StaticMethodExample {

    public static void main(String[] args) {

        Interf.methodOne();
    }
}
