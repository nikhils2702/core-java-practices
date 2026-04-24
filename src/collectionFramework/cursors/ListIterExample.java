package collectionFramework.cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterExample {

    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(10);
        l.add("Nikhil");
        l.add("Shinde");

        ListIterator li= l.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("------------");

        while(li.hasPrevious()){
            System.out.println(li.previous());

        }

        l.add(1000);
        System.out.println(l);

//        li.set(200);
//        System.out.println(li);

    }
}
