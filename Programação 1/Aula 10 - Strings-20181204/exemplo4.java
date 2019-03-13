import java.util.Scanner;

/* Utilização dos métodos length() e charAt() para aceder
 * a todos os carateres de uma String.
*/

public class exemplo4 {
    public static Scanner kb = new Scanner(System.in);
    
    public static void main(String []args) {
        int min = 0, mai = 0;
        String s = new String();

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
        System.out.println("Minusculas: " + min);
        System.out.println("Maiusculas: " + mai);
    }
}
