package ex_18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nota do primeiro trabalho: ");
		float nota1 = sc.nextFloat();

		System.out.print("Nota do segundo trabalho: ");
		float nota2 = sc.nextFloat();
		
		System.out.println(nota1 > 7 & nota2 > 7 ? "Aprovado" : "Reprovado" );
		
		sc.close();

	}
}
