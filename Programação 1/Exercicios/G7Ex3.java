import java.util.*;
import java.io.*;
public class G7Ex3 
{
	
	public static void main (String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		boolean menu=true;
		int [] num = ler();
		while (menu)
		{
			System.out.println("1-Adicionar números à sequência existente.");
			System.out.println("2- Gravar a sequência atual num ficheiro.");
			int op=sc.nextInt();
			switch (op)
			{
				case 1:
				{
					num=mais(num);
					break;
				}
				case 2:
				{
					NewFile(num);
					break;
				}
				default: 
				{
					System.out.println("Opcao invalida, a fechar programa....");
					break;
				}
			}
		}
	}
	public static int [] ler() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int contador=0;
		System.out.println("Insira o nome do ficheiro:");
		String nome=sc.nextLine();
		File ficheiro= new File(nome);
		Scanner scf= new Scanner(ficheiro);
		while (scf.hasNextDouble())
		{
			contador ++;
			scf.nextDouble();
		}
		scf.close();
		int [] seq = new int [contador];
		scf= new Scanner (new File(nome));
		for(int i = 0 ; i < contador ; i++) 
        {
			int s = scf.nextInt();
			seq[i] = s;
        }
        scf.close();
        return seq;
		
	}
	
	public static int [] mais(int [] arr)
	{
		Scanner puta= new Scanner (System.in);
		System.out.print("Insira quantos numeros deseja inserir:");
		int n=puta.nextInt();
		while (n<=0)
		{
			System.out.println("O valor inserido e invalido, por favor insira um valor positivo.");
			n=puta.nextInt();
		}
		int comp=n+arr.length;
		int [] numeros = new int [comp];
		for (int i=0; i<arr.length; i++)
			numeros[i]=arr[i];
		for (int i=arr.length; i<comp; i++)
		{
			System.out.print("Numero "+i+":");
			numeros[i]=puta.nextInt();
		}
		return numeros;
	}
	public static void NewFile(int [] arr) throws IOException
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Insira o nome do novo ficheiro:");
		String nome=sc.nextLine();
		File output = new File(nome);
		PrintWriter pw = new PrintWriter(output);
		for (int i=0; i<arr.length; i++)
			pw.println(arr[i]);
		pw.close();
	}
}

