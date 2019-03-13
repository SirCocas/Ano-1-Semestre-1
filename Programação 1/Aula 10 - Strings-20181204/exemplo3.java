import java.util.Scanner;

/* Utilização da class Character */

public class exemplo3 {
    public static Scanner kb = new Scanner(System.in);
    
    public static void main(String []args) {

        char letra = 'x';

        if(Character.isLowerCase(letra)) {
            System.out.println("Minuscula");
        } else if(Character.isUpperCase(letra)) {
            System.out.println("Maiuscula");
        }

    }
}
