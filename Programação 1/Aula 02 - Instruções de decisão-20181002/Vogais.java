
import java.util.Scanner;
/*
 * Created by jam on 27-set-2018
 * determinar se um caracter é vogal
 */

public class Vogais {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);

        String  frase = "Exemplo do switch ";
        frase = frase + "- determinar se um caracter é vogal";
        char letra;
        int pos;

        System.out.println(frase);
        System.out.println("Escolha a posicao da letra:");
        pos = ler.nextInt();

        letra = frase.charAt(pos-1);
        switch (letra) {
            case 'a':

				System.out.printf("Codigo do %c = %d\n", letra,(int)letra);
            //break;
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("Vogal %c\n", letra);
                break;
            default:
                System.out.printf("Codigo do %c = %d\n", letra,(int)letra);
                break;
        }

    }
}
