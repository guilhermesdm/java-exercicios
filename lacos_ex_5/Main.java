package lacos_ex_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome = null;

		int idade = 0;

		int maisVelho = idade;
		String nomeMaisVelho = nome;

		int continuar = 0;

		while (continuar == 0) {
			System.out.println("Informe um nome.");
			nome = sc.next();

			System.out.println("Informe a idade.");
			idade = sc.nextInt();

			if (idade > maisVelho) {
				maisVelho = idade;
				nomeMaisVelho = nome;
			}

			System.out.println("\nDeseja continuar? 0 - Sim\n1 - Não");
			continuar = sc.nextInt();

		}

		System.out.println("O mais velho é: " + nomeMaisVelho + " " + maisVelho + " anos");

		sc.close();
	}

}
