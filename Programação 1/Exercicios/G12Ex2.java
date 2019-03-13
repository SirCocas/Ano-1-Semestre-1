/*
 * G12Ex2.java
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

import java.util.Scanner;
import java.lang.String;
public class G12Ex2 
{
	
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int op=0;
		Piloto [] arr = new Piloto [10];
		arr = inicializar(arr);
		int n=0;
		do
		{
			System.out.println("Gestao de uma prova automovel:");
			System.out.println("1- Inserir informacao sobre os pilotos");
			System.out.println("2- Listar pilotos ordenados pelo numero da viatura");
			System.out.println("3- Alterar informacao de um piloto");
			System.out.println("4- Remover piloto com base no numero da viatura");
			System.out.println("5- Listar pilotos ordenados pelo nome");
			System.out.println("6- Remover piloto(s) com base no nome");
			System.out.println("7- Validar matriculas");
			System.out.println("8- Terminar o programa");
			op=sc.nextInt();
			switch (op)
			{
				case 1:
				{
					arr= insert(arr);
					break;
				}
				case 2:
				{
					Print(arr);
					break;
				}
				case 3:
				{
					arr=mudar(arr);
					break;
				}
				case 4:
				{
					arr = delete(arr);
					break;
				}
				case 5:
				{
					Printar(ordena(arr));
					break;
				}
				case 6:
				{
					DeleteSeveral(arr);
					break;
				}
				case 7:
				{
					ValidacaoMatriculas(arr);
					break;
				}
				case 8:
					break;
				default:
				{
					System.out.println("O valor inserido nao e valido.");
					break;
				}
			}
		}
		while (op!=8);
	}
	
	
	public static Piloto [] inicializar (Piloto [] arr)
	{
		for (int i=0; i<10; i++)
		{
			arr[i]=new Piloto();
			arr[i].num=0;
			arr[i].nome="";
			arr[i].matricula="";
		}
		return arr;
	}
	
	
	public static Piloto [] insert (Piloto [] arr)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira os dados pedidos, dando uma resposta nula no nome do piloto quando nao desejar inserir mais nada");
		for (int i=0; i<10; i++)
		{
			System.out.println("Insira o nome do piloto:");
			arr[i].nome=sc.nextLine();
			if (arr[i].nome.isEmpty())
				break;
			else 
			{
				System.out.println("Insira a matricula:");
				arr[i].matricula=sc.nextLine();
				arr[i].num=i+1;
			}
		}
		return arr;
		
	}
	
	
	
	public static void Print (Piloto [] arr)
	{
		for (int i=9; i>=0; i--)  //porque os numeros de viatura sao colocados de modo a serem sempre crescentes
		{
			while (arr[i].num !=0)
			{
				System.out.println("Numero da viatura: "+arr[i].num);
				System.out.println("Nome do piloto: "+arr[i].nome);
				System.out.println("Matricula da viatura: "+arr[i].matricula);
				break;
			}
		}
	}
	
	public static Piloto [] mudar (Piloto [] arr)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira o numero da viatura :");
		int num = sc.nextInt();
		while (num<=0 || arr[num-1].num ==0)
		{
			System.out.println("Inseriu um valor invalido ou o numero nao tem viatura associada, por favor volte a inserir:");
			num=sc.nextInt(); 
		}
		arr[num-1].matricula=null;
		System.out.println("Por favor insira a nova matricula:");
		arr[num-1].matricula=sc.nextLine();
		if (arr[num-1].matricula.isEmpty())
		{
			System.out.println("Por favor insira a nova matricula:");
			arr[num-1].matricula=sc.nextLine();
		}
		System.out.println("Por favor insira o novo nome:");
		arr[num-1].nome= sc.nextLine();
		return arr;
	}
	
	
	public static Piloto [] delete (Piloto [] arr)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira o numero da viatura cujo piloto pretende remover:");
		int num = sc.nextInt();
		while (num<=0 || num>=12|| arr[num-1].num ==0)
		{
			System.out.println("O valor inserido nao e valido, por favor volte a inserir:");
			num=sc.nextInt();
		}
		for (int i=num-1; i<9; i++)
		{
			arr[i].num=arr[i+1].num;
			arr[i].matricula=arr[i+1].matricula;
			arr[i].nome=arr[i+1].nome;
		} 
		return arr;
	}
	
	
	public static Piloto [] ordena(Piloto [] arr)
	{
		for (int a=0; a<9; a++)
			{
					for (int b=a+1; b<10; b++)
					{
						if (arr[a].nome.compareTo(arr[b].nome) > 0 )   //resolver isto!
						{
							String temp = arr[a].nome;
							arr[a].nome= arr[b].nome;
							arr[b].nome= temp;
							temp= arr[a].matricula;
							arr[a].matricula = arr[b].matricula;
							arr[b].matricula = temp;
							int Temp = arr[a].num;
							arr[a].num = arr[b].num;
							arr[b].num=Temp;
							
						}
					}
			}
		return arr;
	}
	
	
	public static void Printar (Piloto [] arr)
	{
		for (int i=0; i<10; i++)
		{
			while (arr[i].num !=0)
			{
				System.out.println("Numero da viatura: "+arr[i].num);
				System.out.println("Nome do piloto: "+arr[i].nome);
				System.out.println("Matricula da viatura: "+arr[i].matricula);
				break;
			}
		}
		
	}
	
	
	public static void ValidacaoMatriculas (Piloto [] arr)  //algo de errado nao esta certo aqui
	{
		Scanner sc = new Scanner (System.in);
		for (int i=0; i<10; i++)
		{
			if (arr[i].num ==0)
				break;
			while (!(MatVal(arr[i].matricula)))
			{
				System.out.println("Por favor insira uma nova matricula, a atual ("+arr[i].matricula+") nao e valida:");
				arr[i].matricula=sc.nextLine();
			}
		}
	}
	
	
	public static boolean MatVal (String mat)   //algo de errado nao esta certo aqui
	{
		String frase ="";
		boolean valida=false;
		for (int i=0; i<mat.length(); i++)
		{
			if (Character.isDigit(mat.charAt(i)))
				frase=frase+'0';
			else if (Character.isLetter(mat.charAt(i)))
				frase =frase+'A';
			else 
				frase= frase + mat.charAt(i);
		}
		if (frase.equals("AA-00-00") || frase.equals("00-00-AA") || frase.equals("00-AA-00"))
			valida=true;
		return valida;
	}
	

	public static void DeleteSeveral (Piloto [] arr)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira o nome, parcial ou completo, que pretende eliminar");
		String nome= sc.nextLine();
		boolean [] verifica=new boolean [10];
		for (int i=0; i<10; i++)
			verifica[i]=true;
		while (nome.isEmpty()) 
			nome= sc.nextLine();
		
		for  (int a =0; a<10; a++)
		{ 
			if (arr[a].num == 0)
				break;
			for (int i=0; i<nome.length(); i++)
			{
				if (!(arr[a].nome.charAt(i)== nome.charAt(i)))
				{
					verifica[a]=false;
					break;
				}
			}
		}
		for (int i=0; i<10; i++)
		{
			if (arr[i].num == 0)
				break; 
			if (verifica[i])
			{
				System.out.println("Pretende eliminar o condutor cujo nome e "+arr[i].nome+"? Insira 1 se sim");
				int op=sc.nextInt();
				if (op==1)
				{
					for (int c=((arr[i].num)-1); c<9; c++)
					{
						arr[c].num=arr[c+1].num;
						arr[c].matricula=arr[c+1].matricula;
						arr[c].nome=arr[c+1].nome;
					} 
				}
			}
		}
	}
}

class Piloto
{
	int num;
	String nome;
	String matricula;
}
