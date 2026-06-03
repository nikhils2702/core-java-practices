package collectionFramework.cursors.listIterator.likedListIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListEteratorUsingiterator {

    public static void main(String[] args) {

        List ll = new LinkedList();

        ll.add("Nikhil");
        ll.add("Shinde");
        ll.add("Pune");
        ll.add("Maharastra");

        System.out.println(ll);

        System.out.println("Using Iterator");

        Iterator<String>  itr = ll.iterator();

        while(itr.hasNext()){
            Object obj = itr.next();
            System.out.println(obj);
        }
    }
}
