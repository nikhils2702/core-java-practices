package java8Fetures.defaultAndStaticMethod;


interface Test{

    default void m1(){
        System.out.println("Default method");
    }
}
public class DefaultMethodExample implements Test{

   public void m1(){
        System.out.println("overriding version of default method");
    }
    public static void main(String[] args) {

        DefaultMethodExample df = new DefaultMethodExample();

        df.m1();

    }
}
