import java.util.Scanner;
import java.lang.Math;
public class Pontos
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	long A,B,C,conta;
	for (A=1; A<=100; A++)
	{
		for (B=1; B<=100; B++)
		{
			for (C=1; C<=200;C++)
				{
				conta =(A*A)+(B*B);
				if ((conta==Math.pow(C,2) ) && (A<B))
					System.out.println(A+"  "+B+"  "+C);
				}
		}
	}
   }
}
