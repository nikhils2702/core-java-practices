package java8Fetures.predefinadFunctinalInterfaces.Function;

import java.util.function.Function;

public class Example {

    public static void main(String[] args) {

        Function<Integer, Integer> f = i -> i*i;

        System.out.println(f.apply(5));
        System.out.println(f.apply(3));
    }
}
