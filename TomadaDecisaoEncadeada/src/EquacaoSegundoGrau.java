import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta;

        System.out.print("Digite o valor de A: ");
        Scanner ler = scanner;
		a = ler.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = ler.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = ler.nextDouble();
        delta = Math.pow(b, 2) - (4 * a * c);
        
        if (delta < 0) {
            System.out.println("Não existem raízes reais para a equação.");
        } else if (delta == 0) {
            double x = (-b) / (2 * a);
            System.out.printf("Existe apenas uma raiz real para a equação: X = %.2f\n", x);
        } else {
            double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Existem duas raízes reais: X1 = %.2f e X2 = %.2f\n", x1, x2);
        }

        ler.close();
    }
}