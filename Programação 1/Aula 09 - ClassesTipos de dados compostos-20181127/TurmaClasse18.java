/*
 *  JAM, 19-nov-2018
 *  DEFINIÇÂO E USO de Classes como tipos de dados compostos/registos
 *
 *  Ler/gerar notas de 0 a 20  das várias avaliações de um aluno
 * 	e calcular media final
 *  dados para cada aluno: id aluno, nome aluno, teste 1, teste 2
*/
import java.util.Scanner;
public class TurmaClasse18 {
    // Scanner para leitura de dados do teclado
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        final int NALUNOS = 3;
        // define ARRAY de 2 DIMENSOES (linhas = alunos; colunas = dados de um aluno)
        int[][] turma= new int[NALUNOS][3];
        int id, soma=0, num=0;
        float media;

        //~ num = lerTurma(turma);
        turma = gerarTurma(10);
        num=turma.length;
        imprimirTurma(turma,num);
        // teste classe Aluno
        Aluno a = new Aluno();
         //~Aluno a = new Aluno(111,"manel",11,14); // com construtor
        a.nome="maria";
        //~ gerarNome(a); //passagem por referência
        System.out.printf("%4d %s %4d %4d %n%n",a.id,a.nome,a.t1,a.t2);

        Aluno[] t1;
        t1 = gerarTurmaC(7);
        //~ System.out.printf("%4d %s %4d %4d %n",t1[0].id,t1[0].nome,t1[0].t1,t1[0].t2);
        imprimirTurma(t1,7);
    }

    static int lerTurma(int[][] t) {
        int nalunos=0;
        System.out.println("Introduza as notas dos alunos (ID = 0 termina):");
        System.out.printf("ID do aluno: ");
        int id = ler.nextInt();
        while (id > 0 && nalunos <t.length) {
            t[nalunos][0]=id;
            System.out.printf("Nota T1:");
            t[nalunos][1] = ler.nextInt();
            System.out.printf("Nota T2:");
            t[nalunos][2] = ler.nextInt();

            nalunos++;
            System.out.printf("ID do aluno: ");
            id = ler.nextInt();
        }
        return nalunos;
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
        if (n <= 0 || n > t.length)n = t.length;	//Testa limites array
        System.out.println("   ID   T1   T2 Final");
        for (int a=0; a <n; a++) {
            for (int c=0; c<t[a].length; c++)System.out.printf("%5d",t[a][c]);
            System.out.printf("%6.2f\n",(t[a][1]+t[a][2])/2.0);
        }
        System.out.printf("\nmed     %4.1f %4.1f \n",media(t,1,n), media(t,2,n));
    }
    static float media (int[][] tabela, int c, int nl) {
        if (nl <= 0 || nl > tabela.length)nl = tabela.length;//Testa limites array
        int soma=0;
        for (int n=0; n<nl; n++) {
            soma = soma + tabela[n][c];
        }
        return (float)soma/nl;
    }
    //classes
    static Aluno[] gerarTurmaC(int nalunos) {
        Aluno[] t = new Aluno[nalunos];
        int n=0;

        while (n <t.length) {
            t[n] = new Aluno();
            t[n].id = 10000 + (int)(Math.random()*100);
            t[n].t1 = (int)(Math.random()*21);
            t[n].t2 = (int)(Math.random()*21);
            //~ t[n].nome = gerarNome();
            gerarNome(t[n]);    // mostar passagem por referência nos objetos
            n++;
        }
        return t;
    }
    static void imprimirTurma(Aluno[] t, int n) {
        if (n <= 0 || n > t.length)n = t.length;	//Testa limites array
        System.out.println("   ID Nome               T1    T2 Final");
        for (int a=0; a <n; a++) {
            System.out.printf("%5d %-15s %5d %5d",t[a].id, t[a].nome, t[a].t1, t[a].t2);
            System.out.printf("%6.2f\n",(t[a].t1 + t[a].t2)/2.0);
        }

    }
    static String gerarNome() {
        String[][] nomes = {{"maria","antonio"},
            {"alda","manel"}, {"ana", "xico"}, {"joana", "raul"}, {"marta","paulo"}
        };
        int sexo = (int)(Math.random()*100)%2;
        return nomes[(int)(Math.random()*1000) % nomes.length][sexo] + " " +
               nomes[(int)(Math.random()*100) % nomes.length][sexo];
    }
    // para mostrar passagem por referência. dentro da função está a alterar-se o objeto original
    static void gerarNome(Aluno a) {
        String[][] nomes = {{"maria","antonio"},
            {"alda","manel"}, {"ana", "xico"}, {"joana", "raul"}, {"marta","paulo"}
        };
        int sexo = (int)(Math.random()*100)%2;
        a.nome = nomes[(int)(Math.random()*1000) % nomes.length][sexo] + " " +
                     nomes[(int)(Math.random()*100) % nomes.length][sexo];
    }
}

class Aluno {
    int id;
    String nome;
    int t1;
    int t2;
    // construtores - inicializam o objeto com os valores passados no new
    // podem existir vários (overloading)
    // são métodos com o mesmo nome da calsse e sem return
    Aluno() {}
    Aluno(int id, String n, int t1, int t2) {
        this.id=id;
        this.nome=n;
        this.t1=t1;
        this.t2=t2;
    }
}
