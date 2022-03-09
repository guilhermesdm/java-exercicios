package lacos_ex_9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		int contador4 = 0;

		boolean continuar = true;
		while (continuar == true) {
			System.out.println("HORA DE VOTAR");
			System.out.println("\n1 - ROBERTO\n2 - ROBERTA\n3 - AFONSO\n4 - ANA");
			int voto = sc.nextInt();

			switch (voto) {
			case 1:
				contador1++;
				break;
			case 2:
				contador2++;
				break;
			case 3:
				contador3++;
				break;
			case 4:
				contador4++;
				break;

			default:
				System.out.println("Algo deu errado.");
				break;
			}

			System.out.println("Deseja continuar a votação? \n1 - SIM\n2 - NÃO");
			int desejaContinuar = sc.nextInt();
			
			if (desejaContinuar == 1) {
				continuar = true; 
			} else {
				continuar = false;
			}
		}
		sc.close();

		int totalVotos = (contador1 + contador2 + contador3 + contador4);
		
		if (contador1 > contador2 & contador1 > contador3 & contador1 > contador4) {
			float porcentagem = (contador1 * 100) / totalVotos;
			System.out.println("O vencedor foi ROBERTO com %" + porcentagem);
		} else if (contador2 > contador1 & contador2 > contador3 & contador2 > contador4) {
			float porcentagem = (contador2 * 100) / totalVotos;
			System.out.println("O vencedor foi ROBERTA com %" + porcentagem);
		} else if (contador3 > contador1 & contador3 > contador2 & contador3 > contador4) {
			float porcentagem = (contador3 * 100) / totalVotos;
			System.out.println("O vencedor foi AFONSO com %" + porcentagem);
		} else if (contador4 > contador1 & contador4 > contador3 & contador4 > contador2) {
			float porcentagem = (contador2 * 100) / totalVotos;
			System.out.println("O vencedor foi ANA com %" + porcentagem);
		} else if (contador1 == contador2 & contador1 > contador3 & contador1 > contador4) {
			float porcentagem = (contador1 * 100) / totalVotos;
			float porcentagem2 = (contador2 * 100) / totalVotos;
			System.out.println("Empate entre ROBERTO %" + porcentagem + " E ROBERTA %" + porcentagem2);
		} else if (contador1 == contador3 & contador1 > contador2 & contador1 > contador4) {
			float porcentagem = (contador1 * 100) / totalVotos;
			float porcentagem2 = (contador3 * 100) / totalVotos;
			System.out.println("Empate entre ROBERTO %" + porcentagem + " E AFONSO %" + porcentagem2);
		} else if (contador1 == contador4 & contador1 > contador3 & contador1 > contador2) {
			float porcentagem = (contador1 * 100) / totalVotos;
			float porcentagem2 = (contador4 * 100) / totalVotos;
			System.out.println("Empate entre ROBERTO %" + porcentagem + " E ANA %" + porcentagem2);
		} else if (contador2 == contador3 & contador2 > contador1 & contador2 > contador4) {
			float porcentagem = (contador2 * 100) / totalVotos;
			float porcentagem2 = (contador3 * 100) / totalVotos;
			System.out.println("Empate entre ROBERTA %" + porcentagem + " E AFONSO %" + porcentagem2);
		} else if (contador2 == contador4 & contador2 > contador3 & contador2 > contador1) {
			float porcentagem = (contador2 * 100) / totalVotos;
			float porcentagem2 = (contador4 * 100) / totalVotos;
			System.out.println("Empate entre ROBERTA %" + porcentagem + " E ANA %" + porcentagem2);
		} else if (contador3 == contador4 & contador3 > contador1 & contador3 > contador2) {
			float porcentagem = (contador3 * 100) / totalVotos;
			float porcentagem2 = (contador4 * 100) / totalVotos;
			System.out.println("Empate entre AFONSO %" + porcentagem + " E ANA %" + porcentagem2);
		} else if (contador1 == contador2 & contador1 == contador3 & contador1 == contador4) {
			float porcentagem = (contador1 * 100) / totalVotos;
			float porcentagem2 = (contador2 * 100) / totalVotos;
			float porcentagem3 = (contador3 * 100) / totalVotos;
			float porcentagem4 = (contador4 * 100) / totalVotos;
			System.out.println("Empate entre TODOS os participantes!%");
		} else if (contador1 == contador2 & contador1 == contador3 & contador1 > contador4) {
			float porcentagem = (contador1 * 100) / totalVotos;
			float porcentagem2 = (contador2 * 100) / totalVotos;
			float porcentagem3 = (contador3 * 100) / totalVotos;
			System.out.println("Empate entre ROBERTO %" + porcentagem + " ROBERTA %" + porcentagem2 + " e AFONSO %" + porcentagem3);
		} else if (contador1 == contador3 & contador1 == contador4 & contador1 > contador2) {
			float porcentagem = (contador1 * 100) / totalVotos;
			float porcentagem2 = (contador3 * 100) / totalVotos;
			float porcentagem3 = (contador4 * 100) / totalVotos;
			System.out.println("Empate entre ROBERTO %" + porcentagem + " AFONSO %" + porcentagem2 + " e ANA %" + porcentagem3);
		} else if (contador2 == contador3 & contador2 == contador4 & contador2 > contador1) {
			float porcentagem = (contador1 * 100) / totalVotos;
			float porcentagem2 = (contador3 * 100) / totalVotos;
			float porcentagem3 = (contador4 * 100) / totalVotos;
			System.out.println("Empate entre ROBERTA %" + porcentagem + " AFONSO %" + porcentagem2 + " e ANA %" + porcentagem3);
		} else {
			System.out.println("Erro detectado.");
		}
		
	}

}
