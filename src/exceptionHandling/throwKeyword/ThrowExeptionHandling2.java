package exceptionHandling.throwException;

public class ThrowExeptionHandling2 {

    public static void main(String[] args) {
        System.out.println(10/0);

        throw new ArithmeticException("/by Zero");
//        System.out.println("hello");
    }
}
