package garbageCollection;

import java.util.Date;

public class Test {
    public static void main(String[]args){

        Runtime obj = Runtime.getRuntime();

        System.out.println("total memory of the heap :" + obj.totalMemory());
        System.out.println("free memory of the heap :" + obj.freeMemory());

        for(int i=0;i<10000; i++){
            Date d = new Date();

            d=null;
        }

        System.out.println("total memory of the heap :" + obj.totalMemory());
        obj.gc();
        System.out.println("free memory of the heap :" + obj.freeMemory());

    }
}
