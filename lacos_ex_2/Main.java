package lacos_ex_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número.");
		int numero = sc.nextInt();
		
		for(int i=1; i <= 10; i++) {
			System.out.println(i + " sucessor = " + (numero + i) + " " + i + " antecessor = " + (numero - i));
		}
		
		sc.close();
	}
}
