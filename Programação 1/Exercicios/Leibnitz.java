import java.util.Scanner;
import java.lang.Math;
public class Leibnitz
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	int num;
	double conta=0;
	System.out.print("Insira o numero cuja serie de Leibnitz pretende calcular: ");
	num=sc.nextInt();
	for (int i=1; i<=num; i++)
	{
		conta= ( conta + (Math.pow(-1,i+1)/(2*i-1)));
    }
    System.out.printf("O valor da serie de Leinbitz e %.15f",conta);
  }
 }
