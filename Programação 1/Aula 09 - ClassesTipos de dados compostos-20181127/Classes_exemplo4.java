import java.util.Scanner;
/*
 * Leitura de números complexos até ser introduzido o número 0.0 + i0.0
 * Soma de todos os números complexos introduzidos.
 */
public class Classes_exemplo4 {
  static Scanner sc = new Scanner(System.in);
  public static void main (String args[]){

  Complexo soma = new Complexo();
  Complexo y;
  do
  {
    y = LerComplexo2();
    soma.r += y.r;
    soma.i += y.i;
    PrintComplexo(y);
  }while(y.r != 0.0 || y.i != 0.0);
  System.out.print("Soma = ");
  PrintComplexo(soma);
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
