package ex_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N�mero 1: ");
		float numero1 = sc.nextFloat();
		System.out.print("N�mero 2: ");
		float numero2 = sc.nextFloat();
		sc.close();
		
		if(numero1 == numero2) {
			float soma = numero1 + numero2;
			System.out.println("A soma �: " + soma);
		} else {
			System.out.println("Os n�meros s�o diferentes.");
		}
	}
}
