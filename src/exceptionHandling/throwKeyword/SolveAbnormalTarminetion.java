package exceptionHandling.throwException;

public class SolveAbnormalTarminetion {

    public static void main(String[] args) {
        SolveAbnormalTarminetion obj = new SolveAbnormalTarminetion();

        //solve abnormal tarminetion using try catch block
        // and print hello
        try {
            obj.divide();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("hallo");

    }

    void divide(){
        int a=100, b = 0 , c ;

        c= a/b;
        System.out.println(c);
    }
}
