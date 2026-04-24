package string.StringBuffer.stringBufferConstructor;

public class EmptyStringBufferObjectConstructor {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        //Forumula of capacity(currentcapacity + 1)*2
        //count or add above 16 char then capacity inctrese 34

        System.out.println(sb.capacity());

        sb.append("javaPrograming");  //14
        System.out.println(sb.capacity());

        sb.append("yes"); //34
        System.out.println(sb.capacity());
    }
}
