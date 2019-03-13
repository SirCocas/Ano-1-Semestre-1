import java.util.Scanner;

public class retangulo
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    double comp, altura, per, area ;
    System.out.print("Insira o comprimento do seu retângulo: ");
    comp = sc.nextDouble();
    System.out.print("Insira a altura do seu retângulo: ");
    altura = sc.nextDouble();
    per=2*comp + 2*altura;
    area=comp*altura;
    System.out.printf("A área do triângulo é %5.2f e o perímetro é %5.2f", area,per);
    
   }
}
