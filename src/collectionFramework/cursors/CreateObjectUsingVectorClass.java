package collectionFramework.cursors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CreateObjectUsingVectorClass {

    public static void main(String[] args) {

        Vector v = new Vector();

        Enumeration e = v.elements(); // we cannot create object of Enumeration Legucy Interface.
                                      // We call Vector Class element method
        Iterator itr = v.iterator();   //  class vector Iterator method.
        ListIterator litr = v.listIterator();

        System.out.println(e.getClass().getName());
        System.out.println(itr.getClass().getName());
        System.out.println(litr.getClass().getName());
    }
}
