package ex_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o valor para conversão.");
		float valor = sc.nextFloat();

		System.out.println("Tipo da conversão");
		System.out.println("1 - Real para dólar");
		System.out.println("2 - Dólar para real");
		System.out.println("3 - Real para euro");
		System.out.println("4 - Euro para real");
		int tipoConversao = sc.nextInt();

		sc.close();

		switch (tipoConversao) {
			case 1:
				System.out.println("Real para dólar: " + (valor * 5));
			break;
			case 2:
				System.out.println("Dólar para real: " + (valor / 5));
			break;
			case 3:
				System.out.println("Real para euro: " + (valor * 6));
			break;
			case 4:
				System.out.println("Euro para real: " + (valor / 6));
			break;
			
			default:
				System.out.println("Algo deu errado, tente novamente.");
		}

	}

}
