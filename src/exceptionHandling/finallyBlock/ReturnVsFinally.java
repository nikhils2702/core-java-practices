package exceptionHandling.finallyBlock;

public class ReturnVsFinally {
    //Even though return statement present in try or catch blocks first finally will be executed
    //and after that only return statement will be considered. i.efinally block dominates
    //return statement.
    public static void main(String[] args) {

        try{
            System.out.println("Try block Executed");  //return try block is first executed
            return;
        }
        catch (ArithmeticException e){
            System.out.println("catch block executed");
        }
        finally{
            System.out.println("finally block executed");  // finally block second executed
        }
    }
}
