import java.util.Scanner;
public class MinimoDivComum 
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
		while (num1<=0)
		{
			System.out.print("Inseriu um valor inválido, volte a inserir um valor positivo: ");
			num2=sc.nextInt();
		}
		if (num1==num2)
			System.out.println("O maximo divisor comum e "+num1);
		else if (num1>num2)
			System.out.println("O maximo divisor comum e "+maximodiv(num1,num2));
		else 
			System.out.println("O maximo divisor comum e "+maximodiv(num2,num1));
		
	}
	public static int maximodiv (int x, int y)
	{
		int div=x%y;
		return div;
		
	}
}
