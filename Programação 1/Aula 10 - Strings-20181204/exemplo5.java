import java.util.Scanner;

/* Leitura de várias frases até aparecer a palavra "fim" e
 * contagem no numero de minusculas e maiusculas*/

public class exemplo5 {
    public static Scanner kb = new Scanner(System.in);

    public static void main(String []args) {
        int min = 0, mai = 0;
        String s = new String();

        do {
            System.out.print("frase: ");
            s = kb.nextLine();

            for(int pos = 0 ; pos < s.length() ; pos++) {
                char letra = s.charAt(pos);

                if(Character.isLowerCase(letra)) {
                    min++;
                } else if(Character.isUpperCase(letra)) {
                    mai++;
                }
            }
        
        } while(!s.equalsIgnoreCase("fim"));

        System.out.println("Minusculas: " + min);
        System.out.println("Maiusculas: " + mai);

        String s1 = new String();
        String s2 = new String();

        s2 = "xpto";
        System.out.print("texto: ");
        s1 = kb.nextLine();
        while(!s1.equalsIgnoreCase("fim")) {
            if(s1.compareToIgnoreCase(s2) > 0) {
                System.out.println("o texto introduzido é maior!\n");
            } else if(s1.compareToIgnoreCase(s2) < 0) {
                System.out.println("o texto introduzido é menor!\n");
            } else {
                System.out.println("o texto introduzido é igual!\n");
            }
            System.out.print("texto: ");
            s1 = kb.nextLine();
        }

    }
}
