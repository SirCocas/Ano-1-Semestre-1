import java.util.Scanner;
public class Fatt
{
	public static void main (String arg[])
	{
		Scanner sc=new Scanner (System.in);
		int M;
		System.out.print("Insira o numero com o qual deseja começar a calcular a lista de fatoriais: ");
		M=sc.nextInt();
		while (M<=0)
		{
			System.out.print("Nao pode iniciar a sequencia com esse valor, por favor insira um valor positivo nao nulo: ");
			M=sc.nextInt();
		}
		for (;M>=1; M--)
		{
			System.out.println(M+"!="+fat(M));
		}	
	}
	public static int fat(int num)
	{
		int conta=1;
		for (int i=1; i<=num; i++)
			conta=conta*i;
		return conta;
	}
}
