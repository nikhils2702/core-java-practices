package innerClass.methodLocalInnerClass;

public class Test {

    public void methodOne(){
        
        class Inner{
            public void sum(int i,int j){
                System.out.println("The sum "+ (i+j));
            }
        }

        Inner obj = new Inner();
        obj.sum(10,20);

        obj.sum(100,200);

        obj.sum(1000,2000);
    }

    public static void main(String[] args) {
        new Test().methodOne();
    }
}
