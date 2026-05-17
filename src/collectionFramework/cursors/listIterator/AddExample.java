package collectionFramework.cursors.listIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AddExample {

    public static void main(String[] args) {

        List<String> al = new ArrayList<String>();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");

        System.out.println("List" + al);


        ListIterator itr = al.listIterator();

        System.out.println("Forward Direction");

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        itr.add("F");

        System.out.println();
        System.out.println("-----------"+al);
        System.out.println();

        System.out.println("Backward Direction");

        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }

        itr.set("N");
        System.out.println(al);



    }
}
