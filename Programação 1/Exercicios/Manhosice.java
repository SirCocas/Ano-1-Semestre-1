import java.util.Scanner;
public class Manhosice 
{
	public static void main (String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int num [] = new int [100];
		int contador1=0;
		int contador2=0;
		int N;
		System.out.print("Insira o numero que deseja contar as vezes que introduz: ");
		N=sc.nextInt();
		System.out.println();
		do 
		{
			System.out.printf("Insira o valor numero %d :",contador1+1);
			num[contador1]=sc.nextInt();
			if (num[contador1]==N)
				contador2=contador2+1;
			if (num[contador1]<0)
				break;
			contador1 ++;
		} while (contador1<99);
		System.out.println("O numero "+N+" foi inserido "+contador2+" vezes.");
	}
}
