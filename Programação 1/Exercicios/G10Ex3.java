import java.util.Scanner;
import java.io.*;
public class G10Ex3
{
	static final Scanner kb = new Scanner(System.in);
	public static void main (String[] args) throws IOException
	{
		boolean menu=true;
		int op;
		double [] valores = null;
		while (menu)
		{
			System.out.println("Analisador de pH");
			System.out.println("1 - Ler valores de pH de um ficheiro");
			System.out.println("2 - Escrever os valores de pH no terminal");
			System.out.println("3 - Calcular o pH medio das amostras");
			System.out.println("4 - Calcular o numero de amostras acidas (<7) e acidas (>7)");
			System.out.println("5 - Calcular o numero de amostras de pH superior a media");
			System.out.println("6 - Escrever valores de pH no terminal ordenados de modo crescente");
			System.out.println("7 - Terminar o programa");
			op=kb.nextInt();
			switch (op)
			{
				case 1:
				{
					valores  = Ler();
					break;
				}
				case 2:
				{
					if (valores != null)
						Escrever(valores);
					else
						System.out.println("Os valores tem de ser inseridos para poderem ser escritos.");
					break;
				}
				case 3:
				{
					if (valores != null)
						System.out.println("O valor medio do pH e "+med(valores)+".");
					else
						System.out.println("Dados sao necessarios para a media ser calculada.");
					break;
				}
				case 4:
				{
					if (valores != null)
						comparacao(valores);
					else 
						System.out.println("Por favor insira valores primeiro.");
					break;
				}
				case 5:
				{
					if (valores != null)
						System.out.println("Foram inseridos "+ vezes(valores,med(valores))+" valores acima da media.");
					else
						System.out.println("Insere valores antes de os comparares com a media.");
					break;
				}
				case 6:
				{
					//função de ordenar
					break;
				}
				case 7:
				{
					menu=false;
					break;
				}
				default:
				{
					System.out.print("Inseriu um valor invalido, por favor insira uma opcao existente.");
					op=kb.nextInt();
					break;
				}
			}
		}
	}
	public static double [] Ler () throws IOException
	{
		String nome;
		int cont=0;
		System.out.println("Insira o nome do ficheiro:");
		nome=kb.nextLine();
		File fich = new File(nome);
		while (!fich.canRead())
		{
			System.out.println("O nome inserido é inválido, por favor volte a inserir.");
			nome=kb.nextLine();
			fich = new File(nome);
		}
		Scanner scf = new Scanner(fich);
		while(scf.hasNextDouble()) 
		{
            cont++;
            scf.nextDouble();
        }
        double [] numeros = new double[cont];
        scf.close();
        scf = new Scanner(new File(nome));
        for(int i = 0 ; i < cont ; i++) 
        {
			double s = scf.nextDouble();
			numeros[i] = s;
        }
        scf.close();
        
		return numeros;
		
	}
	public static void Escrever (double [] arr) 
	{
		for (int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static double med(double [] arr)
	{
		double conta=0;
		for (int i=0; i<arr.length; i++)
			conta=conta+arr[i];
		conta=conta/arr.length;
		return conta;
	}
	public static void comparacao(double [] arr)
	{
		int acido=0;
		int basico=0;
		for (int i=0;i<arr.length; i++)
		{
			if (arr[i]<7)
				acido++;
			else if (arr[i]>7)
				basico++;
		}
		System.out.println("O numero de amostras com pH basico e "+basico+"e o numero de amostras com pH acido e "+acido+".");
	}
	public static int vezes(double [] arr, double valor)
	{
		int contador =0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]<valor)
				contador++;
		}
		return contador;
				
	}
}

