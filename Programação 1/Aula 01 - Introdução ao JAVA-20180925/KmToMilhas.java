/*  JAM, set-2018
 *  comentários ... varias linhas de comentários
 *  Converte milhas para km
 */

import java.util.Scanner;

public class KmToMilhas
{
  public static void main(String[] args)
  {
    Scanner ler = new Scanner(System.in);

    final double CONVERSAO = 1.609; // constante para conversão
    double km;                      // definição da variável de entrada
    double milhas;                  // definição da variável de saída

    // 1) Ler os dados
    System.out.print("Distancia em milhas: ");
    milhas = ler.nextDouble();
    //milhas = 11.1;
    // 2) Calcular
    km = CONVERSAO * milhas;

    // 3) Escrever os resultados
    System.out.println("1) Distancia em km: " + km );      // escrita livre
    System.out.printf( "2) Distância em km: %5.2f\n", km); // escrita formatada
  }
}
