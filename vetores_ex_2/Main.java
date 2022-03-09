package vetores_ex_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];

		System.out.println("Escreva 5 números");

		for (int i = 0; i < 5; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
		
		for (int i : array) {
			System.out.println(i);
		}
		
		
		sc.close();
	}

}
