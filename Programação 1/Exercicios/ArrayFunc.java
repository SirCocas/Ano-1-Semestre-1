import java.util.Scanner;
import java.lang.Math;
public class ArrayFunc 
{
	public static void main (String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int N;
		double [] x;
		System.out.print("Por favor insira um valor inteiro:");
		N=sc.nextInt();
		while (N<=0) 
		{
			System.out.print("Inseriu um valor inválido, por favor volte a inserir outro valor:");
			N=sc.nextInt();
		}
		x= new double [N];
		for (int i=0; i<=(N-1); i++)
			{
				int c=i+1;
				System.out.printf("Insira o valor numero %d \n",c);
				x[i]=sc.nextInt();
			}
		System.out.print(func(x, media(x)));
	}	
	public static double media(double [] r)
	{
		double conta=0;
		for (int i=0; i<r.length;i++)
		{
			conta=conta+r[i];
		}
		conta=conta/r.length;
		return conta;	
	}
	public static double func(double [] r, double med)
	{
		double [] dev = new double[r.length];
		double conta=0;
		for (int i=0; i<r.length; i++)
		{
			dev[i]=r[i]-med;
		}
		for (int i=0; i<r.length; i++)
		{
			conta=conta + (dev[i]*dev[i]);
		}
		conta=conta/r.length;
		conta=Math.sqrt(conta);
		return conta;
	}
}
