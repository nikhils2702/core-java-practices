package Array;

public class ArrySingleline {
    public static void main(String[] args) {
        //  int[][][] x = {{{, }, {, }};

        int[] a = {10, 20, 30};
        int[] b = {40, 50, 60};
        int[] c = {70, 80};
        int[] d = {90, 100, 110};

        int[][][] x = {{a, b}, {c, d}};


        System.out.println(x[0][1][2]); //60
        System.out.println(x[1][0][1]); //80
        System.out.println(x[2][0][0]);
        System.out.println(x[1][2][0]);
    }
}
