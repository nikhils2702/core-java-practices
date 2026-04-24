package collectionFramework.collection;

import java.util.*;


public class Example {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(10);
        al.add("nikhil");
        al.add('a');

        HashSet hs =new HashSet();
        hs.add(20);
        hs.add("shinde");
        hs.add('b');


        List l = new ArrayList();
        List l2 = new LinkedList();

        Set l3 = new HashSet();

        System.out.println(al);
        System.out.println(hs);
        System.out.println(l);
        System.out.println(l2);
        System.out.println(l3);
    }
}
