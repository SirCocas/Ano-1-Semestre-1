import java.util.Scanner;
import java.lang.String;
public class G9Ex5
{
	
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int num;
		int base;
		do 
		{
			System.out.print("Insira o numero que deseja calcular:");
			num = sc.nextInt();
		}
		while (num<=0);
		do
		{
			System.out.print("Insira a base:");
			base = sc.nextInt();
		}
		while (base<0);
		System.out.println("A conversao do numero "+num+" para a base "+base+" e "+MudaBase(num,base));
	}
	public static String MudaBase(int n, int b)
	{
		String num="";
		if (n<b)
			num=""+ n;
		else 
		{
			while (n>=1)
			{
				String temp = ""+ n%b;
				num=temp.concat(num);
				n=(int)n/b;
			}
		}
		return num;
	}
}

