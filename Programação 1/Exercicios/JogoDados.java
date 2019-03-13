import java.util.Scanner;
import java.lang.Math;
public class JogoDados
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	int secret =(int) (100.0*Math.random()) +1;
	int contador=1;
	int x;
	System.out.print("Por favor insira quando acha que o numero e: ");
	x=sc.nextInt();
	while (x!=secret)
	{
			if(x<secret) 
				System.out.println("Inseriu um valor mais baixo, volte a tentar.");
			else 
				System.out.println("Inseriu um valor mais alto, volte a tentar.");
			x=sc.nextInt();
			contador++;
	}
	System.out.print("Parabens, acertou no valor, sendo este "+secret+". Usou "+contador+" tentativas.");
  }
}
