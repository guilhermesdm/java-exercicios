package lacos_ex_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe número 1.");
		int num1 = sc.nextInt();

		System.out.println("Informe número 2.");
		int num2 = sc.nextInt();
		sc.close();
		
		int counterNeg = 0;
		int counterPos = 0;
		
		if (num1 < num2) {
			do {
				if (num1 < 0) {
					counterNeg += 1;
				} else {
					counterPos += 1;
				}

				System.out.println(num1);
				num1 += 1;
			} while (num1 <= num2);
			
		} else {
			do {
				System.out.println(num2);
				num2 += 1;
			} while (num2 <= num1);
		}

		System.out.println("Números negativos: " + counterNeg);
		System.out.println("Números positivos: " + counterPos);
	}
}
