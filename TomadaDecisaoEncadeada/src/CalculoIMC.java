import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso, altura, imc;

        System.out.print("Digite o seu peso em kg: ");
        Scanner ler = scanner;
		peso = ler.nextDouble();
        System.out.print("Digite a sua altura em metros: ");
        altura = ler.nextDouble();
        imc = peso / (Math.pow(altura, 2));

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Excesso de Magreza");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso Normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Excesso de Peso");
        } else if (imc < 35) {
            System.out.println("Classificação: Obesidade (Grau I)");
        } else if (imc < 40) {
            System.out.println("Classificação: Obesidade (Grau II)");
        } else {
            System.out.println("Classificação: Obesidade (Grau III)");
        }

        ler.close();
    }
}