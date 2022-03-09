package ex_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float media;
		
		System.out.print("Insira nota1: ");
		float nota1 = sc.nextFloat();
		System.out.print("Insira nota2: ");
		float nota2 = sc.nextFloat();
		System.out.print("Insira nota3: ");
		float nota3 = sc.nextFloat();
		
		sc.close();
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A média é: " + media);
		
	}
	
}
