import java.util.Scanner;

public class GastoCombustivel {

	public static void main(String[] args) {
		Scanner Leia = new Scanner(System.in);
		double dp, ct, gm;
		
		System.out.println("Entre com a distância percorrida em quilometros:");
		dp= Leia.nextDouble();
		System.out.println("Entre com a capacidade do tanque em litros:");
		ct= Leia.nextDouble();
		gm= dp/ct;
		System.out.println("Seu carro tem gasto medio de: "+gm+"km/L");
		if (gm>=10) {
			System.out.println("Seu carro é econômico");
		} else {
			System.out.println("Seu carro não é econômico");
			Leia.close();
		}
		

	}

}
