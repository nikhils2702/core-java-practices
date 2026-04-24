package string.stringConstructor;


    public class StringHeapExample {
        public static void main(String[] args) {
            // 1. Created in the String Constant Pool
            String s1 = "Java";
            String s2 = "Java";

            // 2. Forced into the Heap
            String s3 = new String("Java");


            // '==' checks if they are the SAME OBJECT in memory
            System.out.println("s1 == s2: " + (s1 == s2)); // true (Same pool object)
            System.out.println("s1 == s3: " + (s1 == s3)); // false (Different memory locations!)


            // '.equals()' checks if the CHARACTERS are the same
            System.out.println("s1.equals(s3): " + s1.equals(s3)); // true
        }
    }

