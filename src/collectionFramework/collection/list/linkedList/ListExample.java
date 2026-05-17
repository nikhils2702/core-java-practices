package collectionFramework.collection.list.linkedList;

import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        l.add("nik");
        l.add(27);
        l.add(null);
        l.add("shinde");

        System.out.println(l);

        l.set(0,"nikhilshinde");
        l.add(0,"nikhil");
        l.removeLast();
        l.addFirst("pune");
        System.out.println(l);

    }
}
