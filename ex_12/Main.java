package ex_12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira lado1: ");
		float lado1 = sc.nextFloat(); 		
		
		System.out.println("Insira lado2: ");
		float lado2 = sc.nextFloat(); 
		
		System.out.println(lado1 == lado2 ? "� um quadrado" : "N�o � um quadrado");
			
		sc.close();
	
	}


}
