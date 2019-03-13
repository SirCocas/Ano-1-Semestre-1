import java.util.Scanner;
public class Programa 
{
	public static void main (String args[])
	{
		int comp,nota;
		int[]notas;
		Scanner sc=new Scanner(System.in);
		System.out.print("Insira o numero de notas que vai introduzir: ");
		comp=sc.nextInt();
		while (comp<1)
		{
			System.out.print("O valor inserido nao e valido, por favor volte a inserir: ");
			comp=sc.nextInt();
		}
		int [] notas = new int [comp]
		for (int i=1; i<=comp; i++)
		{
			System.out.print("Insira a nota numero "+i+":");
			nota=sc.nextInt();
			switch(nota)
			{
				case 1:
				{
					notas[1]=notas[1]+ 1;
					break;
				}
				case 2:
				{
					notas[2]=notas[2]+1;
					break;
				}	
				case 3:
				{
					notas[3]=notas[3]+1;
					break;
				}
				case 4:
				{
					notas[4]=notas[4]+1;
					break;
				}
				case 5:
				{
					notas[5]=notas[5]+1;
					break;
				}
				case 6: {
					notas[6]=notas[6]+1;
					break;
				}
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
				default: 
				{System.out.print("O valor inserido nao e valido");
				 notas[i]=sc.nextInt();
				 break;
				}
				
			}
		}
	}
}
