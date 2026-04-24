package innerClass;

public class InnerClassFormAreaOfOuterClass {

    class Inside{

        public void methodOne(){
            System.out.println("Inner class method call");
        }
    }
    public void methodTwo(){
        Inside obj = new Inside();
        obj.methodOne();
    }

    public static void main(String[] args) {
        InnerClassFormAreaOfOuterClass obj2 = new InnerClassFormAreaOfOuterClass();
        obj2.methodTwo();
    }
}
