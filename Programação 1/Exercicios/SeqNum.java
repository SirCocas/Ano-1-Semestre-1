import java.util.Scanner;
public class SeqNum 
{
	public static void main (String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int N;
		int [] seq;
		System.out.print("Por favor insira um valor inteiro:");
		N=sc.nextInt();
		while (N<=0) 
		{
			System.out.print("Inseriu um valor inválido, por favor volte a inserir outro valor:");
			N=sc.nextInt();
		}
		seq= new int [N];
		for (int i=0; i<=(N-1); i++)
			{
				int c=i+1;
				System.out.printf("Insira o valor numero %d \n",c);
				seq[i]=sc.nextInt();
			}
		System.out.println("Impressao dos valores inseridos pela ordem contraria:");
		for (int a=N-1; a>=0; a--)
		{
			int f=a+1;
			System.out.println("seq["+f+"]="+seq[a]);
		}
	}
}
