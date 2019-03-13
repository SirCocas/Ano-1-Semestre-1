import java.util.Scanner;

/* Class String e concatenação de Strings*/

public class exemplo1 {
    public static Scanner kb = new Scanner(System.in);
    public static void main(String []args) {

        String s1 = new String();
        String s2 = new String();
        String s3 = new String();

        s1 = "teste";

        s2 = kb.nextLine();

        s3 = s1 + s2;
        System.out.println(s1);
        System.out.printf("%20s\n", s1);
        System.out.printf("%-20s ***\n", s3);
    }
}
