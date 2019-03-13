import java.util.Scanner;

public class Celsius
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    double cel,fah;
    System.out.print("Insira uma temperatura qualquer em Celsius: ");
    cel=sc.nextDouble();
    fah=1.8*cel+32;
    System.out.printf("A temperatura que inseriu e, em Fahrenheit, %5.2f .",fah);
    }
}
