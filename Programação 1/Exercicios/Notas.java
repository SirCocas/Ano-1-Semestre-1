import java.util.Scanner;
import java.io.*;
public class Notas 
{
	public static void main (String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Insira o numero de notas que deseja inserir: ");
		num=sc.nextInt();
		while (num<1)
		{
			System.out.print("Inseriu um valor invalido, por favor insira um valor maior do que 1: ");
			num=sc.nextInt();
		}
		int [] notas = lerNotas(0,20, num);
		int [] hist = hist(notas,num);
		print(hist);
	}
	public static int[] lerNotas (int mv,int MV,int comp)
	{
		Scanner sc = new Scanner(System.in);
		int[] notas = new int[comp];
		for (int i=1; i<=comp; i++)
		{
			System.out.print("Nota "+i+": ");
			notas[i-1]= sc.nextInt();
			while (notas[i-1]<mv || notas[i-1]>MV)
			{
				System.out.print("O valor inserido nao e valido, por favor volte a inserir um valor entre "+mv+" e "+MV+": ");
				notas[i-1]= sc.nextInt();
			}
		}
		return notas;
	}
	public static int[] hist (int []notas,int n)
	{
		int[] hist = new int[21];
		for (int j=0; j<=n-1; j++)
		{
			hist[notas[j]]=hist[notas[j]]+1;
		}
		return hist;
	}
	public static void print(int []hist) throws IOException
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Insira o nome do ficheiro que prentede criar:");
		String nome= sc.nextLine();
		File output = new File(nome);
		PrintWriter pw = new PrintWriter(output);
		pw.println("Histograma de notas:");
		for (int i=0; i<=20; i++)
		{
			pw.print(i+":");
			for (int j=0;j<hist[i]; j++)
				pw.print("*");
			pw.println("");
		}
		pw.close();
		
	}
}

