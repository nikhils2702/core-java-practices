package ArrayPractice;

public class OddIndexNumber {

    public static void main(String[] args) {

        int a [] ={13, 45, 72, 66, 90, 82, 71, 43, 43};


        for(int i = 0; i < a.length; i++){

            if (i%2==0){
                System.out.println("even at index " + i + " value " + a[i] );
            }
            else{
                System.out.println("odd at index "+ i +" value " + a[i]);
            }
        }
    }
}
