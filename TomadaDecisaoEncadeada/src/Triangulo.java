import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double a, b, c;

        System.out.print("Digite o valor de A: ");
        a = ler.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = ler.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = ler.nextDouble();

        if (a > b + c) {
            System.out.println("Não é possível formar um triângulo");
        } else if (b > a + c) {
            System.out.println("Não é possível formar um triângulo");
        } else if (c > a + b) {
            System.out.println("Não é possível formar um triângulo");
        } else if (a == b && b == c) {
            System.out.println("Seu triângulo é um triângulo equilátero");
        } else if (a == b) {
            System.out.println("Seu triângulo é isósceles");
        } else if (a == c) {
            System.out.println("Seu triângulo é isósceles");
        } else if (b == c) {
            System.out.println("Seu triângulo é isósceles");
        } else {
            System.out.println("Seu triângulo é escaleno");
        }

        ler.close();
    }
}