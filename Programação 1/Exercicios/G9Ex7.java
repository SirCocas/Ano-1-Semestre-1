/*
 * G9Ex7.java
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
import java.lang.String;
import java.util.Scanner;
public class G9Ex7 
{
	
	public static void main (String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Insira uma frase:");
			String frase = sc.nextLine();
			String trad= "";
			trad=""+Character.toUpperCase(frase.charAt(0));
			for (int i=1; i<frase.length(); i++)
			{
			if (frase.charAt(i-1)==' ')
					trad=trad + Character.toUpperCase(frase.charAt(i));
			else 
				trad=trad + frase.charAt(i);
			}
			System.out.println(trad);
			
	}
}

