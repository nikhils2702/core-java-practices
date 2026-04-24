package exceptionHandling.finallyBlock;

public class ReturnVsFinallyExample {
    public static void main(String[] args) {
        System.out.println(m1());
    }

    public static int m1(){
        try{
            System.out.println(70/0);
            return 777;
        }
        catch (ArithmeticException e){
            return 888;
        }
        finally {
            return 999;
        }
    }
}
