import java.util.Scanner;

public class Tempo
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    double tempo,ss,mm,hh;
    System.out.print("Insira tempo em segundos: ");
    tempo=sc.nextDouble();
    ss=tempo%60;
    mm=ss/60;
    hh=tempo/3600;
    System.out.printf("O tempo inserido é, em formato hh,mm,ss : %.0f : %.0f  : %.0f", hh,mm,ss);
  }
}
