/*
 * G9Ex6.java
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

import java.util.Scanner;
public class G9Ex6 
{
	
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira uma frase: ");
		String frase = sc.nextLine();
		String trad="";
		for (int i=0; i<frase.length(); i++)
		{
			if (frase.charAt(i)=='l')
				trad=trad+'u';
			else if (frase.charAt(i)=='L')
				trad=trad+'U';
			else if ((frase.charAt(i)!='r')&&(frase.charAt(i)!='R'))
				   trad=trad+frase.charAt(i); 
				
		}
		System.out.println(trad);
		
	}
}

