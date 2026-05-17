package collectionFramework.collection.set.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet(new MyComparator());
        ts.add("tdit");
        ts.add("java");
        ts.add("team");
        ts.add("student");
        ts.add("study");

        System.out.println(ts);  //prient order is alphabet order
    }
}

class MyComparator implements Comparator {
       public int compare(Object obj1, Object obj2){

           String s1 = obj1.toString();
           String s2 = (String) obj2;

           return -s2.compareTo(s1);   // we can use "-" opretor then output is reverce alphabet order.
       }

}
