import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1, n2, media, notaExame, novaMedia;

        System.out.print("Digite a primeira nota: ");
        n1 = ler.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n2 = ler.nextDouble();

        media = (n1 + n2) / 2;

        if (media >= 6) {
            System.out.println("APROVADO");
        } else {
            System.out.println("O aluno está em exame");

            System.out.print("Digite a nota do exame: ");
            notaExame = ler.nextDouble();

            novaMedia = (media + notaExame) / 2;

            if (novaMedia >= 6) {
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO");
            }
        }

        ler.close();
    }
}