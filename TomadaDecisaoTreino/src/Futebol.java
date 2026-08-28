import java.util.Scanner;

public class Futebol {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		int time1, time2;
		
		System.out.println("Informe quantos gols o time 1 fez:");
		time1 = ler.nextInt();
		System.out.println("Informe quantos gols o time 2 fez:");
		time2 = ler.nextInt();
		if(time1>time2) {
			System.out.println("O time 1 ganhou!");
		} else if(time2>time1){
			System.out.println("O time 2 ganhou!");
		} else {
			System.out.println("Houve um empate!");
		ler.close();
		}
		
		
		}

}
