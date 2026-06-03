package java8Fetures.functionalInterface.functinolRunnableInterface;

import java.util.ArrayList;
import java.util.Comparator;

public class FunctionalInterfaceComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1<o2){
            return -1;
        } else if (o1>o2) {
            return +1;
        }
        else{
            return 0;
        }
    }
}

class Test{

    public static void main(String[] args) {


        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
    }
}
