package collectionFramework.collection.set.treeSet;

//Write a Program to Insert String and StringBuffer Objects into the TreeSet where Sorting
//Order is Increasing Length Order.

import java.util.Comparator;
import java.util.TreeSet;

public class StringAndStringBufferTreeSet {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet(new MyComparator1());
        ts.add("A");
        ts.add(new StringBuffer("ABC"));
        ts.add(new StringBuffer("AA"));
        ts.add("ABCE");
        ts.add("XX");
        ts.add("A");

        System.out.println(ts);
    }
}
class MyComparator1 implements Comparator{

    public int compare (Object obj1, Object obj2){

        String s1 = obj1.toString();
        String s2 = obj2.toString();

        int i1 = s1.length();
        int i2 = s2.length();

        if(i1 < i2) return -1;
        else if(i1 > i2) return 1;
        else return s1.compareTo(s2);
    }
}
