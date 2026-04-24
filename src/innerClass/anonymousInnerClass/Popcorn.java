package innerClass.anonymousInnerClass;

class Test {

    public void method1(){
                System.out.println("Annonymous class");
            }

    }
public class Popcorn {
    public static void main(String[] args) {

        Test t = new Test() {
            @Override
            public void method1() {

                System.out.println("One time object");
            }

        };
        t.method1();
        Test t1 = new Test();
        t1.method1();
    }
}
