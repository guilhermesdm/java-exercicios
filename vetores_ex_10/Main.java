package vetores_ex_10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe um valor: ");
			vetor[i] = sc.nextInt();
		}
		
		for (int j = 9; j >= 0; j--) {
			System.out.println(vetor[j]);
		}
		sc.close();
	}
}
