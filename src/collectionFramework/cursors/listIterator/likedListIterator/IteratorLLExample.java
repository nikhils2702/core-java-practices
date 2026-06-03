package collectionFramework.cursors.listIterator.likedListIterator;

import java.util.LinkedList;

public class IteratorLLExample {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

         list.add(900);
         list.add(800);
         list.add(700);
         list.add(600);
         list.add(500);

        System.out.println(list);

        System.out.println("Iterate value using --- while loop---");

        int i =0;
        while(list.size()> i){
            System.out.println(list.get(i));
            i++;
        }
    }
}
