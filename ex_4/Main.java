package ex_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Número 1: ");
		float numero1 = sc.nextFloat();		
		System.out.print("Número 2: ");
		float numero2 = sc.nextFloat();
		System.out.print("Número 3: ");
		float numero3 = sc.nextFloat();

		if (numero1 > numero3 & numero2 > numero3) {
			System.out.println(numero3 + " é o menor");
		} else if(numero3 > numero2 & numero1 > numero2) {
			System.out.println(numero2 + " é o menor");
		} else { 
			System.out.println(numero1 + " é o menor");
		}
		
		sc.close();
	}
	
}
