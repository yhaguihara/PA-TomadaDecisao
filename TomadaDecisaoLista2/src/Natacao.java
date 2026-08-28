import java.util.Scanner;
public class Natacao {

	public static void main(String[] args) {
		Scanner Leia = new Scanner(System.in);
		int id;
		
		System.out.println("Escreva sua idade");
		id = Leia.nextInt();
		if (id<=8) {
			System.out.println("Infantil");
		} else {
			if (id<=13) {
				System.out.println("Juvenil A");
			} else {
				if (id<=17) {
					System.out.println("Juvenil B");
				} else {
					System.out.println("Adulto");
					
				}
			}
		} Leia.close();
		

	}

}
