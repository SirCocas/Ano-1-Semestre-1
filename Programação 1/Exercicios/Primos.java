import java.util.Scanner;
public class Primos
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	int x,contador;
	System.out.print("Por favor insira um valor positivo não nulo:");
	x=sc.nextInt();
	System.out.println();
	contador=2;
	if (x==2)
		System.out.println("O valor inserido e primo");
	if (x==1)
		System.out.println("O valor inserido e primo");
	while (x<=0)
	{
		System.out.print("Inseriu um valor inválido, por favor insira um valor positivo:");
		x=sc.nextInt();
	}
	while (contador<x)
	{
		if (x%contador!=0)
			{
				System.out.println("O valor inserido não é primo.");
				break;
			}
		else
		if (x==contador-1)
			System.out.println("O valor inserido e primo");
		contador++;
	}
  }
}
