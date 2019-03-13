import java.util.Scanner; 				//SOFIA DESISTE FAZ UM SWITCH
import java.lang.String;
public class G6E6 
{
	static final Scanner kb = new Scanner(System.in);
	
	public static void main (String[] args) 
	{
		System.out.print("Insira uma frase:");
		String frase= kb.nextLine();
		boolean histograma[] = new boolean [127];  //porque há 127 coisos na ASCII table
		System.out.println("Lista de letras utilizadas:");
		
		for (int i=0;i<frase.length() ;i++)
		{
			int num = (int)frase.charAt(i);
			if(!histograma[(int)frase.charAt(i)])
				System.out.println(frase.charAt(i));
			histograma[(int)frase.charAt(i)] = true;
		}
		
			
	}
}

