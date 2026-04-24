package java8Fetures.functionalInterface.functionalInterfaceWRTInheritance;

public interface Example {

    public void methodOne();
}

class Demo implements Example{
    public void methodOne(){
        System.out.println("Hallo..");
    }
}
class Test{
    public static void main(String[] args) {
        Example e = new Demo();

        Example e1 = () -> System.out.println("hallo...");  //lambda expression

        e.methodOne();
        e1.methodOne();

       
    }
}