package Patturn.NumberPatturnProgram;

public class pattern4 {

    public static void main(String[] args) {

    pattern4 pattern4=new pattern4();
    pattern4.patterPrint();

    }
    public void patterPrint(){
        int a = 7;

        for (int i = a; i >= 1; i--) {
            for (int j = a; j >= i; j--) {

                System.out.print(j+ " ");

            }

            System.out.println();
        }
    }
}

//        7
//        7 6
//        7 6 5
//        7 6 5 4
//        7 6 5 4 3
//        7 6 5 4 3 2
//        7 6 5 4 3 2 1