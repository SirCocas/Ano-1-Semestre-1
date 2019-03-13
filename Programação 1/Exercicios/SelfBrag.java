import java.util.Scanner;
public class SelfBrag
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	int vezes;
	String frase;
	System.out.print("Insira a frase que pretende escrever: "); 
	frase=sc.nextLine();    
	System.out.print("Insira o numero de vezes que quer escrever a sua mensagem: ");
	vezes=sc.nextInt();
	for (int i = 1 ; i <= vezes ;i++)
		{
			System.out.println(frase);
		}
  }
}
