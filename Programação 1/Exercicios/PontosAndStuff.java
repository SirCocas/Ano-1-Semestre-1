import java.util.Scanner;
import java.lang.Math;

public class PontosAndStuff
{
  static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) 
  {
	  double dist=0;
	  double distmax=0;
	  boolean leitura=true;
	  Ponto PontoMax = new Ponto();
	  Ponto point;
	  do
	  {
		  point =lerPonto();
		  dist=dist+Distancia(point);
		  if (Distancia(point)>=distmax)
		  {
			  distmax=Distancia(point);
			  PontoMax=point;
		}
	  }
	  while ((point.x!=0) && (point.y!=0));
	  System.out.println("Maior distancia: "+distmax);
	  PrintPonto(PontoMax);	  
  }
  public static Ponto lerPonto()
  {
	Ponto heck = new Ponto();
	System.out.print("Insira a abcissa do ponto:");
	heck.x=sc.nextDouble();
	System.out.print("Insira a ordenada do ponto:");
	heck.y=sc.nextDouble();
	return heck;
  }
  public static void PrintPonto(Ponto ponto)
  {
	  System.out.printf("(%3.1f , %3.1f)",ponto.x,ponto.y); 
  }
  public static double Distancia(Ponto A)
  {
	  double dist = Math.sqrt(A.x*A.x+A.y*A.y);
	  return dist;
  }
}
class Ponto
{
	double x,y;
}
  
