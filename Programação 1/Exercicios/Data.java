import java.util.Scanner;
public class Data
{
	public static void main (String arg[])
	{
		int mes, ano;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o mes cujo numero de dias deseja saber: ");
		mes=sc.nextInt();
		while ((mes<=0) || (mes >12))
		{
			System.out.print("O valor inserido nao e um mes valido, por favor volte a inserir um valor: ");
			mes=sc.nextInt();
		}
		System.out.print("Insira o ano: ");
		ano=sc.nextInt();
		while (ano<0) 
		{
			System.out.print("O valor inserido nao e valido para o ano, por favor insira um valor positivo: ");
			ano=sc.nextInt();
		}
		if (mes!=2) 
			System.out.print("O mes inserido tem "+numdias(mes)+" dias.");
		else if (bissexto(ano))
			System.out.print("O mes inserido tem 29 dais.");
			else 
				System.out.print("O mes inserido tem 28 dais.");
	}
	public static int numdias(int M)
	{
		int dias=0;
		switch (M)
		{
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10: 
			case 12: 
				dias=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				dias=30;
				break;
			
		}
		return dias;
	}
	public static boolean bissexto (int a)
	{
		boolean bi=true;
		if ((a%400==0) || ((a%4==0)&&(a%100 !=0)) )
				bi=true;
			else
				bi=false;
		return bi;
	}
}
