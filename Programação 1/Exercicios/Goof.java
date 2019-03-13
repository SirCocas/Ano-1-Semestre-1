import java.util.Scanner;
import java.io.*;
public class Goof 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner kb = new Scanner(System.in);
        boolean menu=true;
        System.out.print("Ficheiro que pretende imprimir: ");
		String nameIn = kb.nextLine();
		File fin = new File(nameIn);
        while (menu)
        {
			if (!fin.exists()) {
				System.out.println("ERRO: ficheiro " + nameIn + " não existe!");
				System.out.print("Ficheiro que pretende imprimir: ");
				nameIn = kb.nextLine();
				fin = new File(nameIn);
			}
			else if (fin.isDirectory()) {
				System.out.println("ERRO: ficheiro " + nameIn + " is a directory!");
				System.out.print("Ficheiro que pretende imprimir: ");
				nameIn = kb.nextLine();
				fin = new File(nameIn);
			}
			else if (!fin.canRead()) {
				System.out.println("ERRO: ficheiro " + nameIn+ "não pode ser lido!");
				System.out.print("Ficheiro que pretende imprimir: ");
				nameIn = kb.nextLine();
				fin = new File(nameIn);
			}
			else 
				menu=false;
		} 
		Scanner scf = new Scanner(fin);
        int cont = 0;
        while(scf.hasNextLine()) {
            cont++;
            scf.nextLine();
        }
        String[] linhas = new String[cont];
        scf = new Scanner(new File(nameIn)); 
        for(int i = 0 ; i < cont ; i++) 
        {
            String s = scf.nextLine();
            linhas[i] = s;
		}
        scf.close();
        for(int i = 0 ; i < cont ; i++) {
            System.out.println(linhas[i]);
        }
    }
}
