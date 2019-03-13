import java.util.Scanner;
public class ArrayComRado 
{
	public static void main (String args[])
	{
		int length= (int)(Math.random()*9 +1);
		int min, max;
		int[] arr = new int[length];
		int[] hist = new int[7];
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor minimo: ");
		min=sc.nextInt();
		System.out.print("Insira o valor maximo: ");
		max=sc.nextInt();
		while (max<=min)
		{
			System.out.print("Reinsira o valor minimo: ");
			min=sc.nextInt();
			System.out.print("Reinsira o valor maximo: ");
			max=sc.nextInt();
	    }
		for (int i=0; i<=length-1; i++)     //bloco que gera os elementos do array
			arr[i]=(int)(min+Math.random()*(max-min+1));    
		/**for (int i=0; i<=length-1; i++)     //print
			System.out.println(arr[i]);    **/
		for (int a=0; a<=length-1; a++)
			hist[arr[a]]=hist[arr[a]]+1;
		for (int b=min; b<=max; b++)
			System.out.println("O valor "+b+" surge "+hist[b]+"vezes.");
	}
}
