package lacos_ex_6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas vezes você quer multiplicar?");
		int vezes = sc.nextInt();
		int resultado = vezes;
		sc.close();

		while (vezes != 1) {
			vezes -= 1;
			resultado = resultado * vezes;
			System.out.println(resultado);
		}
		
	}
}
