package innerClass.staticNestedClass;

public class BothClassObjects {

    static class  NestedClass{

        void methodOne(){
            System.out.println("Static nested method call...");
        }

        public static void main(String[] args) {
            NestedClass obj = new NestedClass();

            obj.methodOne();
        }
    }

    public static void main(String[] args) {

        System.out.println(" main class call...");
    }
}
