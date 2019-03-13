/*
 * JAM, 12-nov-2018
 * Ficheiros de texto
 *      A classe File escreve sempre de novo por cima do ficheiro existente, destruindo-o!
 *      A classe FileWriter permite append/ acrescentar texto no fim do ficheiro
 *
 */
import java.util.Scanner;
import java.io.*;

public class Ficheiros {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);

        listaDir("."); // . diretorio atual

        System.out.print("Ficheiro de entrada: ");
        String nameIn = kb.nextLine();
        File fin = new File(nameIn);

        if (!fin.exists()) {
            System.out.println("ERRO: ficheiro " + nameIn + " não existe!");
            System.exit(2);
        }
        if (fin.isDirectory()) {
            System.out.println("ERRO: ficheiro " + nameIn + " is a directory!");
            System.exit(3);
        }
        if (!fin.canRead()) {
            System.out.println("ERRO: ficheiro " + nameIn+ "não pode ser lido!");
            System.exit(4);
        }

        System.out.println("Ficheiro válido!");


        System.out.print("Ficheiro de saida: ");
        String nameOut = kb.nextLine();

        File fout = new File(nameOut);
        PrintWriter pw = new PrintWriter(fout);
        // Em lugar da classe File pode usar-se a classe FileWriter
        //     que dá para abrir ficheiros em modo append.
        //~ PrintWriter pw = new PrintWriter(new FileWriter(nameOut, true)); // true, abre em modo append

        Scanner scf = new Scanner(fin);
        int cont = 0;
        // conta o numero de linhas do ficheiro
        while(scf.hasNextLine()) {
            cont++;
            scf.nextLine();
        }
        // cria array com tamanho do nº de linhas
        String[] linhas = new String[cont];

        scf.close(); // fecha ficheiro
        // abre para nova leitura e guarda as linhas no array linhas
        //~ scf = new Scanner(fin);

        scf = new Scanner(new File(nameIn)); //teste da classe FileReader
        for(int i = 0 ; i < cont ; i++) {
            String s = scf.nextLine();
            linhas[i] = s;
        }
        scf.close();
        // escreve as linhas no ficheiro de escrita
        for(int i = 0 ; i < cont ; i++) {
            pw.println(linhas[i]);
        }
        pw.printf("\n%10s \n%d\n", "Numero de linhas copiadas: ", cont); //teste do printf
        pw.close();
        // copiou os ficheiros


    }
// lista diretório
    public static void listaDir(String nomeDir) {
        String[] lista = new String[100];
        File fin1 = new File(nomeDir);
        lista = fin1.list();   // devolve array de strings com nomes ficheiros
        for (String n : lista) {
            File f = new File(n);
            System.out.printf("%-30s %5s\n", n, f.isDirectory()? "DIR":f.length());
        }
    }
}

