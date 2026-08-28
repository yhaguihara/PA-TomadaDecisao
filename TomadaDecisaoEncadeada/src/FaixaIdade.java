import java.util.Scanner;
public class FaixaIdade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int aa, an, id;
		
		System.out.println("Digite o ano atual:");
		aa = ler.nextInt();
		System.out.println("Digite o ano de nascimento:");
		an = ler.nextInt();
		id = aa - an;
		System.out.println("Sua idade é "+id+" anos" );
		if (id<10) {
			System.out.println("Aproveite! Você é criança.");
		} else if (id<18) {
			System.out.println("Aproveite! Você é adolescente.");
		} else if (id<60) {
			System.out.println("Aproveite! Você é adulto.");
		} else {
			System.out.println("Você é idoso.");
		ler.close();
		}
	}

}
