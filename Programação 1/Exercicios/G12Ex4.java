/*
 * G12Ex4.java
 * 
 * Copyright 2019 sofas <sofas@LAPTOP-TK50VHB9>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.io.*;
import java.util.Scanner;
public class G12Ex4 
{
	
	public static void main (String[] args) throws IOException
	{
		Scanner sc = new Scanner (System.in);
		int op=0;
		Aluno [] arr = new Aluno [100];
		do
		{
			System.out.println("Servicos Academicos: Gestao de uma pauta:");
			System.out.println("1- Ler ficheiro com numeros mec. e pedir informacao de notas");
			System.out.println("2- Imprimir no terminal a informacao da disciplina");
			System.out.println("3- Calcular estatísticas das notas finais");
			System.out.println("4- Alterar as notas de um aluno");
			System.out.println("5- Imprimir um histograma de notas");
			System.out.println("6- Gravar num ficheiro a informacao da disciplina (ordenada)");
			System.out.println("7- Terminar o programa");
			System.out.println("Opcao ->");
			op=sc.nextInt();
			switch (op)
			{
				case 1:
				{
					arr=LerFich();
					break;
				}
				case 2:
				{
					Print(arr);
					break;
				}
				case 3:
				{
					System.out.println("Media das notas: "+Media(arr));
					Aluno melhor = MelhorAluno(arr);
					Passou(arr);
					break;
				}
				case 4:
				{
					Alterar(arr);
					break;
				}
				case 5:
				{
					Histograma(arr);
					break;
				}
				case 6:
				{
					ficheiro(arr);
					break;
				}
				case 7:
					break;
				default:
				{
					System.out.println("Inseriu uma opcao invalida");
				}
			}
			
		}
		while (op !=7);
		
	}
	
	
	public static Aluno [] LerFich() throws IOException
	{
		Scanner sc = new Scanner (System.in);
		int contador =0;
		System.out.println("Insira o nome do ficheiro que pretende importar");
		String nome= sc.nextLine();
		while (nome.isEmpty())
			nome= sc.nextLine();
		File ficheiro = new File (nome);
		Scanner in = new Scanner (ficheiro);
		while (in.hasNextInt())
		{
			contador++;
			in.nextInt();
		}
		in.close();
		Scanner dados = new Scanner (ficheiro);
		Aluno [] arr = new Aluno [contador];
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = new Aluno();
			arr[i].num=dados.nextInt();
			System.out.println("A inserir os dados do aluno de numero mec. "+arr[i].num);
			System.out.print("Nota em Epoca Normal:");
			arr[i].notaNormal=sc.nextInt();
			while (((arr[i].notaNormal >21) && (arr[i].notaNormal!=77) )|| (arr[i].notaNormal <-1))
			{
				System.out.println("");
				System.out.print("Insira um valor valido:");
				arr[i].notaNormal=sc.nextInt();
			}
			System.out.println("");
			System.out.print("Nota em Epoca de Recurso:");
			arr[i].notaRec=sc.nextInt();
			while (((arr[i].notaRec >21) && (arr[i].notaRec!=77) )|| (arr[i].notaRec <-1))
			{
				System.out.println("");
				System.out.print("Insira um valor valido:");
				arr[i].notaRec=sc.nextInt();
			}
			arr[i].notaFinal=arr[i].notaNormal;
			if (arr[i].notaFinal ==77)
				arr[i].notaFinal=arr[i].notaRec;
			else 
				if ((arr[i].notaRec> arr[i].notaFinal) && (arr[i].notaRec!=77))
					arr[i].notaFinal=arr[i].notaRec;
		}
		return arr;
	}
	
	
	
	public static void Print (Aluno [] arr)
	{
		System.out.println("Pauta de uma disciplina");
		System.out.println("-----------------------");
		for (int i=0; i<arr.length; i++)
			System.out.printf("|%5d |%2d |%2d |%2d |\n", arr[i].num, arr[i].notaNormal, arr[i].notaRec, arr[i].notaFinal);
	}
	
	
	public static double Media (Aluno [] arr)
	{
		double conta=0;
		int contador =0;
		for (int i=0; i<arr.length;i++)
			if (arr[i].notaFinal!=77)
			{
				conta=conta+arr[i].notaFinal;
				contador ++;
			}
		conta=conta/contador;
		return conta;
	}
	
	public static Aluno MelhorAluno(Aluno [] arr)
	{
		Aluno melhor = new Aluno();
		melhor= arr[0];
		for (int i=0; i<arr.length; i++)
		{
			if (melhor.notaFinal==77)
				melhor =arr[i];
			else 
				if ((melhor.notaFinal<arr[i].notaFinal) && (arr[i].notaFinal!=77))
					melhor=arr[i];
		}
		System.out.println("");
		System.out.println("Dados do melhor aluno");
		System.out.println("Numero mecanografico: " + melhor.num);
		System.out.println("Nota na Epoca Normal: " + melhor.notaNormal);
		System.out.println("Nota na Epoca de Recurso: " + melhor.notaRec);
		System.out.println("Nota final: "+melhor.notaFinal);
		System.out.println("");
		return melhor;
	}
	
	
	public static void Passou (Aluno [] arr)
	{
		int passou=0;
		int reprovou=0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i].notaFinal>9 && arr[i].notaFinal!=77)
				passou++;
			else
				reprovou++;
		}
		System.out.println("");
		System.out.println("Numero de alunos aprovados: "+passou);
		System.out.println("Numero de alunos reprovados: "+reprovou);
		System.out.println("");
	}
	
	
	
	public static Aluno[] Alterar (Aluno[] arr)
	{
		boolean alterou=false;
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira o numero mecanografico do aluno cujos dados pretende alterar:");
		int mec=sc.nextInt();
		for (int i=0; i<arr.length; i++)
		{   
			if (arr[i].num==mec)
			{
				alterou=true;
				System.out.print("Nota em Epoca Normal:");
				arr[i].notaNormal=sc.nextInt();
				while (((arr[i].notaNormal >21) && (arr[i].notaNormal!=77) )|| (arr[i].notaNormal <-1))
				{
					System.out.println("");
					System.out.print("Insira um valor valido:");
					arr[i].notaNormal=sc.nextInt();
				}
				System.out.println("");
				System.out.print("Nota em Epoca de Recurso:");
				arr[i].notaRec=sc.nextInt();
				while (((arr[i].notaRec >21) && (arr[i].notaRec!=77) )|| (arr[i].notaRec <-1))
				{
					System.out.println("");
					System.out.print("Insira um valor valido:");
					arr[i].notaRec=sc.nextInt();
				}
				arr[i].notaFinal=arr[i].notaNormal;
				if (arr[i].notaFinal ==77)
					arr[i].notaFinal=arr[i].notaRec;
				else 
					if ((arr[i].notaRec> arr[i].notaFinal) && (arr[i].notaRec!=77))
						arr[i].notaFinal=arr[i].notaRec;
			}	
		}
		if (!alterou)
			System.out.println("Nao existe nenhum aluno com esse numero mecanografico.");
		return arr;
	}
	
	
	
	public static void Histograma (Aluno[] arr)
	{
		int [] hist = new int [21];
		int maior=0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i].notaFinal!=77)
				hist[arr[i].notaFinal]++;
		}
		for (int i=0; i<hist.length; i++)
		{
			if (hist[i]>maior)
				maior=hist[i];
		}
		System.out.println("Histograma de uma disciplina:");
		System.out.println("");
		for (int c=maior; c>0; c--)
		{
			for (int i=0; i<hist.length; i++)
			{
				if (hist[i]>=c)
					System.out.print(" * ");
				else 
					System.out.print("   ");
				
			}
			System.out.printf("\n");
		}
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(" 0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20");
	}
	
	
	public static Aluno [] Ordena(Aluno [] arr)
	{
		int passou=0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i].notaFinal>9 && arr[i].notaFinal!=77)
				passou++;

		}
		Aluno [] aprovados = new Aluno [passou];
		for (int i=0; i<aprovados.length; i++)
		{
			for (int c=i; c<arr.length; c++)
			{
				if (arr[i].notaFinal>9 && arr[i].notaFinal!=77)
				{
					aprovados[i]= arr[i];
					break;
				}
			}
					
		}
		
		
		for (int i=0;i<aprovados.length -2; i++)
		{
			for (int c=i+1; c<aprovados.length-1; i++)
			{
				if (aprovados[c].notaFinal<aprovados[i].notaFinal)
				{
					Aluno temp = new Aluno();
					temp=aprovados[c];
					aprovados[c]=aprovados[i];
					aprovados[i]=aprovados[c];
				}
			}
		}
		
		return aprovados;
		
	}
	
	
	public static void ficheiro (Aluno [] arr) throws IOException
	{
		arr= Ordena(arr);
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira o nome do ficheiro que pretende criar:");
		String nome= sc.nextLine();
		while (nome.isEmpty())
			nome= sc.nextLine();   //para não ocorrer o erro do nome estar vazio
		PrintWriter out = new PrintWriter (nome);
		for (int i=0; i<arr.length; i++)
		{
			out.println("Nota na Epoca Normal: " +arr[i].notaNormal);
			out.println("Nota na Epoca de Recurso: " + arr[i].notaRec);
			out.println("Nota final: "+arr[i].notaFinal);
			out.println("");
		}
		out.close();
	}
	
}

class Aluno
{
	int num;
	int notaNormal;
	int notaRec;
	int notaFinal;
}

