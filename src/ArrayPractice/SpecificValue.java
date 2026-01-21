package ArrayPractice;//5. Check if array contains a specific value
//Write a Java program to test if an array contains a specific value.

public class SpecificValue {
    public static void main(String[] args){
        int num[] = {45,34,72,99,3,54,72};
        int target = 72;

        int val = 0;
        for(int i=0; i<num.length; i++){
            if(num[i]== target){
                val++;
            }
        }
        System.out.println(val);

    }
}
