import java.util.Scanner;
/*
 * Funções para leitura de complexos, duas versões
 */
public class Classes_exemplo3 {
  static Scanner sc = new Scanner(System.in);
  public static void main (String args[]){

  Complexo x = new Complexo();

  LerComplexo(x);
  PrintComplexo(x);

  Complexo y;
  y = LerComplexo2();
  PrintComplexo(y);
}

public static Complexo LerComplexo2()
{
  Complexo tmp = new Complexo();
  System.out.print("Real: ");
  tmp.r = sc.nextDouble();
  System.out.print("Imag: ");
  tmp.i = sc.nextDouble();

  return tmp;
}

public static void LerComplexo(Complexo tmp)
{

  System.out.print("Real: ");
  tmp.r = sc.nextDouble();
  System.out.print("Imag: ");
  tmp.i = sc.nextDouble();

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
