package ex_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe nota 1: ");
		float nota1 = sc.nextFloat();		
		
		System.out.print("Informe nota 2: ");
		float nota2 = sc.nextFloat();	
		
		System.out.print("Informe nota 3: ");
		float nota3 = sc.nextFloat();	
		
		System.out.print("Informe nota 4: ");
		float nota4 = sc.nextFloat();	
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println(media);
		if(media >= 7) {
			System.out.println("Aprovado");
		} else if (media >= 5 & media <= 6.9) {
			System.out.println("Exame");
		} else {
			System.out.println("Reprovado");
		}
		
		sc.close();
		
	}
	
}
