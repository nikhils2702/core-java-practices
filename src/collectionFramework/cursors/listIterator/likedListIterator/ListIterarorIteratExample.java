package collectionFramework.cursors.listIterator.likedListIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIterarorIteratExample {

    public static void main(String[] args) {

        List la = new LinkedList();

        la.add("A");
        la.add("B");
        la.add("C");
        la.add("D");
        la.add("E");

        System.out.println(la);

        Iterator itr = la.listIterator();

        while(itr.hasNext()){
            Object obj = itr.next();
            System.out.println(obj);
        }

    }
}
