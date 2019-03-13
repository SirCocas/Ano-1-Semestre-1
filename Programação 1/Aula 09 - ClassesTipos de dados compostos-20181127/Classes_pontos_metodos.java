import java.util.*;
public class Classes_pontos_metodos {
    static Scanner sc = new Scanner(System.in);
    public static void main (String args[]) {
        Ponto p1, p2;
        // Uso dos construtores
        p1 = new Ponto(1.0,1.0);
        p2 = new Ponto();
        p2 = lerPonto();
        // Teste dos métodos
        System.out.printf("Distancia entre p1 e p2 = %.2f; %.2f\n",distancia(p1, p2), p2.dist(p1) );
        p1.printP();
        System.out.println(p2.toString());
        System.out.printf("Distancia de p1 e Origem = %f\n",p1.dist(0.0,0.0));
    }
    public static Ponto lerPonto() {
        Ponto p = new Ponto();
        System.out.print("x: ");
        p.x = sc.nextDouble();
        System.out.print("y: ");
        p.y = sc.nextDouble();
        return p;
    }
    public static double distancia(Ponto a, Ponto b) {
        return Math.sqrt(Math.pow(b.x-a.x, 2) + Math.pow(b.y-a.y, 2));
    }

}

class Ponto {
    double x;
    double y;
    // Métodos
    public void printP() {
        System.out.printf("ponto(%.1f,%.1f)\n",this.x,this.y);
    }
    public String toString(){
        return String.format("ponto(%.1f,%.1f)\n",this.x,this.y);
    }
    public double dist(double x1,double y1) {
        return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
    }
    public double dist(Ponto p) {
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }
    // Construtores
    Ponto(double x, double y) {
        this.x=x;
        this.y=y;
    }
    Ponto() {
        this.x=0;
        this.y=0;
    }
}
