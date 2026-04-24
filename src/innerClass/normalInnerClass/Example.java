package innerClass.normalInnerClass;

public class Example {

    int x = 10;
    int y = 20;

    class Child{

        public void m1(){
            System.out.println(x);
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        new Example().new Child().m1();
    }
}
