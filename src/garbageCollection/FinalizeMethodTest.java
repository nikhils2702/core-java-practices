package garbageCollection;

public class FinalizeMethodTest {
    public static void main(String[] args) {

        String s = new String();
        s= null;

        System.gc();
        System.out.println("End of main");
    }
    public void finalize(){
        System.out.println("finalize method call");
    }
}
