import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome1, nome2;
        int idade1, idade2;

        System.out.print("Digite o nome do primeiro usuário: ");
        nome1 = ler.next();
        System.out.print("Digite a idade do primeiro usuário: ");
        idade1 = ler.nextInt();

        System.out.print("Digite o nome do segundo usuário: ");
        nome2 = ler.next();
        System.out.print("Digite a idade do segundo usuário: ");
        idade2 = ler.nextInt();

        if (idade1 == idade2) {
            System.out.println(nome1 + " e " + nome2 + " têm a mesma idade: " + idade1 + " anos.");
        } else if (idade1 > idade2) {
            System.out.println("Mais velho: " + nome1 + " (" + idade1 + " anos)");
            System.out.println("Mais novo: " + nome2 + " (" + idade2 + " anos)");
        } else {
            System.out.println("Mais velho: " + nome2 + " (" + idade2 + " anos)");
            System.out.println("Mais novo: " + nome1 + " (" + idade1 + " anos)");
        }

        ler.close();
    }
}