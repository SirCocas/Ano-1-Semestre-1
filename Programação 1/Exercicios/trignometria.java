import java.util.Scanner;
import java.lang.Math;

public class trignometria
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    double cat1,cat2,hip, ang,arc; 
    System.out.print("Insira o comprimento do primeiro cateto: ");
    cat1=sc.nextDouble();
    System.out.print("Insira o comprimento do segundo cateto: ");
    cat2=sc.nextDouble(); 
    hip=Math.sqrt(Math.pow(cat1,2)+Math.pow(cat2,2));
    arc=(cat2/hip);
    ang=Math.asin(arc);
    ang=Math.toDegrees(ang);
    System.out.printf("Pelos catetos inseridos, temos que a hipotenusa do triangulo sera %.1f e o angulo entre o primeiro cateto e a hipotenusa sera %.1f",hip,ang);       
  }
}
