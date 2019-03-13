import java.util.Scanner;
public class MaximoDivComum 
{
	public static void main (String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("Insira um numero: ");
		num1=sc.nextInt();
		while (num1<=0)
		{
			System.out.print("Inseriu um valor inválido, volte a inserir um valor positivo: ");
			num1=sc.nextInt();
		}
		System.out.print("Insira outro numero: ");
		num2=sc.nextInt();
		while (num2<=0)
		{
			System.out.print("Inseriu um valor inválido, volte a inserir um valor positivo: ");
			num2=sc.nextInt();
		}
			System.out.println("O maximo divisor comum entre os dois numeros e  "+maximodiv(num1,num2));
		
	}
	public static int maximodiv (int x, int y) 
	{
		while (x!=y)
		{
			while (x<y)
				y=y-x;
			while (x>y)
				x=x-y;
		}
		return x;
	}
}
