/*
 * JAM, 18-out-2018
 *
 */
import java.util.Scanner;

public class Notas18a {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        final int NALUNOS = 5;
        int nalunos= ler.nextInt();
        int[] notas = new int[nalunos];

        int a[] = {11,3,5,7,12,15, 16, 14};
        //~a =  teste();

        int nota, s=0;
        float k;

        print(a);

        for (int i=0; i < nalunos; i++ ) {
            do {
                System.out.printf("Valor %3d: ",i+1);
                nota = ler.nextInt();
            } while (nota <0 || nota > 20);
            notas[i] = nota;
            s = s + nota;
        }
        k = (float)s/NALUNOS;
        for (int n=0; n < notas.length;n++){
            if (notas[n] >= k) System.out.printf("Maior que media =%d%n", notas[n]);
        }
        System.out.printf("S = %3d %nK = %4.1f %n",s,k);
        print(notas);

    }
    // função print
    public static void print(int[] x){
    for (int n=0; n < x.length;n++){
            System.out.printf("%d%n", x[n]);
        }
    }

    public static int[] teste(){
        int[] b= {1,3,5,7,11};
        return b;
    }
}
