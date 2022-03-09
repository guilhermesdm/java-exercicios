package ex_17;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Que dia voc� nasceu?");
		int dia = sc.nextInt();

		System.out.println("Em qual m�s voc� nasceu? (Em numeral, de 1 a 12).");
		int mes = sc.nextInt();
		sc.close();

		switch (mes) {
		case 1:
			if (dia <= 20) {
				System.out.println("Capric�rnio");
			} else if (dia >= 21 & dia <= 31) {
				System.out.println("Aqu�rio");
			}
			break;
		case 2:
			if (dia <= 18) {
				System.out.println("Aqu�rio");
			} else if (dia >= 19 & dia <= 29) {
				System.out.println("Peixes");
			}
			break;

		case 3:

			if (dia <= 20) {
				System.out.println("Peixes");
			} else if (dia >= 21 & dia <= 31) {
				System.out.println("�ries");
			}

			break;

		case 4:

			if (dia <= 20) {
				System.out.println("�ries");
			} else if (dia >= 21 & dia <= 30) {
				System.out.println("Touro");
			}

			break;

		case 5:

			if (dia <= 20) {
				System.out.println("Touro");
			} else if (dia >= 21 & dia <= 31) {
				System.out.println("G�meos");
			}

			break;

		case 6:
			if (dia <= 20) {
				System.out.println("G�meos");
			} else if (dia >= 21 & dia <= 30) {
				System.out.println("C�ncer");
			}
			break;

		case 7:
			if (dia <= 22) {
				System.out.println("C�ncer");
			} else if (dia >= 23 & dia <= 31) {
				System.out.println("Le�o");
			}
			break;

		case 8:
			if (dia <= 22) {
				System.out.println("Le�o");
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
				System.out.println("Escorpi�o");
			}
			break;

		case 11:
			if (dia <= 21) {
				System.out.println("Escorpi�o");
			} else if (dia >= 22 & dia <= 30) {
				System.out.println("Sagit�rio");
			}
			break;

		case 12:
			if (dia <= 21) {
				System.out.println("Sagit�rio");
			} else if (dia >= 22 & dia <= 31) {
				System.out.println("Capic�rnio");
			}
			break;

		default:
			System.out.println("Data incorreta.");
			break;
		}
		
	}
	
}
