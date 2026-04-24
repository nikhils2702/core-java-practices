package java8Fetures.functionalInterface.defaultAndStaticMethods;

@FunctionalInterface
public interface Example1 {

    public void methodOne();

    default void methodTwo(){

    }
    public static void methodThree(){

    }
    public static void main(String[] args) {

    }

}

@FunctionalInterface
interface Example2 extends Example1{


        public void methodOne();

}