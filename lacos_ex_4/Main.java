package lacos_ex_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um n�mero.");
		int numero = sc.nextInt();
		
		if (numero != 0) {
			while (numero != 0) {
				System.out.println("Informe um n�mero.");
				numero = sc.nextInt();
			}
		}

		System.out.println("La�o finalizado.");
		
		sc.close();
	}
}
