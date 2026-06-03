package collectionFramework.cursors.listIterator.likedListIterator;

import java.util.LinkedList;

public class LinkedListIteratorExample {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(400);
        ll.add(500);

        System.out.println(ll);

        System.out.println("--Iterate Value Using ForLoop--");

        for(int i = 0; i < ll.size(); i++){
            Object element = ll.get(i);
            System.out.println(element);
        }
    }
}