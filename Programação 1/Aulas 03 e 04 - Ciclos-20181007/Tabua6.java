/*
 * JAM, 4-out-2018
 * Imprimir tabuada do 6
 * 6 x 0 = 0
 * 6 x 1 = 6
 * ...
 */

public class Tabua6 {
    public static void main(String[] args) {
        int i=0;
        //~System.out.printf("Tabuada do %d %n", 6);

        //~System.out.printf(" %d x %d = %d %n", 6, i, 6*i++);
        //~System.out.printf(" %d x %d = %d %n", 6, i, 6*i++);
        //~System.out.printf(" %d x %d = %d %n", 6, i, 6*i++);
        //~System.out.printf(" %d x %d = %d %n", 6, i, 6*i++);

        for (int n=2; n<6; n++) {
            System.out.printf("Tabuada do %d %n", n);
            for (int j=0; j<=10; j=j+2) {
                System.out.printf(" %d x %d = %d %n", n, j, n*j);
            }
        }
    }
}
.
