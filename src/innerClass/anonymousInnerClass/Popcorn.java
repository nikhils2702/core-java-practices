package innerClass.anonymousInnerClass;

public class Test {

    public static void main(String[] args) {

        Test obj = new Test(){

            public void method1(){
                System.out.println("Annonymous class");
            }
        };
        obj.method1();

    }
}
