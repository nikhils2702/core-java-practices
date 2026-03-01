package ArrayPractice;//6. Find index of an element in array
//Write a Java program to find the index of an array element.

public class IndexOfElements {
    public static void main(String[] args){
        int a[]={34,56,2,21,8,7,92};
        int ele = 7;
        int val = -1;
        for(int i=0; i<a.length;i++){
            if(a[i]==ele){
               val=i;
            }
        }
        System.out.println(val);
    }
}
