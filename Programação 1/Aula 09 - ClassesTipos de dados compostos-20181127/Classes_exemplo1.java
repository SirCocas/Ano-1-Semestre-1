import java.util.Scanner;
/*
* Declaração de uma estrutura para armazenar números complexos.
* Estudo das variáveis do tipo class como sendo referências
*/
public class Classes_exemplo1 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String args[]){

		Complexo x = new Complexo();
		Complexo y = new Complexo();
		//PrintComplexo(x);
		x.r = 5.0;
		x.i = 2.0;
		// x=y;
		y.r = 10.0;
		y.i = 15.0;
		PrintComplexo(x);
		PrintComplexo(y);
	}
	public static void PrintComplexo(Complexo tmp)
	{
		System.out.println("real: " + tmp.r + " imag: " + tmp.i);
	}
}
class Complexo {
	double r, i;
}
