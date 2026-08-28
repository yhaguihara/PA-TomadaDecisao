package prjTomadaDecisao;
import java.util.Scanner;

public class SalarioLei {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario, minimo;
		
		System.out.println("Insira o seu salário atual:");
		salario = ler.nextDouble();
		System.out.println("Insira o valor do salário mínimo do seu estado:");
		minimo = ler.nextDouble();
		if(salario<minimo) {
			System.out.println("Seu salário está fora da lei:");
		} else { 
			System.out.println("Seu salário está dentro da lei:");
		}
		ler.close();
	}

}
