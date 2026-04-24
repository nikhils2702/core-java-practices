package innerClass.normalInnerClass;

public class InnerCodeOutSideOfOuterClass {
           class Inner{
               public void methodOne(){
                   System.out.println("inner class method...");
               }
           }
}

class Test{

    public static void main(String[] args) {
        new InnerCodeOutSideOfOuterClass().new Inner().methodOne();
    }
}
