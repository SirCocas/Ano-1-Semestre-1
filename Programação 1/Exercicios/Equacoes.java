import java.util.Scanner;
public class Equacoes 
{
	public static void main (String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		double num1, num2, delta;
		int vezes;
		System.out.print("Insira um valor real: ");
		num1=sc.nextDouble();
		System.out.print("Insira um valor real maior do que o anterior: ");
		num2=sc.nextDouble();
		while (num1>=num2)
		{
			System.out.print("O numero que inseriu nao e maior do que o anterior. Volte a tentar");
			num2=sc.nextDouble();
		}
		System.out.print("Insira o numero de valores que deseja calcular: ");
		vezes=sc.nextInt();
		while (vezes<=0)
		{	
			System.out.print("O valor inserido nao e valido, volte a inserir: ");
			vezes=sc.nextInt();
		}
		delta=(num2-num1+1)/vezes;
		System.out.println("|   x   | 5x2+10x+3 |7x3+3x2+5x+2|");
		System.out.println("----------------------------------");
		for (; num1<=num2; num1=num1+delta)
		{
			System.out.printf("| %5.1f | %9.2f |%12.3f| \n", num1, poly3(0,5,10,3,num1), poly3(7,3,5,2,num1) );
		}
	}
	public static double poly3(double a, double b, double c, double d, double x)
	{
		double conta;
		conta=a*x*x*x+b*x*x+c*x+d;
		return conta;
	}
}
