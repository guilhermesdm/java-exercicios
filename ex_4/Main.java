package ex_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("N�mero 1: ");
		float numero1 = sc.nextFloat();		
		System.out.print("N�mero 2: ");
		float numero2 = sc.nextFloat();
		System.out.print("N�mero 3: ");
		float numero3 = sc.nextFloat();

		if (numero1 > numero3 & numero2 > numero3) {
			System.out.println(numero3 + " � o menor");
		} else if(numero3 > numero2 & numero1 > numero2) {
			System.out.println(numero2 + " � o menor");
		} else { 
			System.out.println(numero1 + " � o menor");
		}
		
		sc.close();
	}
	
}
