package exceptionHandling.throwException;

public class AbnormalTarminetion {

    public static void main(String[] args) {
        AbnormalTarminetion obj = new AbnormalTarminetion();

        obj.divide();
        System.out.println("hello"); //  not print hallo in this case this is abnormal tarminetion

    }

        void divide(){
        int a = 100, b=0, c;

        c=a/b;
            System.out.println(c);

        }
    }

