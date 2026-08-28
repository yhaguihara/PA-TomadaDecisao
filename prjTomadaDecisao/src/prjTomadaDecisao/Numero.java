package prjTomadaDecisao;
import java.util.Scanner;

public class Numero {
	public static void main(String [] args) {
		Scanner Leia = new Scanner(System.in);
		int num;
		System.out.println("Digite o número:");
		num = Leia.nextInt();
		if(num % 2==0) {
			System.out.println("Seu número é par");
		} else {
			System.out.println("Seu número é impar");
		}
		Leia.close();
		
	}

}
