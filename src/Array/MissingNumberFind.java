package Array;

//1. The "Find the Missing Number" LogicQuestion: You have an array containing $n-1$ unique numbers in the range of $1$ to $n$.
// One number is missing.
// How do you find it?Array: {1, 2, 4, 6, 3, 7, 8}
// (Range is 1 to 8)
// Target: Find that 5 is missing.

import java.util.Arrays;

public class MissingNumberFind {

    public static void main(String [] args) {

        int[] n = {1, 2, 4, 6, 3, 7, 8};


        Arrays.sort(n);

        System.out.println();

    }}
//
////        for(int i = 0; i< n.length-1; i++){
////
//////            if(Array == n[i] ){
////
////
////            }
////            else{
////                System.out.println(n[i]);
////            }
//
//
////        }
//
//
//
//
//
////        int count = 1;
////
////        int sum = 0;
////
////        for(int i = 0; i<n.length; i++) {
////
////            Arrays.sort(n);
////
////
////            sum += n[i];
////            count++;
////        }
//
////        int missingNum = sum / count;
////
////        System.out.println(missingNum);
////
////            }
////        }
