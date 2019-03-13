/*
 * G12Ex1.java
 * 
 * Copyright 2018 sofas <sofas@LAPTOP-TK50VHB9>
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

import java.util.*;
import java.io.*;
public class G12Ex1 {
	
	public static void main (String[] args) throws IOException
	{
		Scanner sc = new Scanner (System.in);
		int op=0;
		int n=0;
		Meteo [] valores = new Meteo [30];
		valores = inicializar(valores);
		do
		{
			System.out.println("Estacao meteorologica:");
			System.out.println(" 1 - Ler ficheiro de dados");
			System.out.println(" 2 - Acrescentar medida");
			System.out.println(" 3 - Listar valores de temperatura e humidade");
			System.out.println(" 4 - Listar medidas ordenadas por valor de temperatura");
			System.out.println(" 5 - Listar medidas ordenadas por valor de humidade");
			System.out.println(" 6 - Calcular valores medios de temperatura e humidade");
			System.out.println(" 7 - Calcular valores maximos e minimos de temperatura e humidade");
			System.out.println(" 8 - Calcular o histograma das temperaturas e humidade ");
			System.out.println(" 9 - Terminar o programa");
			op = sc.nextInt();
			switch (op)
			{
				case 1:
				{
					String nome = " ";
					File ficheiro = new File (nome);
					do
					{
						System.out.println("Insira o nome do ficheiro:");
						nome = sc.nextLine();
						ficheiro = new File (nome);
					}
					while (! ficheiro.canRead());
					
					valores = lerFich(valores, nome, n);
					n=n+numeroLinhas(nome,n);
					n=ValValid(valores,n);
					break;
				}
				case 2:
				{
					System.out.println("Insira o numero de valores que pretende inserir");
					int  num = sc.nextInt();
					valores = insert(valores,num,n);
					if (n+num<31)
						n=n+num;
					else 
						n=31;
					break;
				}
				case 3:
				{
					Print(valores, n);
					break;
				}
				case 4:
				{
					Print(OrdemTemp(valores,n),n);
					break;
				}
				case 5:
				{
					Print (OrdemHum(valores,n),n);
					break;
				}
				case 6:
				{
					System.out.println("Media da temperatura: "+MediaT(valores, n));
					System.out.println("Media da humidade: "+MediaH(valores, n));
					break;
				}
				case 7:
				{
					System.out.printf("Valor maximo da temperatura: %d\nValor maximo da humidade: %d\nValor minimo da temperatura: %d\n Valor minimo da humidade: %d\n",MaxT(valores,n),MaxH(valores,n),MinT(valores,n),MinH(valores,n));
					break;
				}
				case 8:
				{
					HistoTemp(valores,n);
					
					System.out.println("");
					HistoHum(valores,n);
					break;
				}
				case 9: 
				break;
			}
		}
		while (op!=9);
		
	}
	
	
	public static Meteo [] insert (Meteo [] arr, int n, int N)
	{
		Scanner sc = new Scanner (System.in);
		for (int i=N; i<N+n; i++)
			{
				do
				{
					System.out.println("Insira a humidade");
					arr[i].hum= sc.nextInt();
					System.out.println("Insira a temperatura");
					arr[i].temp= sc.nextInt();
				}
				while ((arr[i].temp<-10)||(arr[i].temp>40) || (arr[i].hum<0)|| (arr[i].hum>100));
			}
		return arr;
	}
	
	
	public static int numeroLinhas (String nome, int num) throws IOException
	{
		int n=0;
		File ficheiro = new File (nome);
		Scanner fiche= new Scanner (ficheiro);
		while (fiche.hasNextInt())
		{
			fiche.nextInt();
			if (fiche.hasNextInt())        
			{
				n++;
				fiche.nextInt();
			}
		}
		fiche.close();
		if (num+n<=31)
			return n;
		else 
			return (31-num);
	} 
	
	
	public static Meteo [] inicializar ( Meteo [] arr)
	{
		for (int i=0; i<30; i++)
		{
			arr[i]= new Meteo();
			arr[i].hum=0;
			arr[i].temp=0;
		}
		return arr;
	}
	
	
	
	public static Meteo [] lerFich(Meteo [] arr, String nome, int n) throws IOException
	{
		int i=0;
		File ficheiro = new File (nome);
		Scanner fich = new Scanner (ficheiro);
		while (fich.hasNextInt() && ((i+n)<31))
		{
			arr[i+n].temp=fich.nextInt();     //adiciona-se o n para não haver overlap de valores (caso se leia de 2 ficheiros ou se insira valores manualmente primeiro)
			if (fich.hasNextInt())
				arr[i+n].hum = fich.nextInt();
			i++;
		}
		fich.close();
		return arr;
	}
	
	
	
	public static Meteo [] valida(Meteo [] arr, int n)
	{
		int troca=0;
		for (int i=0; i<n; i++)
		{
			if ((arr[i].temp<-10)||(arr[i].temp>40) || (arr[i].hum<0)|| (arr[i].hum>100))
			{
				for (int c=i; c<n; c++)
				{
					arr[i].temp=arr[i++].temp;
					arr[i].hum=arr[i++].hum;
				}
				troca++;
			}
		}
		return arr;
	}
	
	
	
	public static int ValValid (Meteo [] arr, int n)
	{
		int troca = 0;
		for (int i=0; i<n; i++)
		{
			if ((arr[i].temp<-10)||(arr[i].temp>40) || (arr[i].hum<0)|| (arr[i].hum>100))
				troca++;
		}
		return (n-troca);
	}
	
	public static void Print (Meteo [] arr, int n)
	{
		for (int i=0; i<n; i++)
		{
			System.out.printf("Temperatura: %d \nHumidade: %d \n", arr[i].temp, arr[i].hum);
		}
	}
	
	
	public static Meteo [] OrdemTemp (Meteo[] arr, int n)
	{
		for (int i=0; i<(n-1); i++)
		{
			for (int c=i+1; c<n; c++)
			{
				if (arr[i].temp>arr[c].temp)
				{
					int placeholder= arr[c].temp;
					arr[c].temp=arr[i].temp;
					arr[i].temp=placeholder;
					placeholder = arr[c].hum;
					arr[c].hum=arr[i].hum;
					arr[i].hum=placeholder;
				}
			}
		}
	 return arr;			
	}
	
	
	public static Meteo [] OrdemHum (Meteo[] arr, int n)
	{
		for (int i=0; i<(n-1); i++)
		{
			for (int c=i+1; c<n; c++)
			{
				if (arr[i].hum<arr[c].hum)
				{
					int placeholder= arr[c].temp;
					arr[c].temp=arr[i].temp;
					arr[i].temp=placeholder;
					placeholder = arr[c].hum;
					arr[c].hum=arr[i].hum;
					arr[i].hum=placeholder;
				}
			}
		}
	 return arr;			
	}
	
	public static double MediaT(Meteo[] arr, int n)
	{
		double conta=0;
		for (int i=0; i<n; i++)
		{
			conta=conta+arr[i].temp;
		}
		conta=conta/n;
		return conta;
	}
	
	
	public static double MediaH(Meteo[] arr, int n)
	{
		double conta=0;
		for (int i=0; i<n; i++)
		{
			conta=conta+arr[i].hum;
		}
		conta=conta/n;
		return conta;
	}
	
	public static int MaxT(Meteo[] arr, int n)
	{
		int max=arr[0].temp;
		for (int i=1; i<n; i++)
		{
			if (arr[i].temp>max)
				max= arr[i].temp;
		}
		return max;
	}
	
	public static int MaxH(Meteo[] arr, int n)
	{
		int max=arr[0].hum;
		for (int i=1; i<n; i++)
		{
			if (arr[i].hum>max)
				max= arr[i].hum;
		}
		return max;
	}
	
	public static int MinT(Meteo[] arr, int n)
	{
		int min=arr[0].temp;
		for (int i=1; i<n; i++)
		{
			if (arr[i].temp<min)
				min= arr[i].temp;
		}
		return min;
	}
	
	public static int MinH(Meteo[] arr, int n)
	{
		int min=arr[0].hum;
		for (int i=1; i<n; i++)
		{
			if (arr[i].hum<min)
				min= arr[i].hum;
		}
		return min;
	}
	
	public static void HistoTemp(Meteo[] arr, int n)
	{
		int [] histograma = new int [51];
		for (int i=0; i<n; i++)
		{
			histograma[arr[i].temp+10]++;
		}
		System.out.println("Histograma da Temperatura");
		System.out.println("__________________________");
		for (int i=0; i<51; i++)
		{
			System.out.print(i-10+"|");
			for (int c=0; c<histograma[i];c++)
				System.out.print("*");
			System.out.printf("\n");
		}
	}
	
	public static void HistoHum(Meteo[]arr, int n)
	{
		int [] histograma = new int [101];
		for (int i=0; i<n; i++)
		{
			histograma[arr[i].hum]++;
			
		}
		System.out.println("Histograma da Humidade");
		System.out.println("_______________________");
		for (int i=0; i<101; i++)
		{
			System.out.print(i+"|");
			for (int c=0; c<histograma[i];c++)
				System.out.print("*");
			System.out.printf("\n");
			
		}
	}
	
}


class Meteo 
{
	int hum;
	int temp;
}

