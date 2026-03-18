package Patturn.NumberPatturnProgram;

public class pattern9 {
    public static void main(String[] args) {

        int n = 8;

        for (int i = n; i >0; i--) {
            for (int j = i; n > j; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }

}

