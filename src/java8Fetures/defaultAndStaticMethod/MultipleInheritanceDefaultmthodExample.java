package java8Fetures.defaultAndStaticMethod;


interface Test1{

    default void methodOne(){
        System.out.println("call method one");
    }
    default void methodTwo(){
        System.out.println("call method Two");
    }

}
public class MultipleInheritanceDefaultmthodExample implements Test1 {

    public void methodOne(){
        System.out.println("override ");
    }
    public static void main(String[] args) {
        MultipleInheritanceDefaultmthodExample mi = new MultipleInheritanceDefaultmthodExample();

        mi.methodOne();


    }
}
