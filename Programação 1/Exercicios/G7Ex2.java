import java.util.Scanner;
import java.io.*;
public class G7Ex2
{
  public static void main(String[] args) throws IOException
  {
	Scanner sc = new Scanner(System.in);
	int contador=0;
	int [] arr= ler(args[0]);
	for (int i=0; i<arr.length; i++)
	{
		if (arr[i]>=0)
			contador++;
		else 
			break;
	}
	System.out.println("O utilizador inseriu "+contador+" números não negativos.");
  }
  public static int [] ler(String nome) throws IOException
  {
	  Scanner sc = new Scanner(System.in);
	  int contador=0;
	  File ficheiro = new File(nome);
	  Scanner scf =  new Scanner(ficheiro);
	  while (scf.hasNextInt())
	  {
		contador++;
		scf.nextInt();
	}
		scf.close();
		int [] arr = new int [contador];
		scf=new Scanner(new File (nome));
        for(int i = 0 ; i < contador ; i++) 
        {
			int s = scf.nextInt();
			arr[i] = s;
        }
        scf.close();
        return arr;
		
	  
	}
}
