package ex_7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		float numero = sc.nextFloat();
		sc.close();
		System.out.println(numero >= 0 ? "N�mero � positivo" : "N�mero � negativo");
	}
}
