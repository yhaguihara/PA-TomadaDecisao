import java.util.Scanner;

public class Mergulho {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int destino, dias;
        double valorPorDia, taxaAdicional, valorTotal;

        System.out.println("Escolha o destino:");
        System.out.println("1 - Ilhabela");
        System.out.println("2 - Fernando de Noronha");
        System.out.print("Opção: ");
        destino = ler.nextInt();

        System.out.print("Quantidade de dias de mergulho: ");
        dias = ler.nextInt();

        if (destino == 1 || destino == 2) {

            if (destino == 1) { // Ilhabela
                if (dias <= 5) {
                    valorPorDia = 240.00;
                    taxaAdicional = 0.00;
                } else if (dias <= 10) {
                    valorPorDia = 220.00;
                    taxaAdicional = 130.00;
                } else {
                    valorPorDia = 210.00;
                    taxaAdicional = 150.00;
                }
            } else { // Fernando de Noronha
                if (dias <= 5) {
                    valorPorDia = 400.00;
                    taxaAdicional = 100.00;
                } else if (dias <= 10) {
                    valorPorDia = 410.00;
                    taxaAdicional = 150.00;
                } else {
                    valorPorDia = 420.00;
                    taxaAdicional = 200.00;
                }
            }

            valorTotal = (valorPorDia * dias) + taxaAdicional;
            System.out.printf("Valor total do passeio: R$ %.2f%n", valorTotal);

        } else {
            System.out.println("Destino inválido.");
        }

        ler.close();
    }
}