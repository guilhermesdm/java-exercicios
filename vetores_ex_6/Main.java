package vetores_ex_6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String tabuleiro[][] = {
			{"1", "2", "3"},
			{"4", "5", "6"},
			{"7", "8", "9"},
		};
		
		String jogada1 = tabuleiro[0][0];
		String jogada2 = tabuleiro[0][1];
		String jogada3 = tabuleiro[0][2];
		String jogada4 = tabuleiro[1][0];
		String jogada5 = tabuleiro[1][1];
		String jogada6 = tabuleiro[1][2];
		String jogada7 = tabuleiro[2][0];
		String jogada8 = tabuleiro[2][1];
		String jogada9 = tabuleiro[2][2];
		
//		System.out.println(jogada1);
//		System.out.println(jogada2);
//		System.out.println(jogada3);
//		System.out.println(jogada4);
//		System.out.println(jogada5);
//		System.out.println(jogada6);
//		System.out.println(jogada7);
//		System.out.println(jogada8);
//		System.out.println(jogada9);
		
//		8 alternativas de vitória

		boolean jogo = true;
		
		while(jogo == true) {
			
			System.out.println("Jogador X: (jogada1 a jogada9) ");
			String jogada = sc.next();
			
			for (int i = 0; i < tabuleiro.length; i++) {
				
				for (int j = 0; j < tabuleiro.length; j++) {
					
					System.out.println(jogada);
					
				}
				
			}
			
		}
		
		sc.close();
		
	}
	
}
