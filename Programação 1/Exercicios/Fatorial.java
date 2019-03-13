import java.util.Scanner;
public class Fatorial
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	long num,fact;
	System.out.print("Insira o numero de fatoriais que pretende calcular: ");
	num=sc.nextInt();
	if (num>10)
		System.out.print("Inseriu um valor demasiado alto.");
	else
	{
	for (int i=1;i<=num;i++)
	{
		fact=1;
		for (int c=1;c<=i;c++)
		{
			fact=fact*c;
	    }
	    System.out.print(i+"! = "+fact+ "\n");
	}		
  }
 }
}
