/*
 * G9Ex8.java
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
public class G9Ex8 
{
	
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int b;
		System.out.println("Insira um valor que pretence calcular numa base diferente:");
		String num = sc.nextLine();
		do
		{
			System.out.println("Insira a base:");
			b=sc.nextInt();
		}
		while (!BaseValida(b,num));
		
	}
	public static boolean BaseValida(int base, String numero)
	{
		boolean valida=true;
		for (int i=0; i<numero.length(); i++)
		{
			int c = numero.charAt(i)+'0';
			if (base<=c)
			{
				valida=false;
				break;
			}
		}
		return valida;
	}
}

