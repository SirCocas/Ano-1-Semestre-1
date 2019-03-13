import java.util.Scanner;
public class Tabuada
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	int num,conta;
	System.out.print("Insira o numero cuja tabuada deseja saber: ");
	num=sc.nextInt();
	System.out.printf("Tabuada dos %d \n",num);
	for (int i=1; i<=10; i++)
	{
		conta=num*i;
		System.out.println(num+" x "+i+" = "+conta);
	}
  }
}
