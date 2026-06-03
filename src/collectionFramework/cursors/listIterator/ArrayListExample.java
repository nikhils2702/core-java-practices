package collectionFramework.cursors.listIterator;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");

        System.out.println(al);

        System.out.println("Using for loop");

        int elementsize = al.size();

        System.out.println("size"+ elementsize);

        for(int i = 0; i< al.size(); i++){
            String getElement = al.get(i).toString();
            System.out.println(getElement);
        }

        al.set(2,"G");
        al.set(3, null);


        System.out.println("Using Enhance for loop");
        for(Object element:al){
            System.out.println(element);
        }

    }
}
