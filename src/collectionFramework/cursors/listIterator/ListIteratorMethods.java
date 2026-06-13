package collectionFramework.cursors.listIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods {

    public static void main(String[] args) {

        List<String> lt = new ArrayList<>();

        lt.add("A");
        lt.add("B");
        lt.add("C");

        ListIterator<String> itr = lt.listIterator();

        itr.next();

        itr.set("A");

        itr.add("X");

        try{
            itr.remove();
        }
        catch (IllegalStateException e){

            itr.add("N");
        }
//        System.out.println(itr);

        System.out.println(lt);

    }
}
