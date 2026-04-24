package innerClass.staticNestedClass;

public class ExampleNeatedClass {

    static class Nested{

        void methodOne(){
            System.out.println("Nested class call...");
        }

        public static void main(String[] args) {

            Nested obj = new Nested();

            obj.methodOne();
        }
    }

}
