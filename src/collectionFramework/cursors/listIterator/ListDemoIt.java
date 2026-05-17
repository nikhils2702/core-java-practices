package collectionFramework.cursors.listIterator;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemoIt {

    public static void main(String[] args) {

        List<String> lt = new ArrayList<String>();
                  lt.add("Pune");
                  lt.add("Mumbai");
                  lt.add("Delhi");

        System.out.println("list"+ lt);

        Iterator itr = lt.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        itr.remove();

        System.out.println("New List: "+ lt);
        System.out.print(lt);


    }
}
