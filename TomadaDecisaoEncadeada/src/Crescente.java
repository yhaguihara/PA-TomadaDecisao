import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c;

        System.out.print("Digite o valor de A: ");
        a = ler.nextInt();
        System.out.print("Digite o valor de B: ");
        b = ler.nextInt();
        System.out.print("Digite o valor de C: ");
        c = ler.nextInt();
        System.out.print("Ordem crescente: ");
        
        if (a < b && b < c) {
            System.out.println(a + ", " + b + ", " + c);
        } else if (a < c && c < b) {
            System.out.println(a + ", " + c + ", " + b);
        } else if (b < c && c < a) {
            System.out.println(b + ", " + c + ", " + a);
        } else if (b < a && a < c) {
            System.out.println(b + ", " + a + ", " + c);
        } else if (c < b && b < a) {
            System.out.println(c + ", " + b + ", " + a);
        } else {
            System.out.println(c + ", " + a + ", " + b);
        }

        ler.close();
    }
}