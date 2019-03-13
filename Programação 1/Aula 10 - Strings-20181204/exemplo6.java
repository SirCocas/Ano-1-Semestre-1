import java.util.Scanner;

/*  JAM, 26-nov-2018
 *  Strings - funções várias
 */

public class exemplo6 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String []args) {
        int x;
        String s = "aveiro";
        String[] t;
        System.out.printf("ler inteiro: ");
        x = ler.nextInt();
        System.out.printf("Ler frase: ");
        do {                        // nextInt() só lê digitos! ciclo procura novo inicio de linha
            s = ler.nextLine();     // alternativas:
        } while (s.isEmpty());  //ler.skip("\r\n"); ler.skip("\n");
        System.out.printf("%d %s\n", x, s);
        System.out.printf("converte '231' para inteiro = %d\n" +
            "converte ´21.3´ para double = %f%n", Integer.parseInt("231"), Double.parseDouble("21.3"));
        System.out.printf("primeira posicao de 'av': %d\n", s.indexOf("av"));
        System.out.printf("última posicao de 'av': %d\n", s.lastIndexOf("av"));
        System.out.printf("substitui: %s\n", s.replace("av", "AVEIRO"));
        System.out.printf("sub string (3,5): %s\n", s.substring(3, 5));
        System.out.printf("sub string:(3, até fim) %s\n", s.substring(3));
        System.out.printf("string começa com 'av'- a partir da posição 4: %B\n", s.startsWith("av",4));
        System.out.printf("string começa com 'av': %B\n", s.startsWith("av"));
        t=s.split(" ");
        for (String a : t)System.out.printf("sub string: %s\n", a);
        System.out.printf("PARA MAIUSCULAS: %s\n", s.toUpperCase());
        System.out.printf("para minúsculas: %s\n", s.toLowerCase());
        System.out.printf("aveiro < porto = %d %n","aveiro".compareToIgnoreCase("porto"));
    }
}
