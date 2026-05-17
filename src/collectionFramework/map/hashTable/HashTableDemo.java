package collectionFramework.map.hashTable;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {

        Hashtable h = new Hashtable();

        h.put(new Temp(5), "A");
        h.put(new Temp(6),"B");
        h.put(new Temp(2),"D");
        h.put(new Temp(4),"E");
        h.put(new Temp(7),"F");

        System.out.println(h);
    }
}

class Temp{

    int i;

    Temp(int i){
       this.i = i;
    }
    public int hashcode(){
        return i ;
    }
    public String toString(){
        return i + "";
    }
}
