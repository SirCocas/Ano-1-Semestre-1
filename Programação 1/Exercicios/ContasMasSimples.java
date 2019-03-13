import java.util.Scanner;
public class ContasMasSimples
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	double x,conta;
	System.out.println("Insira valores reais. Quando acabar de inserir os valores, insira 0");
	x=1;
	conta=1;
	while (x!=0)
	{
		conta=conta*x;	
		x=sc.nextDouble();
	}
	System.out.printf("O resultado da multiplicacao dos numeros inseridos e "+conta);
  }
}

