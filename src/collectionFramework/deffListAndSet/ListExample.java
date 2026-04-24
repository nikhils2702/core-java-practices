package collectionFramework.deffListAndSet;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(1,100);
        l.add(2,200);
        l.add(3,300);

        System.out.println(l);

        Iterator itr = l.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
