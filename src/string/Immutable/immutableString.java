package string.Immutable;

public class immutableString {

    public static void main(String [] args){

        String s = "Java"; // create String literal object with content

        s.concat("Programing"); //calling concat() method to add String at end.

        System.out.println(s); //Print Java because String is immutable object.


        //Why String Objects are Immutable in Java?
          // because in java concept of constant pool, suppose you are 6 reference in one object.
        // that case one reference change then other effect reference.



    }
}
