import java.util.Scanner;
public class Matricula
{
  static final Scanner kb = new Scanner(System.in);
  public static void main(String[] args) 
  {
	  String matricula = new String();
	  System.out.print("Insira uma matricula:");
	  matricula=kb.nextLine();
	  if (MatVal(matricula))
	  {
		System.out.print("Matricula valida");
	}
	  else 
	  {
		System.out.print("Matricula invalida");
	}
  }
  public static boolean MatVal(String frase)
  {
	boolean mat;
	String matricula=new String();
	for (int i=0 ; i<frase.length(); i++)
	{
		if (Character.isUpperCase(frase.charAt(i)))
		{
			matricula=matricula+"A";
		}
		else if (Character.isDigit(frase.charAt(i)))
		{
			matricula=matricula+"0";
		}
		else 
		{
			matricula=matricula+frase.charAt(i);
		}
	}
	if (matricula.equals("AA-00-00") || matricula.equals("00-AA-00") || matricula.equals("00-00-AA"))   //não se compara string com == porque estamos a comparar posições de memória	
	{
		mat=true;
	}
	else
	{ 
		mat=false;
	}
	return mat;
  }
}
