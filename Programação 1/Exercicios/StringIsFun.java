import java.util.Scanner;
public class StringIsFun
{
  static final Scanner kb = new Scanner(System.in);
  public static void main(String[] args) 
  {
	  String frase = new String();
	  int maiusc=0;
	  int minusc=0;
	  int num=0;
	  int vogal=0;
	  int consoante=0;
	  System.out.println("Analise de uma frase:");
	  System.out.print("Frase de entrada ->");
	  frase=kb.nextLine();
	  for(int i = 0 ; i < frase.length() ; i++) 
	  {
            char letra = frase.charAt(i);

            if(Character.isLowerCase(letra)) 
            {
                minusc++;
                if (isVowel(letra))
                {
					vogal++;
				}
				else
				{
					consoante++;
				}
                
            } else if(Character.isUpperCase(letra)) 
            {
                maiusc++;
                if (isVowel(letra))
                {
					vogal++;
				}
				else
				{
					consoante++;
				}
                
            }
            else if (Character.isDigit(letra))
            {
				num++;
			}
	  
	} 
	System.out.println("Numero de caracteres maiusculos:"+maiusc);
	System.out.println("Numero de caracteres minusculos:"+minusc);
	System.out.println("Numero de caracteres numericos:"+num);
	System.out.println("Numero de vogais:"+vogal);
	System.out.println("Numero de consoantes:"+consoante);
}
public static boolean isVowel(char c)
{
    if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||     c=='u' || c=='U')
    {    
        return true;
    }    
    else
    {
        return false;
    }    
}
}
