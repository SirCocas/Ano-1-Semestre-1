/*
 *  JAM, 19-nov-2018
 *
 * Ler/gerar notas de 0 a 20  das várias avaliações de um aluno
 * 	e calcular media final
 *  dados para cada aluno: id aluno, teste 1,teste 2
*/
import java.io.*;
import java.util.Scanner;
public class Turma18b {
    // Scanner para leitura de dados do teclado
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) throws IOException{

        // define ARRAY de 2 DIMENSOES (linhas = alunos; colunas = dados de um aluno)
        int[][] turma;
        System.out.print("Nome ficheiro: ");
        String nomefich = ler.nextLine();

        if (new File(nomefich).exists()) turma = lerTurma(nomefich);
        else turma = gerarTurma(10);

        imprimirTurma(turma,turma.length);
        // teste classe
Aluno a = new Aluno();
a.id = 111;
a.t1 = 12.4;
System.out.printf("%f %f media = %f%n",a.t1,a.t2,(a.t1+a.t2)/2.0);
Aluno1[] b = new Aluno1[100];
b[0] = new Aluno1();
System.out.println(b[0].nome);

    }
    static int[][] lerTurma(String nomef) throws IOException{
        int nalunos=0;

        File f = new File(nomef);
        Scanner ler = new Scanner(f);
        // cal. nº de linhas/alunos no ficheiro
        while (ler.hasNextLine()) {
            ler.nextLine();
            nalunos++;
        }
        ler.close();
        int[][] t = new int[nalunos][3];
        //  abre ficheiro novamente para ler de início
        ler = new Scanner(f);
        nalunos=0;
        while (ler.hasNextLine()) {
            t[nalunos][0] = ler.nextInt();
            t[nalunos][1] = ler.nextInt();
            t[nalunos][2] = ler.nextInt();
            nalunos++;
        }
        ler.close();
        return t;
    }
    static int[][] gerarTurma(int nalunos) {
        int[][] t = new int[nalunos][3];
        int n=0;

        while (n <t.length) {
            t[n][0]= 10000 + (int)(Math.random()*100);
            t[n][1] = (int)(Math.random()*21);
            t[n][2] = (int)(Math.random()*21);
            n++;
        }
        return t;
    }
    static void imprimirTurma(int[][] t, int n) {
        if (n < 0 || n > t.length)n = t.length;	//Testa limites array
        System.out.println("    ID    T1    T2    Final");
        for (int a=0; a <n; a++) {
            System.out.printf("%6d%6d%6d%9.2f\n",t[a][0],t[a][1],t[a][2],(t[a][1]+t[a][2])/2.0);
        }
        System.out.printf("\nmedia   %4.1f  %4.1f \n",media(t,1,n), media(t,2,n));
    }
    static float media (int[][] tabela, int c, int nl) {
        if (nl <= 0 || nl > tabela.length)nl = tabela.length;//Testa limites array
        float soma=0;
        for (int n=0; n<nl; n++) {
            soma = soma + tabela[n][c];
        }
        return soma/nl;
    }
    /*teste classes
     * -print
     */

}
// classes
class Aluno{
    int id;
    double t1;
    double t2;

}

