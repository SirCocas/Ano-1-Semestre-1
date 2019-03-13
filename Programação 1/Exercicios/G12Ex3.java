import java.util.Scanner;
import java.lang.String;
import java.io.*;
public class G12Ex3 
{
	
	public static void main (String[] args) throws IOException
	{
		Scanner sc = new Scanner (System.in);
		Robo [] arr =new Robo [100];
		arr= inicializar(arr);
		int op=0;
		int n=0;
		do
		{
			System.out.println("Micro-Rato 2013 - Gestao da prova:");
			System.out.println("1-Adicionar informacao relativa a um robo ");
			System.out.println("2- Imprimir informacao dos robos em prova");
			System.out.println("3- Vencedor da prova e tempos medios de prova");
			System.out.println("4- Media do numero de elementos por equipa");
			System.out.println("5- Mostrar o nome dos robos em maiusculas");
			System.out.println("6- Alterar informacoes de um robo");
			System.out.println("7- Remover robos da competicao");
			System.out.println("8-Gravar informacao da prova num ficheiro");
			System.out.println("9- Terminar o programa");
			System.out.println("Opcao ->");
			op=sc.nextInt();
			switch (op)
			{
				case 1:
				{
					
					arr = adicionar(arr, n);
					n++;
					
					break;
				}
				case 2:
				{
					Print(arr,n);
					break;
				}
				case 3:
				{
					MenosTempo(arr, n);
					break;
				}
				case 4:
				{
					media(arr, n);
					break;
				}
				case 5:
				{
					Nomes(arr,n);
					break;
				}
				case 6:
				{
					arr=altera(arr, n);
					break;
				}
				case 7:
				{
					n=elimina(arr,  n );
					break;
				} 
				case 8:
				{
					Ficheiro(arr,n);
					break;
				}
				case 9:
					break;
				default:
				{
					System.out.println("O valor inserido nao e valido.");
					break;
				}
				
			}
		}
		while (op !=9);
		
	}
	
	
	public static Robo [] inicializar(Robo [] arr)
	{
		for (int i=0; i<100; i++)
		{
			arr[i] = new Robo ();
			arr[i].nome="";
			arr[i].tempo=0;
			arr[i].equipa=0;
		}
		return arr;
	}
	
	
	public static Robo [] adicionar (Robo [] arr, int n)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira o nome do robo");
		arr[n].nome=sc.nextLine();
		while (arr[n].nome.isEmpty())
			arr[n].nome=sc.nextLine();
		System.out.println("Insira o tempo que o robo demorou a fazer a prova em segundos:");
		arr[n].tempo=sc.nextInt();
		while (arr[n].tempo<=0)
		{
			System.out.println("Por favor insira um valor de tempo valido:");
			arr[n].tempo=sc.nextInt();
		}
		System.out.println("Insira o numero de elementos da equipa");
		arr[n].equipa=sc.nextInt();
		while (arr[n].equipa<=0)
		{
			System.out.println("Por favor insira um valor valido:");
			arr[n].equipa=sc.nextInt();
		}
		return arr;
	}
	
	
	public static void Print(Robo [] arr, int n)
	{
		for (int i=0; i<n; i++)
		{
			System.out.println("Nome :"+arr[i].nome);
			System.out.print("Tempo que demorou a fazer a prova: ");
			conversor(arr[i].tempo);
			System.out.printf("\n");
			System.out.println("Numero de elementos da equipa: "+arr[i].equipa);
		}
	}
		
	public static void conversor (int tempo)
	{
		int horas = (int) tempo/3600;
		int minutos = (int)(tempo%3600)/60 ;
		int segundos = ((tempo%3600)%60)  ;
		System.out.print(horas+":"+minutos+":"+segundos);
		
		
	}	
	
	public static void  MenosTempo (Robo [] arr, int n)
	{
		int menor=arr[0].tempo;
		int robo=0;
		for (int i=0; i<n; i++)
		{
			if (arr[i].tempo<menor)
			{
				menor = arr[i].tempo;
				robo=i;
			}
		}
		System.out.println("Robo vencedor: "+arr[robo].nome);
		System.out.print("Tempo da prova: ");
		conversor(arr[robo].tempo);
		System.out.printf("\n");
		double conta=0;
		for (int i=0; i<n; i++)
		{
			conta=conta+arr[i].tempo;
		}
		conta=conta/n;
		System.out.println("A media do tempo que cada robo demorou a fazer a prova e "+conta);
	}
	
	
	public static void media (Robo [] arr, int n)
	{
		double conta = 0;
		for (int i=0; i<n; i++)
		{
			conta=conta+arr[i].equipa;
		}
		conta=conta/n;
		System.out.println("O numero medio de elementos por equipas e "+conta);
	}
	
	public static void Nomes (Robo [] arr, int n)
	{
		String [] nomes = new String [n];
		for (int i=0; i<n; i++)
			nomes[i]=arr[i].nome.toUpperCase();
		for (int i=0; i<n-1; i++)
		{
			for (int b=i+1; b<n; b++)
			{
				if (nomes[i].compareTo(nomes[b])>0)
				{
					String placeholder=nomes[b];
					nomes[b]=nomes[i];
					nomes[i]=placeholder;
				}
			}
		}
		System.out.println("Lista dos nomes:");
		for (int i=0; i<n; i++)
			System.out.println(nomes[i]);
	}
	
	
	public static Robo [] altera (Robo [] arr, int n)
	{
		
		boolean found=false;
		Scanner sc=new Scanner (System.in);
		int num=0;
		do
		{
			System.out.println("Insira o nome do robo cujos dados pretende modificar:");
			String nome=sc.nextLine();
			while (nome.isEmpty())
				nome=sc.nextLine();
			for (int i=0; i<n; i++)
			{
				if (nome.equals(arr[i].nome))
				{
					found=true;
					num=i;
					break;
					
				}
			}
		}
		while (!found);
		do
		{
			System.out.println("Insira o novo nome do robo:");
			do
				arr[num].nome=sc.nextLine();
			while (arr[num].nome.isEmpty());
			System.out.println("Insira o tempo de prova:");
			arr[num].tempo=sc.nextInt();
			System.out.println("Insira o numero de elementos da equipa:");
			arr[num].equipa=sc.nextInt();
		}
		while ((arr[num].tempo<=0) || (arr[num].equipa <=0));
		return arr;
	}
	
	public static int elimina (Robo [] arr, int n)
	{
		Scanner sc = new Scanner(System.in);
		int contador=n;
		System.out.println("Insira o tempo que pretende que seja o threshold:");
		int tempo= sc.nextInt();
		while (tempo <=0)
		{
			System.out.println("Por favor insira um valor positivo.");
			tempo=sc.nextInt();
		}
		for (int i=0; i<n; i++)
		{
			if (arr[i].tempo>tempo)
			{
				for (int c=i; c<(n-i-1); c++)
				{
					arr[c].tempo=arr[c+1].tempo;
					arr[c].nome=arr[c+1].nome;
					arr[c].equipa=arr[c+1].equipa;
					
				}
			 contador--;
			}
		}
		return contador;
	}
	
	
	public static void Ficheiro (Robo [] arr, int n) throws IOException
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Insira o nome do ficheiro que pretende criar, com a extensao:");
		String nome=sc.nextLine();
		while (nome.isEmpty())
			nome=sc.nextLine();
		PrintWriter escrever = new PrintWriter(nome);
		for (int i=0; i<n; i++)
		{
			escrever.println("Nome do robo: "+arr[i].nome);
			escrever.println("Tempo da prova: "+arr[i].tempo);
			escrever.println("Numero de elementos da equipa: "+arr[i].equipa);
			escrever.println(" ");
		}
		escrever.close();
	}
}


class Robo
{
	String nome;
	int tempo;
	int equipa;
}

