/*
 * G7Ex5.java
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
public class G7Ex5 
{
	
	public static void main (String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		File ficheiro = LerFicheiro();
		Scanner in = new Scanner(ficheiro);
		System.out.println("Insira o nome do ficheiro que deseja criar:");
		String NomeOut= sc.nextLine();
		NomeOut=NomeOut+".txt"; //para, por default, a cópia ser um .txt
		File ficheiro_out= new File (NomeOut);
		PrintWriter out = new PrintWriter (ficheiro_out);
		while (in.hasNext())
		{
			String temp=in.next();
			if(temp.length()>2){
				if((temp.charAt(0)=='/') && (temp.charAt(1)=='/')){
					if(in.hasNextLine()) 
						in.nextLine(); 				//Salta para a linha seguinte se detectar //
				}
				else out.println(temp);     //não há //, logo, dá print
			}
			else out.println(temp);
		}
		in.close();
		out.close();
		 
		
		
	}
	public static File LerFicheiro() throws IOException
	{
		Scanner puta= new Scanner(System.in);
		System.out.println("Insira o nome do ficheiro");
		String nome=puta.nextLine();
		File ficheiro=new File (nome);
		while ((!ficheiro.isFile()) || (ficheiro.isDirectory()) || (!ficheiro.canRead()))
		{
			System.out.println("Insira um nome valido");
			nome=puta.nextLine();
			ficheiro = new File (nome);
		}
		return ficheiro;
	}
}

