package lacos_ex_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("VAMOS JOGAR? 1 - SIM\n 2 - NÃO");
		int jogar = sc.nextInt();
		int pontosAcertos = 0;
		int pontosErros = 7;
		
		if (jogar == 1) {

			boolean continuar = true;
			while(continuar == true) {
				System.out.println("CHUTE UMA LETRA");
				char letraChutada = sc.next().charAt(0);
				
				if (letraChutada == 'E' | letraChutada == 'S' | letraChutada == 'T' | letraChutada == 'U' | letraChutada == 'D' | letraChutada == 'A' | letraChutada == 'R') {
					System.out.println("Parabéns, você acertou uma letra! Letra " + letraChutada);
					pontosAcertos += 1;
				} else {
					pontosErros = pontosErros - 1;
					System.out.println("Você errou, mais " + pontosErros + " chances.");
				}
				
				if(pontosAcertos == 7) {
					continuar = false;
				} else if (pontosErros == 0) {
					continuar = false;
				} else {
					continuar = true;
				}
				
			}
			
			if(pontosAcertos == 7) {
				System.out.println("Você acertou, a palavra era ESTUDAR");
			} else if (pontosErros == 0) {
				System.out.println("Você perdeu, a palavra era ESTUDAR");
			}
			
		} else {
			System.out.println("JOGO FINALIZADO.");
		}

		sc.close();
	}
}
