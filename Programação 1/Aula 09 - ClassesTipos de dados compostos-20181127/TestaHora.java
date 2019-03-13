import java.util.Scanner;

public class TestaHora {
  static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    Hora inicio;  // tem de definir o novo tipo Hora!
    Hora fim;
    
    inicio = new Hora();
    inicio.h = 9;
    inicio.m = 23;
    inicio.s = 5;
    
    System.out.print("Comecou as ");
    printHora(inicio);  // crie esta função!
    System.out.println(".");
    System.out.println("Quando termina?");
    fim = lerHora();  // crie esta função!
    System.out.print("Início: ");
    printHora(inicio);
    System.out.print(" Fim: ");
    printHora(fim);
  }
	public static void printHora(Hora mensagem)
	{	
		System.out.println(mensagem.h+":"+mensagem.m+":"+mensagem.s);
	}
	public static Hora lerHora()
	{
		Hora fml = new Hora();
		System.out.print("Hora?");
		fml.h=sc.nextInt();
		while ((fml.h<0)||(fml.h>23))
		{
			System.out.print("A hora inserida nao e valida, por favor insira um valor valido: ");
			fml.h=sc.nextInt();
		}
		System.out.print("Minutos?");
		fml.m=sc.nextInt();
		while ((fml.m<0)||(fml.m>59))
		{
			System.out.print("Os minutos inseridos nao sao validos, por favor insira um valor valido: ");
			fml.m=sc.nextInt();
		}
		System.out.print("Segundos?");
		fml.s=sc.nextInt();
		while ((fml.s<0)||(fml.s>59))
		{
			System.out.print("Os segundos inseridos nao sao validos, por favor insira um valor valido: ");
			fml.s=sc.nextInt();
		}
		return fml;
	}  
  
}
class Hora
  {
	  int h,m,s;
  }

/**
EXEMPLO do pretendido:
$ java TestaHora
Começou às 09:23:05.
Quando termina?
horas? 11
minutos? 72
minutos? 7
segundos? 2
Início: 09:23:05 Fim: 11:07:02.
**/
