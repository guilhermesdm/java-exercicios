package lacos_ex_10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número. Para finalizar o processo digite 0");
		int numero = sc.nextInt();

		int pares = 0;
		int impares = 0;
		int negativos = 0;
		int positivos = 0;
		int quantidadeNumeros = 0;

		while (numero != 0) {

			if (numero % 2 == 0 & numero > 0) {
				pares += 1;
				positivos += 1;
			} else if (numero % 2 == 0 & numero < 0) {
				pares += 1;
				negativos += 1;
			} else if (numero % 2 != 0 & numero > 0) {
				impares += 1;
				positivos += 1;
			} else if (numero % 2 != 0 & numero < 0) {
				impares += 1;
				negativos += 1;
			} else if (numero % 2 == 0) {
				pares += 1;
			} else if (numero % 2 == 1) {
				impares += 1;
			} else if (numero > 0) {
				positivos += 1;
			} else if (numero < 0) {
				negativos += 1;
			} else {
				System.out.println("erro");
			}
			
			System.out.println("Informe um número. Para finalizar o processo digite 0");
			numero = sc.nextInt();
			quantidadeNumeros += 1;
		}

		sc.close();

		System.out.println("Quantidade de pares " + pares);
		System.out.println("Quantidade de impares " + impares);
		System.out.println("Quantidade de negativos " + negativos);
		System.out.println("Quantidade de positivos " + positivos);
		System.out.println("Quantidade total de números " + quantidadeNumeros);

	}

}
