package Array;

public class ArrayCreation {

    public static void main(String[]args){

        int[] x = new int[3];  //one dimentional array
        int[][] y = new int[3][4]; // Two dimentional array
        boolean [][] a = new boolean [4][5];
        System.out.println(x.getClass().getName());
        System.out.println(y.getClass().getName());
        System.out.println(a.getClass().getName());

    }
}
