package string.stringConstructor;


// String s=new String(byte[] b);
//Create an equivalent String object for the given byte[] array

public class ByteConverter {
    public static void main(String[] args) {
        //// These are ASCII values for "Hello"
        byte[] byteArray = {72,101,108,108,111};

        //// 2. Use the constructor to convert bytes to String
        String s = new String(byteArray);

        System.out.println("the transleted text is :"+ s);

        String sb = new String(byteArray ,0,2);
        System.out.println("The shortened text is: " + sb);




    }
}
