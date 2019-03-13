import java.util.Scanner;

public class Dinheiro
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    double euro,dolar;
    System.out.print("Insira um valor em dólares americanos: ");
    dolar=sc.nextDouble();
    euro=0.86785*dolar ;
    System.out.printf("O valor inserido corresponde a %7.2f euros",euro); 
  }
}
