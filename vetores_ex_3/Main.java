package vetores_ex_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];

		int contador = 0;
		
		while (contador < 10) {

			System.out.println("Informe o " + (contador + 1) + " número");
			int numero = sc.nextInt();

			boolean valida = false;
			
			for(int i=0; i < numeros.length; i++) {
				if(numeros[i] == numero) {
					valida = true;
					break;
				}
			}

			if(valida == true) {
				System.out.println("O número informado já existe, tente outro.");
			} else {
				numeros[contador] = numero;
				contador++;
			}
		}
		
		sc.close();
		
	}
	
}
