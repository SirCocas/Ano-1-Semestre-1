import java.util.Scanner;
public class Turista
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	double d1,d2,d3,d4,total;
	System.out.print("Insira a quantia que gastou no primeiro dia de ferias: ");
	d1=sc.nextDouble();
	d2=d1+0.2*d1;
	d3=d2+0.2*d2;
	d4=d3+0.2*d3;
	total=d1+d2+d3+d4;
	System.out.println("Gastos:");
	System.out.printf("Dia 1 :%.2f €\n",d1);	
	System.out.printf("Dia 2 :%.2f €\n",d2);
	System.out.printf("Dia 3 :%.2f €\n",d3);
	System.out.printf("Dia 4 :%.2f €\n",d4);
	System.out.printf("Gastos totais:%.2f € \n",total);
  }
}
