package prjTomadaDecisao;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, atual, nasc;
		
		System.out.println("Insira o ano atual:"); 
		atual = ler.nextInt();
		System.out.println("Insira o ano de nascimento:");
		nasc = ler.nextInt();
		idade = atual-nasc;
		System.out.println("Sua idade é: "+idade);
		if(idade<18) {
			System.out.println("Você é menor de idade");
		} else {
			System.out.println("Você é maior de idade");
		}
		ler.close();
	}

}
