package Array;

public class SmallestNumber {

    public static void main(String[] args) {
        int [] a = {45,67,23,54};

        int small = a[0];

        for(int i = 0; i< a.length; i++){
            if(a[i]<small){
                small = a[i];
            }
        }
        System.out.println(small);
    }
}
