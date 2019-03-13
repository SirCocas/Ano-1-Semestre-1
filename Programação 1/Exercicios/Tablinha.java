import java.util.Scanner;
public class Tablinha
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	for (int i=8 ;i>0; i--)
		{
		   for (char c='a'; c<='h';c++)
			System.out.printf("%c%d ",c,i);
	     System.out.println(" ");
	    }
  }
}
