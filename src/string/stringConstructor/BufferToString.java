package string.stringConstructor;

public class BufferToString {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("JAVA");

        //modyfy Buffer
        sb.append(" is");
        sb.append(" powerful");

       // Convert to String
        // This creates a brand new String object with the content "Java is Powerful"
        String s = new String(sb);

        System.out.println(s);





    }
}
