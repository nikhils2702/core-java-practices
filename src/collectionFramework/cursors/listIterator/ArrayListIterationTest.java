package collectionFramework.cursors.listIterator;

import java.util.ArrayList;

public class ArrayListIterationTest {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");

        System.out.println(al);

        int elesize = al.size();

        System.out.println(elesize);


        for(int i = al.size()-1; i > 0; i--){
            System.out.println(al.get(i));
        }

    }
}
