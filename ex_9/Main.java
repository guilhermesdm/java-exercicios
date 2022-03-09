package ex_9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Informe a velocidade máxima da rodovia.");
		float velMax = sc.nextFloat();		
		
		System.out.println("Informe a velocidade do carro.");
		float velCarro = sc.nextFloat();
		sc.close();

		if (velCarro <= velMax) {
			System.out.println("Bom motorista.");
		} else if (velCarro > velMax & velCarro <= velMax + 10) {
			System.out.println("Multa de R$ 50,00.");
		} else if (velCarro > velMax + 10 & velCarro <= velMax + 20) {
			System.out.println("Multa de R$ 100,00.");
		} else {
			System.out.println("Multa de R$ 200,00.");
		}
		
		
		
	}
	
}
