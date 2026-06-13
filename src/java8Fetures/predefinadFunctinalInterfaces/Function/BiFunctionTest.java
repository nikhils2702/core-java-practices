package java8Fetures.predefinadFunctinalInterfaces.Function;

import java.util.function.BiFunction;

public class BiFunctionTest {
    public static void main(String[] args) {

        BiFunction<String,String,String> f =(s1,s2) -> s1+s2;

        System.out.println(f.apply("nikhil ","shinde"));
        System.out.println(f.apply("ganga ","Shirale"));

    }
}
