package ObjectClass;

public class HashCode {

    int i;
    HashCode(int i){
       this.i = i;
    }
    public int hashCode(){
        return i;
    }
    public static void main(String[] args){
        HashCode t1 = new HashCode(10);
        HashCode t2 = new HashCode(100);

            System.out.println(t1);
            System.out.println(t2);

    }
}
