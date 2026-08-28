import java.util.Scanner;

public class AnoNascimento {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anoNascimento, anoAtual = 2026, idade;

        System.out.print("Digite o seu ano de nascimento: ");
        anoNascimento = ler.nextInt();

        if (anoNascimento >= 1900 && anoNascimento <= 2026) {
            idade = anoAtual - anoNascimento;
            System.out.println("Sua idade é: " + idade + " anos");
        } else {
            System.out.println("O ano digitado é inválido.");
        }

        ler.close();
    }
}