import java.util.Scanner;
/*
 * Definição de duas funções para manipulação de complexos:
 * cópia e impressão.
 * Passagem de variáveis como referência a funções
 */
public class Classes_exemplo2 {
  static Scanner sc = new Scanner(System.in);
  public static void main (String args[]){

  Complexo x = new Complexo();
  Complexo y = new Complexo();
  //PrintComplexo(x);
  x.r = 5.0;
  x.i = 2.0;
  CopiaComplexo(x, y);
  System.out.print("y ");
  PrintComplexo(y);
  y.r = 10.0;
  y.i = 15.0;
  System.out.print("x ");
  PrintComplexo(x);
  System.out.print("y ");
  PrintComplexo(y);
}
public static void PrintComplexo(Complexo tmp)
{
  System.out.println("real: " + tmp.r + " imag: " + tmp.i);
}

public static void CopiaComplexo(Complexo c1, Complexo c2)
{
  c2.r = c1.r;
  c2.i = c1.i;
}
}

class Complexo
{
  double r, i;
}
