package ArrayPractice;

public class SumOfAllValues {
    public static void main(String[] args) {
        int num[] = {9, 7, 3, 6};
        int Add = 0;
        for (int i = 0; i < num.length; i++) {
            Add = Add + num[i];
        }
        System.out.println("Total of all numbers: "+ Add);
    }
}