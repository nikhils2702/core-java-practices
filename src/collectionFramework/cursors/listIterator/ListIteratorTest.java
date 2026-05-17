package collectionFramework.cursors.listIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

    public static void main(String[] args) {

        List al =new ArrayList();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Red1");
        al.add("Gree1n");
        al.add("Blue1");
        al.add("Red2");

        System.out.println("List" + al);

        ListIterator li = al.listIterator();
        System.out.println();

        System.out.println("Forward Direction");

        while(li.hasNext()){
            int index = li.nextIndex();
            String element = (String) li.next();
            System.out.println(" -"+index + " -"+ element);
        }


        System.out.println(al);

        System.out.println("Backward Direction");

        while(li.hasPrevious()){
            int index = li.nextIndex();
            String st = (String) li.previous();
            System.out.println(index + " -  "+ st );


        }
        System.out.println(al);



    }
}
