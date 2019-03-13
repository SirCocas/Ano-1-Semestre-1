
import java.util.Scanner;
/*
 * Created by jam on 26-out-2015
 Cálculo das raízes reais e imaginárias de um polinómio de 2º grau. Ax^2 + Bx + C = 0
 definindo uma classe de complexos
 */

public class Classes_Raizes2Grau {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);
        // variáveis
        double A, B, C; // coeficientes do polinómio
        Complexo r1 = new Complexo();
        Complexo r2 = new Complexo();

        // Ler coeficientes A; B; C
        System.out.print("Introduza os coeficientes A, B, C do polinomio do 2grau:\n");
        A = ler.nextDouble();
        B = ler.nextDouble();
        C = ler.nextDouble();
        RaizesComplexas(A, B, C, r1, r2);
        System.out.printf("raizes imaginarias\n%+f i%+f\n%+f i%+f\n", r1.r, r1.i, r2.r, r2.i);
    }

    public static void RaizesComplexas(double A, double B, double C,
    Complexo raiz1, Complexo raiz2) {
        // calcula raizes usando fórmula resolvente
        double delta;
        delta = B * B - 4.0 * A * C;
        // testa se são raizes reais
        if (delta >= 0) {
            raiz1.r = (-B + Math.sqrt(delta)) / 2.0 * A;
            raiz2.r = (-B - Math.sqrt(delta)) / 2.0 * A;
            raiz1.i =0;
            raiz2.i =0;
        } else {
            raiz1.r = (-B) / 2.0 * A;
            raiz2.r = (-B) / 2.0 * A;
            raiz1.i = Math.sqrt(-delta) / 2.0 * A;
            raiz2.i = -Math.sqrt(-delta) / 2.0 * A;
        }
    }
}

class Complexo {
    double r;
    double i;
}
