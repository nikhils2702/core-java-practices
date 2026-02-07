package Static.StaticBlock;


abstract class Data {
    static String db = "GK-all";


    static {
        System.out.println("Abstract class Static block executed");
    }


    static void staticMethod() {
        System.out.println("Data Show " + db);
    }

}

class ShowData extends Data {

}


public class StaticMain {
    public static void main(String[] args) {
        ShowData.staticMethod();

    }
}
