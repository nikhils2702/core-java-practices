package innerClass.normalInnerClass;

public class Univarcity {

    class Depatments{
        public void methodOne(){
            System.out.println("Inner class method");
        }
    }

    public static void main(String[] args) {
        Univarcity obj = new Univarcity();

        Univarcity.Depatments obj2 = obj.new Depatments();

        obj2.methodOne();
    }

}
