/*
 * JAM, 11-out-2018
 * calcular factorial de n!
 */
import java.util.Scanner;
public class Funcoes18a {

    static int global=8;

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);


        int h = factorial(11);
        System.out.print("Factorial de 5: " + factorial(5));
        tabua(6);

        //~for (int k=2; k < 20; k++) {
            //~System.out.printf(" %3d! = % d %n",k,factorial(k));
        //~}
    }

    public static  int factorial(int n) {
        int h=3;
        if (n > 0 && n < 14) {
            int fact =1;
            for (int i = 2; i<= n; i++) {
                fact = fact * i;
            }
            return fact;
        } else return -1;
    }

    public static void tabua(int n) {
        System.out.printf("Tabuada do %d %n", n);
        for (int j=0; j<=10; j=j+2) {
            System.out.printf(" %d x %d = %d %n", n, j, n*j);
        }
    }

}

