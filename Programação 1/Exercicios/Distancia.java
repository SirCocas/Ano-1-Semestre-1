import java.util.Scanner;
import java.lang.Math;

public class Distancia
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    double x1,x2,y1,y2,dist;
    System.out.print("Insira a abcissa do primeiro ponto: ");
    x1=sc.nextDouble();
    System.out.print("Insira a ordenada do primeiro ponto: ");
    y1=sc.nextDouble();
    System.out.print("Insira a abcissa do segundo ponto: ");
    x2=sc.nextDouble();
    System.out.print("Insira a ordenada do segundo ponto: ");
    y2=sc.nextDouble();
    dist=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    System.out.printf("A distancia entre os dois pontos e ",dist);
  }
}
