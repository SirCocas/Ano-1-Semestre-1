import java.util.Scanner;
public class MDC
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	int x,y,maior,menor;
	System.out.print("Insira um valor positivo ");
	x=sc.nextInt();
	while (x<=0)
	{
		System.out.println("O valor inserido nao e valido, insira outro: ");
    }
  }
}
