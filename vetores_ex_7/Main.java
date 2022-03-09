package vetores_ex_7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matriz = { 
				{ 1, 2, 3, 4, 1 }, 
				{ 1, 2, 3, 2, 5 }, 
				{ 1, 2, 3, 4, 5 }, 
				{ 1, 4, 3, 4, 5 },
				{ 5, 2, 3, 4, 5 } 
				};

		int resultado = 0;

		for (int i = 0; i < matriz.length; i++) {
			int soma = 0;
			for (int j = 0; j < matriz.length; j++) {
				soma = soma + matriz[i][j];
			}
			resultado = resultado + soma;
		}
		int media = resultado / 25;
		int contador = 0;

		System.out.println("Soma: " + resultado);
		System.out.println("Média dos valores da matriz: " + media);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] >= media) {
					contador++;
				}
			}
		}

		System.out.println("Valores maiores ou iguais a média: " + contador);
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Diagonal principal: " + matriz[i][i]);
		}

		
		for (int i = 4; i > -1; i--) {
			System.out.println("Diagonal secundária: " + matriz[i][i]);
		}
		
		sc.close();

	}

}
