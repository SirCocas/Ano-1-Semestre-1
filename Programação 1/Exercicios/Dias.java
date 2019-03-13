import java.util.Scanner;
public class Dias
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	int mes, ano; 
	System.out.print("Insira o mes: ");
	mes=sc.nextInt();
	switch (mes)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8: 
		case 10:
		case 12:
			System.out.println("O mes inserido tem 31 dias.");
			break;
		case 4: 
		case 6: 
		case 9: 
		case 11:
			System.out.println("O mes inserido tem 30 dias.");
			break;
		case 2: 
			System.out.print("Insira o ano: ");
			ano=sc.nextInt();
			if ((ano%400==0) || ((ano%4==0)&&(ano%100 !=0)) )
				System.out.print("O mes inserido tem 29 dias.");
			else
				System.out.println("O mes inserido tem 28 dias.");
			break;
		default: 
			System.out.println("O mes inserido nao existe.");
		}
  }
}
