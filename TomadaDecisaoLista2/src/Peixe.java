import java.util.Scanner;

public class Peixe {
	public static void main(String[] args) {
		Scanner Leia = new Scanner(System.in);
		double pp, preco;
		
		System.out.println("Digite a quantidade de kg dos peixes pescados:");
		pp = Leia.nextInt();
		if (pp < 10) {
			preco = pp * 12;
			System.out.println("O kilo custará R$ 12,00 ");
			System.out.println("Você pagará R$: "+preco);
		} else {
			preco = pp * 10;
			System.out.println("O kilo custará R$ 10,00 ");
			System.out.println("Você pagará R$: "+preco);
		Leia.close();
		}
	}

}
