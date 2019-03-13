import java.util.Scanner;
public class Ret
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	int com,larg;
	System.out.print("Insira o comprimento do retangulo: ");
	com=sc.nextInt();
	System.out.print("Insira a largura do retangulo: ");
	larg=sc.nextInt();
	for (int i=0; i<larg; i++)
		{
			for (int c=0; c<com; c++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
   }
}
