import java.util.Scanner;
import java.lang.Math;

// Complete o programa
public class DoStats {
  static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    // Cria um registo de estatisticas:
    Statistics xstat = new Statistics();
    xstat.num=0;
    xstat.sum=0;
    xstat.sum2=0;
    
    
    // Enquanto houver um valor para ler:
    while (sc.hasNextDouble()) {
      // Lê um valor:
      double x = sc.nextDouble();
      // Atualiza o registo de estatisticas:
      updateStats(xstat, x);
    }
    
    // Escreve resultados:
    System.out.printf("numero de valores = %d\n", xstat.num);
    System.out.printf("soma dos valores = %f\n", xstat.sum);
    System.out.printf("soma dos quadrados = %f\n", xstat.sum2);
    if (xstat.num > 0) {
      System.out.printf("min = %f\n", xstat.min);
      System.out.printf("max = %f\n", xstat.max);
      System.out.printf("média = %f\n", mean(xstat));
      System.out.printf("variancia = %f\n", variance(xstat));
    } else {
      System.out.printf("Lista vazia!");
    }
  }
  public static Statistics updateStats(Statistics xtats, double a)
  {
	  if (a>=xtats.max)
		xtats.max=a;
	  if (a<=xtats.min)
		xtats.min=a;
	  xtats.num++;
	  xtats.sum=xtats.sum+a;
	  xtats.sum2=xtats.sum2+(a*a);
	  return xtats;
  }
  public static double mean(Statistics blep)
  {
	  double media=blep.sum/blep.num;
	  return media;
  }
  public static double variance(Statistics HelpMe)
  {
	 double var; 
	 var = HelpMe.sum2/((double)HelpMe.num-mean(HelpMe)*mean(HelpMe));
	 var=Math.sqrt(var);
	 return var;
  }

  // Definir funções updateStats, mean e variance!
  
}
class Statistics
{
	double max,min,sum,sum2;
	int num;
}

// Definir classe Statistics
