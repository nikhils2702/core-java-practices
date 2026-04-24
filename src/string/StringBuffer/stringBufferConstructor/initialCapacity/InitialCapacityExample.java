package string.StringBuffer.stringBufferConstructor.initialCapacity;

public class InitialCapacityExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer(28);
        System.out.println(sb.capacity());
    }
}
