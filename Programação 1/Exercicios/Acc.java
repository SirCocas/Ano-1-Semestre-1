import java.util.Scanner;
public class Acc
{
  static final Scanner kb = new Scanner(System.in);
  public static void main(String[] args) 
  {
	String frase = new String();
	frase="nao nulo";
	boolean leitura=true;
	while (leitura)
	{
		System.out.print("Insira uma frase para ser acronizada:");
		frase=kb.nextLine();
		if (frase.length()==0)
		{
			leitura=false;
			System.out.println("O programa vai fechar.");
	    }
	    else
	    {
			if (acronimo(frase).length()!=0)
			{
				System.out.println("Acronimo:"+acronimo(frase));
			}
			else
			{
			System.out.println("Para a frase ser acronizada e necessario que haja maiusculas");
			}
		}	
	}
  }
  public static String acronimo(String sentence)
  {
	  String acronimo=new String();
	  for (int i=0;i<sentence.length();i++)
	  {
		  char caracter=sentence.charAt(i);
		  if (Character.isUpperCase(caracter))
		  {
			  acronimo=acronimo+caracter;
	      }
	 }
	 return acronimo;
  }
}
