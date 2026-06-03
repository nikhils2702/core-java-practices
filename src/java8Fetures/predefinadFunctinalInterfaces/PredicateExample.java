package java8Fetures.predefinadFunctinalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        int [] x = {20,13,48,52,25,15};

        Predicate<Integer> p1 = i -> i % 2 ==0;
        Predicate<Integer> p2 = i -> i>10;

        // and(), Or(), negate()

        System.out.println("The number which are even : ");

        for (int x1: x){
            if(p1.or(p2).test(x1)){
                System.out.println(x1);
            }
        }

    }
}
