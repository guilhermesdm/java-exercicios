package vetores_ex_9;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[][] palavras = { { 'a', 'm', 'a', 'p', 'a' }, { 'q', 'u', 'i', 'l', 'o' }, { 'a', 's', 's', 'a', 'r' }, };
		
		Random aleatorio = new Random();
		int palavra = aleatorio.nextInt(3);

		int pontosAcertos = 0;
		int pontosErros = 5;

		System.out.println("Jogar\n1 - SIM\n2 - NÃO");
		int jogar = sc.nextInt();

		if (jogar == 1) {

			boolean continuar = true;

			while (continuar == true) {

				System.out.println("SORTEANDO PALAVRA");

				System.out.println("Chute uma letra");

				char chute = sc.next().charAt(0);
				boolean valida = false;
				
				for (int i = 0; i < palavras[palavra].length; i++) {					
					if (chute == palavras[palavra][i]) {
						valida = true;
					} 
				}
				
				if (valida) {
					System.out.println("Parabéns, você acertou uma letra! Letra " + chute);
					pontosAcertos += 1;
				} else {
					pontosErros -= 1;
					System.out.println("Você errou, mais " + pontosErros + " chances.");
				}
				
				if (pontosAcertos == palavras[palavra].length) {
					continuar = false;
				} else if (pontosErros == 0) {
					continuar = false;
				} else {
					continuar = true;
				}
			
			}
			
			if (pontosAcertos == palavras[palavra].length) {
				System.out.println("Você acertou!");
			} else if (pontosErros == 0) {
				System.out.println("Você perdeu.");
			}

		} else {
			System.out.println("Jogo finalizado.");
		}

		sc.close();
	}
}
