import java.util.Scanner;
public class Contas
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	double x,a,menor,maior,conta;
	int cont=1;
	System.out.println("Insira valores reais. Quando acabar de inserir os valores, insira o primeiro valor");
	a=sc.nextDouble();
	x=0;
	maior=a;
	menor=a;
	conta=a;
	while (x!=a)
	{
		x=sc.nextDouble();
		if (maior<x)
			maior=x;
		if (menor>x)
			menor=x;
		conta=conta+x;	
		cont++;
	}
	conta=conta-a;
	cont=cont-1;
	conta=conta/cont;
	System.out.printf("O maior numero inserido e %.2f, o menor numero inserido e %.2f e a media dos valores inseridos e %.2f",maior,menor,conta);
  }
}
