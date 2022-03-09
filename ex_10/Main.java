package ex_10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira lado 1");
		float lado1 = sc.nextFloat();
		
		System.out.println("Insira lado 2");
		float lado2 = sc.nextFloat();
		
		System.out.println("Insira lado 3");
		float lado3 = sc.nextFloat();
		
		sc.close();
		
		if (lado1 == lado2 & lado1 == lado3) {
			System.out.println("É um triângulo Equilátero.");
		} else if ( (lado1 == lado2 & lado2 != lado3) | (lado1 == lado3 & lado3 != lado2) | (lado2 == lado3 & lado2 != lado1)) {
			System.out.println("É um triângulo Isósceles.");
		} else {
			System.out.println("É um triângulo Escaleno.");
		}
	}
	
}
