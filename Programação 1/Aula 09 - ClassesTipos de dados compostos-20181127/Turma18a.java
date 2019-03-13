/*
 *  JAM, 22-nov-2018
 *
 *  CLASSES - Tipos compostos de addos
 *
 *  dados para cada aluno: id aluno, teste 1,teste 2, nome, ...
*/

import java.util.Scanner;
public class Turma18a {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        Aluno a = new Aluno();
        Aluno z = new Aluno(333,"marco",11.1,12.2);
        a.id=111;
        a.t1=12.6;
        a.nome = "joao";
        System.out.println(a.t2);
Aluno1 b = new Aluno1();
        imprime(a);
         System.out.println(a.t1);
        Aluno[] c = new Aluno[5];
        c[0] = new Aluno();
        System.out.println(c[0].t1);

    }
    static void imprime(Aluno x){
        System.out.printf("%d %s %f %f %n",x.id,x.nome,x.t1, x.t2);
        x.t1=10.8;
    }

}
// Classes
class Aluno{
    int id;
    double t1;
    double t2;
    String nome;
//Contrutores
    Aluno(){}
    Aluno (int id, String n, double t1, double t2){
        this.id =id;
        this.nome = n;
        this.t1=t1;
        this.t2=t2;

    }
}

