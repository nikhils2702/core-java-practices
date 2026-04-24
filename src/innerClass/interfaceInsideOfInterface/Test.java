package innerClass.interfaceInsideOfInterface;


interface Outer{
    public void methodOne();

    interface Inner{
        public void methodTwo();
    }
}
class Test1 implements Outer{
    public void methodOne(){
        System.out.println("outer interface implements...");
    }
}
class Test2 implements Outer.Inner{
    public void methodTwo(){
        System.out.println("inner Interface method implementation...");
    }
}
public class Test {

    public static void main(String[] args) {
        Test1 obj =new Test1();
        obj.methodOne();

        Test2 obj1 = new Test2();
        obj1.methodTwo();
    }
}
