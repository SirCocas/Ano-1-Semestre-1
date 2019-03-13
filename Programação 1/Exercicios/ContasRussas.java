import java.util.Scanner;
public class ContasRussas
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	int num1,num2,conta;
	System.out.print("Insira o primeiro valor:");
	num1=sc.nextInt();
	System.out.print("Insira o segundo valor:");
	num2=sc.nextInt();
	conta=0;
	if (num1%2 == 1)
		conta=num2;
	while (num1!=1)
	{
			num1=(int)(num1/2);
			num2=num2*2;
			if (num1%2 == 1)
			conta=conta+num2;
			
	}
	System.out.println("O resultado da multiplicacao dos dois valores e "+conta);
  }
}
