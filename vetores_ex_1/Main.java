package vetores_ex_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arrayUm = new int[10];
		int[] arrayDois = new int[10];

		System.out.println("Digite os números do primeiro vetor");

		for (int i = 0; i < 10; i++) {
			arrayUm[i] = sc.nextInt();
		}

		System.out.println("Digite os números do segundo vetor");

		for (int j = 0; j < 10; j++) {
			arrayDois[j] = sc.nextInt();
		}

		System.out.println("Você quer.\n1 - SOMAR\n2 - SUBTRAIR\n3 - MULTIPLICAR\n4 - DIVIDIR\nOs vetores");
		int calculo = sc.nextInt();

		switch (calculo) {
		case 1:
			for (int i = 0; i < 10; i++) {
				int soma = arrayUm[i] + arrayDois[i];
				System.out.println(soma);
			}

			break;
		case 2:
			for (int i = 0; i < 10; i++) {
				int subtrair = arrayUm[i] - arrayDois[i];
				System.out.println(subtrair );
			}

			break;
		case 3:
			for (int i = 0; i < 10; i++) {
				int multiplicar= arrayUm[i] * arrayDois[i];
				System.out.println(multiplicar);
			}

			break;
		case 4:
			for (int i = 0; i < 10; i++) {
				int dividir = arrayUm[i] / arrayDois[i];
				System.out.println(dividir);
			}
			break;
		default:
			System.out.println("Erro encontrado.");
			break;
		}

		sc.close();

	}

}
