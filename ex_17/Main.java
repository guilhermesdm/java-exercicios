package ex_17;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Que dia você nasceu?");
		int dia = sc.nextInt();

		System.out.println("Em qual mês você nasceu? (Em numeral, de 1 a 12).");
		int mes = sc.nextInt();
		sc.close();

		switch (mes) {
		case 1:
			if (dia <= 20) {
				System.out.println("Capricórnio");
			} else if (dia >= 21 & dia <= 31) {
				System.out.println("Aquário");
			}
			break;
		case 2:
			if (dia <= 18) {
				System.out.println("Aquário");
			} else if (dia >= 19 & dia <= 29) {
				System.out.println("Peixes");
			}
			break;

		case 3:

			if (dia <= 20) {
				System.out.println("Peixes");
			} else if (dia >= 21 & dia <= 31) {
				System.out.println("Áries");
			}

			break;

		case 4:

			if (dia <= 20) {
				System.out.println("Áries");
			} else if (dia >= 21 & dia <= 30) {
				System.out.println("Touro");
			}

			break;

		case 5:

			if (dia <= 20) {
				System.out.println("Touro");
			} else if (dia >= 21 & dia <= 31) {
				System.out.println("Gêmeos");
			}

			break;

		case 6:
			if (dia <= 20) {
				System.out.println("Gêmeos");
			} else if (dia >= 21 & dia <= 30) {
				System.out.println("Câncer");
			}
			break;

		case 7:
			if (dia <= 22) {
				System.out.println("Câncer");
			} else if (dia >= 23 & dia <= 31) {
				System.out.println("Leão");
			}
			break;

		case 8:
			if (dia <= 22) {
				System.out.println("Leão");
			} else if (dia >= 23 & dia <= 31) {
				System.out.println("Virgem");
			}
			break;

		case 9:
			if (dia <= 22) {
				System.out.println("Virgem");
			} else if (dia >= 23 & dia <= 30) {
				System.out.println("Libra");
			}
			break;

		case 10:
			if (dia <= 22) {
				System.out.println("Libra");
			} else if (dia >= 23 & dia <= 31) {
				System.out.println("Escorpião");
			}
			break;

		case 11:
			if (dia <= 21) {
				System.out.println("Escorpião");
			} else if (dia >= 22 & dia <= 30) {
				System.out.println("Sagitário");
			}
			break;

		case 12:
			if (dia <= 21) {
				System.out.println("Sagitário");
			} else if (dia >= 22 & dia <= 31) {
				System.out.println("Capicórnio");
			}
			break;

		default:
			System.out.println("Data incorreta.");
			break;
		}
		
	}
	
}
