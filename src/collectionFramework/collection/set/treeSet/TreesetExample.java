package collectionFramework.collection.set.treeSet;

import java.util.TreeSet;

public class TreesetExample {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add(40);
        ts.add(50);
        ts.add(20);
        ts.add(30);
        ts.add(60);
        ts.add(10);

        ts.add(null); // TreeSet Cannot Store null value.

        System.out.println(ts);

    }
}
