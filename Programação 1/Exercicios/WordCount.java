import java.util.Scanner;
public class WordCount
{
  static final Scanner kb = new Scanner(System.in);
  public static void main(String[] args) 
  {

    int wordCount = 0;

    boolean word = false;
    System.out.println("Insira uma frase:");
    String s=kb.nextLine();
    int endOfLine = s.length() - 1;

    for (int i = 0; i < s.length(); i++) 
    {
        if (Character.isLetter(s.charAt(i)) && i != endOfLine) 
        {
            word = true;
        } 
        else if (!Character.isLetter(s.charAt(i)) && word) 
        {
            wordCount++;
            word = false;
        } 
        else if (Character.isLetter(s.charAt(i)) && i == endOfLine) 
        {
            wordCount++;
        }
    }
    System.out.println("Numero de palavras:"+wordCount);
}
}

