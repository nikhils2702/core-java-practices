package Static.StaticVariables;

public class Counter {

    static int Counts = 0;

    Counter(){

        Counts++;
        System.out.println(Counts);
    }

    public static void main(String[]args){
        Counter obj = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

    }
}
