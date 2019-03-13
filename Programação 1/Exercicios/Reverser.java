import java.util.Scanner;
public class Reverser
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	int a;
	int reverse=0;
	System.out.print(" Por favor insira um valor decimal não negativo: ");
	a=sc.nextInt();
	while (a!=0)
	{
		reverse=reverse*10;
		reverse=reverse+a%10;
		a=a/10;
	}
	System.out.print("O numero ao contrario e "+reverse);
  }
}
