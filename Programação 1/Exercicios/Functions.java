/*
 * JAM, out-2018
 *
 * Nesta classe deve definir novas funções e testá-las na função main.
 */

import java.util.Scanner;
public class Functions {
	public static void main (String args[]) 
	{
		// Testar função sqr:
		System.out.printf("sqr(%f) = %f\n", 10.1, sqr(10.1));
		System.out.printf("sqr(%f) = %f\n", -2.0, sqr(-2.0));
		System.out.printf("f(3) = %.3f \n", f(3));

		// Invoque as funções pedidas no enunciado para as testar:
		// Por exemplo, para testar func f (problema 5.2):
		System.out.printf("f(%d) = %f\n", 5, f(5));

		// Testar as restantes funções desenvolvidas
		System.out.printf("max(%f,%f) = %f\n", 3.1, 5.2, max(3.1, 5.2));
		System.out.printf("max(%d,%d) = %d\n", 3, 2, max(3, 2));
		System.out.printf("poly3(%d,%d,%d,%d,%d)= %f\n", 0,0,0,0,1, poly3(0.0,0.0,0.0,0.0,1.0) );
		System.out.printf("fact(%d) = %d \n", 3, fact(3));
		getIntPos("Por favor insira um valor inteiro positivo");
		getIntRange(0,5);
		printNtimes(5,"Ola");
	}

	/*
	 * sqr - calcula o quadrado de um número (real).
	 */
	public static double sqr(double x) {
		double y;	// variavel para resultado
		y = x*x;	// calculo do resultado a partir dos dados
		return y;	// devolver o resultado
	}
	public static double f(int a) 
	{
		double x;
		x = 1+sqr(a);
		x=1/x;
		return x;
	}
	public static double max(double n1,double  n2)
	{
		double m;
		if (n1<n2)
			m=n2;
		else 
			m=n1;
		return m;
	}
	public static int max(int n1, int n2)
	{
		int m;
		if (n1<n2)
			m=n2;
		else 
			m=n1;
		return m;
	}
	public static double poly3(double a, double b, double c, double d, double x)
	{
		double conta;
		conta=a*x*x*x+b*x*x+c*x+d;
		return conta;
	}
	public static int fact(int n)
	{
		int conta;
		conta=1;
		for (int i=1; i<=n; i++)
			conta=conta*i;
		return conta;
	}
	public static void getIntPos(String a)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println(a);
		n=sc.nextInt();
		while (n<0)
		{
			System.out.println("O valor inserido nao e positivo, por favor volte a inserir um valor: ");
			n=sc.nextInt();
		}
		
	}
	public static int getIntRange(int a, int b)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Insira um valor entre "+a+" e "+b+":");
		n= sc.nextInt();
		while ((n<a) || (n>b))
		{
			System.out.print("O valor inserido nao faz parte do conjunto, por favor insira um novo valor: ");
			n=sc.nextInt();
		}
		return n;
			
	}
	public static void printNtimes(int num, String frase)
	{	
		for (int i=1; i<=num; i++)
			System.out.print(frase);
	}
	// Defina as funções pedidas no enunciado:


}
