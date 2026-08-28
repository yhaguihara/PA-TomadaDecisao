import java.util.Scanner;

public class CalculoIRPF {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario, imposto;

        System.out.print("Digite o salário (base de cálculo) do empregado: R$ ");
        salario = ler.nextDouble();
        if (salario <= 1434.59) {
            imposto = 0;
            System.out.println("Isento de imposto de renda.");
        } else if (salario <= 2150.00) {
            imposto = (salario * 7.5 / 100) - 107.59;
        } else if (salario <= 2866.70) {
            imposto = (salario * 15.0 / 100) - 268.84;
        } else if (salario <= 3582.00) {
            imposto = (salario * 22.5 / 100) - 483.84;
        } else {
            imposto = (salario * 27.5 / 100) - 662.94;
        }
        if (salario > 1434.59) {
            System.out.printf("Desconto do IRPF: R$ %.2f\n", imposto);
        }

        ler.close();
    }
}