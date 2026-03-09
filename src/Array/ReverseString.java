package Array;

public class ReverseString {

    public static void main(String [] args){
        String s1 = "Nikhil";


//        print Second Way

//        for(int i = s1.length()-1; i >= 0 ; i--){
//             System.out.print(s1.charAt(i));
//        }


        // print Second Way

//        StringBuilder s2 = new StringBuilder(s1);
//        s2.reverse();
//
//        System.out.println(s2);


        //print third way

        StringBuilder s2 = new StringBuilder(s1);

        for(int i = s1.length()-1; i>=0; i--){
            s2.append(s1.charAt(i));

        }
        System.out.println(s2);








    }
}
