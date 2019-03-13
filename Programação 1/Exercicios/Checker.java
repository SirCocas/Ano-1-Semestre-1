import java.util.Scanner;
public class Checker
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	int num=0;
	int cont=-1;
	do
	{
		System.out.print("Insira um número inteiro: ");
		num=sc.nextInt();
		cont++;
	}
	while (num>=0);
	System.out.println("O utilizador inseriu "+cont+" números não negativos.");
  }
}
