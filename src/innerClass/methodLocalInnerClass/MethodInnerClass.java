package innerClass.methodLocalInnerClass;

public class MethodInnerClass {

    final int a = 10;
    static int b = 20;

    public void methodOne(){

        int n =30;
        final int m = 40;

        class InnerClass{


            public void methodTwo() {

                System.out.println(a);
                System.out.println(b);
                System.out.println(m);
                System.out.println(n);

            }

        }

        InnerClass obj = new InnerClass();
        obj.methodTwo();

    }

    public static void main(String[] args) {

        new MethodInnerClass().methodOne();

    }
}
