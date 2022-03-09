package ex_15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe número 1.");
		float num1 = sc.nextFloat();
		
		System.out.println("Informe número 2.");
		float num2 = sc.nextFloat();
		
		System.out.println("Informe número 3.");
		float num3 = sc.nextFloat();
		
		sc.close();
		
		if (num1 > num2 & num1 > num3 & num2 > num3) {
			System.out.println(num1 + " " + num2 + " " + num3);
		} else if (num1 > num3 & num1 > num2 & num3 > num2) {
			System.out.println(num1 + " " + num3 + " " + num2);
		} else if (num2 > num1 & num2 > num1 & num1 > num3) {
			System.out.println(num2 + " " + num1 + " " + num3);
		} else if (num2 > num3 & num2 > num1 & num3 > num1) {
			System.out.println(num2 + " " + num3 + " " + num1);
		} else if (num3 > num1 & num3 > num2 & num1 > num2) {
			System.out.println(num3 + " " + num1 + " " + num2);
		} else {
			System.out.println(num3 + " " + num2 + " " +num1);
		}
	}
}
