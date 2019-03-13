import java.util.Scanner;
public class Primos_ 
{
	public static void main (String args[])  
	{
		Scanner sc = new Scanner(System.in);
		int M;
		System.out.print("Insira um numero maior do que zero: ");
		M=sc.nextInt();
		while (M<=0)
		{
			System.out.print("O valor inserido nao e positivo, insira um novo valor: ");
			M=sc.nextInt();
		}
		System.out.println("Lista de numeros primos: ");
		for (int i=1;i<M; i++)
		{
			if (primo(i)) 
				System.out.println(" - "+i);
		}
	}
	public static boolean primo (int x)
	{
		boolean primos=true;
		for (int c=2; c<x;c++)
		{
			if (x%c==0)
				primos=false;
		}
		return primos;
	}
}
