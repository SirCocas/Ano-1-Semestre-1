import java.util.Scanner;

/* Função para leitura de um caracter e análise de carateres
 * maiusculos e minusculos.
*/

public class exemplo2 {
    public static Scanner kb = new Scanner(System.in);

    public static void main(String []args) {

        System.out.print("Letra: ");
        char letra = nextChar();

        if(letra >= 'a' && letra <= 'z') {
            System.out.println("Minuscula");
        } else if(letra >= 'A' && letra <= 'Z') {
            System.out.println("Maiuscula");
        }
    }

    public static char nextChar() {
        String s = new String();

        do {
            s = kb.nextLine();
        } while(s.length() != 1);

        return s.charAt(0);
    }
}
