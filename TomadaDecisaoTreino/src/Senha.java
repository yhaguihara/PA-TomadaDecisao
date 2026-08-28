import java.util.Scanner;

public class Senha {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		String senhaUsu;
		
		System.out.println("Insira a senha:");
		senhaUsu = ler.next();
		if(senhaUsu.equals("senhasecreta")) { // equalsIgnoreCase = ignora caixa alta e baixa, equals = usa a diferença
			System.out.println("Acesso permitido.");
		} else {
			System.out.println("Acesso negado.");
		ler.close();
		
		}
		
	}

}
