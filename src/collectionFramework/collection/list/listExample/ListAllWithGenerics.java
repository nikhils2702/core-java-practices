package collectionFramework.collection.list.listExample;

import java.util.ArrayList;
import java.util.List;

public class ListAllWithGenerics {

    public static void main(String[] args) {

        List<String> li = new ArrayList<String>();

        li.add("pune");
        li.add("mumbai");
        li.add("benglore");
        li.add("noida");

        System.out.println("List contain" +  li);

        List<String> li1 = new ArrayList<String>();

        li1.add("10");
        li1.add("10");
        li1.add("10");
        li1.add("10");

        System.out.println("List Second Containar "+ li1 );

        li.addAll(2,li1);

        System.out.println("List and List1 Contain"+ li);


    }
}
