package collectionFramework.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorTest {

    public static void main(String[] args) {

        CopyOnWriteArrayList al= new CopyOnWriteArrayList<>();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");

        Iterator <String> itr = al.iterator();

        while(itr.hasNext()){

            String str = itr.next();
            al.add("hgaf");
            System.out.println(str + " ");
        }
    }
}
