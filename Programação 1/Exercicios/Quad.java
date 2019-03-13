import java.util.Scanner;
public class Quad
{
	public static void main (String arg[])
	{
		int colunas, linhas;
		Scanner sc=new Scanner (System.in);
		System.out.print("Insira o numero de colunas do retangulo que deseja desenhar: ");
		colunas=sc.nextInt();
		while (colunas<=0)
		{
			System.out.print("O valor inserido nao e valido, por favor insira um valor positivo: ");
			colunas=sc.nextInt();
		}
		System.out.print("Insira o numero de linhas do retangulo que deseja desenhar: ");
		linhas=sc.nextInt();
		while (linhas<=0)
		{
			System.out.print("O valor inserido nao e valido, por favor insira um valor positivo: ");
			linhas=sc.nextInt();
		}
		draw(colunas, linhas);
	}
	public static void draw (int col, int lin)
	{
		for (int l=1; l<=lin;l++)
		{	
			for (int c=1; c<=col; c++)
			{
				if (c==1 || c==col || l==1||l==lin)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.printf("\n");
		}		
	}
}
