package exceptionHandling.finallyBlock;

public class DominateFinallyBlock {
    public static void main(String[] args) {

        try{
            System.out.println("try block executed");
            System.exit(0);                     // execution stop here finally block not executed
        }
        catch (ArithmeticException e){
            System.out.println("catch block executed");
        }
        finally {
            System.out.println("finally block executed");
        }
    }
}
