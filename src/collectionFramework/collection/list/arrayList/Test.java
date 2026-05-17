package collectionFramework.collection.list.arrayList;

import java.util.Arrays;

class MyList<E> {
    private Object[] data;
    private int size = 0;

    public MyList() {

        data = new Object[10];
    }

    public void add(E e) {
        if (size == data.length) {

            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size++] = e;
    }



    public E get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return (E) data[index];
    }


    public E remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        E removedValue = (E) data[index];
        int numMoved = size - index - 1;

        if (numMoved > 0) {

            System.arraycopy(data, index + 1, data, index, numMoved);
        }

        data[--size] = null;
        return removedValue;
    }


    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
public class Test {
    public static void main(String[] args) {
        MyList<String> names = new MyList<>();
        names.add("Pune");
        names.add("Mumbai");
        names.add("Delhi");

        names.display(); // Pune Mumbai Delhi

        names.remove(1); // Removes Mumbai
        names.display(); //  Pune Delhi
        names.add("Benglore"); //
        names.display();
        names.get(1);
        names.display();
    }
}