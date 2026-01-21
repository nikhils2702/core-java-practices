package ArrayPractice;//4. Calculate average of array elements

//Write a Java program to calculate the average value of array elements.
public class AverageAllValue {
    public static void main(String[] args){

        int a[] ={7,3,9,6,2,1,5};
        int Add = 0;
        for(int i=0; i<a.length;i++){
            Add = Add + a[i];
        }

        int average = Add/a.length;
        System.out.println("Average of all  is: "+ average);
    }
}
