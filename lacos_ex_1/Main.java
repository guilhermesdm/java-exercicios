package lacos_ex_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um n�mero");
		int numero = sc.nextInt();
		
		for(int i=1; i <= 10; i++) {
			System.out.println("A tabuada de " + i + " do n�mero " + numero + " � " + numero * i);
		}
		
		sc.close();
	}
	
}
