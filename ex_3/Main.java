package ex_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um ano: ");
		int ano = sc.nextInt();
		sc.close();
		
		if(ano % 4 == 0) {
			System.out.println("É ano bissexto.");
		} else {
			System.out.println("Não é.");
		}
		
		
	}
	
}
