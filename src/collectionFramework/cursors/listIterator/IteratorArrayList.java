package collectionFramework.cursors.listIterator;

import java.util.ArrayList;

public class IteratorArrayList {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");

        System.out.println(al);

        int i = 0;

        while(al.size()> i){
            String itr = al.get(i);
            System.out.println(itr);
            i++;
        }
    }
}
