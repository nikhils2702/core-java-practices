package collectionFramework.collection.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push("nikhil");
        s.push("shinde");
        s.push(100);
        s.push(12.3);

        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
    }
}
