package collectionFramework.collection.comparableVsComparator;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class comparableExample implements Comparable<comparableExample>{

    int RollNo;
    String Name;


    comparableExample(int RollNo, String Name) {

        this.RollNo = RollNo;
        this.Name = Name;

    }

    public comparableExample() {

    }

//    int compairTo(comparableExample o) {
//        return this.RollNo - o.RollNo;
//    }

    @Override
    public String toString() {
        return super.toString();
    }


    public int compairTo(comparableExample o) {
        return 0;
    }

    public static void main(String[] args) {

        comparableExample ce = new  comparableExample();

        List<String> li = new LinkedList<>();

        li.add('7',"Rahul");
        li.add('3',"Nikhil");
        li.add('6',"Vijay");
        li.add('1',"dk");

        Collections.sort(li);

        System.out.println(li);

    }

    @Override
    public int compareTo(comparableExample o) {
        return 0;
    }
}
