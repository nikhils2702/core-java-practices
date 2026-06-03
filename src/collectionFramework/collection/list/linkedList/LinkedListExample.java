package collectionFramework.collection.list.linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        List ll = new LinkedList();

        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(400);
        ll.add(500);

        System.out.println(ll);

        System.out.println("LinkedList size" + ll.size());


    }
}
