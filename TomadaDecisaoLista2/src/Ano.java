import java.util.Scanner;
public class Ano {

	
	public static void main(String[] args) {
		Scanner Leia = new Scanner(System.in);
		int ano;
		
		System.out.println("Entre com o ano:");
		ano = Leia.nextInt();
		if (ano % 4==0) {
			System.out.println("O ano é bissexto");
		} else {
			System.out.println("O ano não é bissexto");
		} Leia.close();  
		
	}

}
