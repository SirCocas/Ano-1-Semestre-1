import java.util.Scanner;
public class MenusFazemMeQuererMorrer 
{
	public static void main (String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		boolean Menu=true;
		int op;
		int[] seq = new int[50];
		int maximo;
		int minimo;
		while (Menu)
		{
			System.out.println("Análise de uma sequência de números inteiros:");
			System.out.println("1 - Ler sequência");
			System.out.println("2 - Escrever sequência");
			System.out.println("3 - Calcular o máximo da sequência");
			System.out.println("4 - Calcular o mínimo da sequência");
			System.out.println("5 - Calcular a média da sequência");
			System.out.println("10 - Terminar o programa");
			System.out.print("Opção ->");
			op=sc.nextInt();
			switch(op)
			{
				case 1:
					{
						seq=ler();
						break;
					}
				case 2:
					{
						escrever(seq);
						break;
					}
				case 3: 
					{
						maximo=max(seq);
						System.out.println("O maior valor da sequencia e "+maximo+".");
						break;
					}
				case 4:
					{
						minimo=min(seq);
						System.out.println("O menor valor da sequencia e "+minimo+".");
						break;
						
					}
				case 5:
					{
						System.out.println("A media dos valores da sequencia e "+med(seq)+".");
					}
				case 10:
				{
					Menu=false;
					break;
				}
				default :
				{
					System.out.print("A opcao inserida nao e valida, reinsira um valor.");
					op=sc.nextInt();
					break;
				}
			}
		}
	}
	
	
	public static int [] ler()
	{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[50];
		for (int i=0; i<50;i++)
		{
			System.out.print("Valor "+i+":");
			num[i]=sc.nextInt();
			if (num[i]==0)
				break;
		}
		return num;
	}
	
	public static void escrever (int [] num)
	{
		//for (int i=0; i<num.length; i++)
		for(int n : num)
		{
			//System.out.print(num[i]);
			System.out.println(n);
		}
	}
	
	public static int max(int [] arr)
	{
		int maximo=0;
		for (int i=0; i<arr.length; i++)
		{
			if (maximo<arr[i])
				maximo=arr[i];
		}
		return maximo;
	}
	
	public static int min(int [] arr)
	{
		int minimo=0;
		for (int i=0; i<arr.length; i++)
		{
			if (minimo>arr[i])
				minimo=arr[i];
		}
		return minimo;
	}
	public static double med(int [] arr)
	{
		double conta=0;
		int c=0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]!=0)
			{
				conta=conta+arr[i];
				c++;
			}
		}
		conta=conta/c;
		return conta;
	}
}
