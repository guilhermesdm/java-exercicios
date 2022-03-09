package ex_13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Temperatura atual.");
		float temperatura = sc.nextFloat();
		
		System.out.println("1 - Fahrenheit para Celsius\n2 - Celsius para Fahrenheit");
		int tipoConversao = sc.nextInt();
		sc.close();
		
		switch(tipoConversao) {
			case 1:
				double celsius = ((temperatura - 32) / 1.8);
				System.out.println("A temperatura em Celsius está " + celsius + "°");
			break;
			case 2:
				double fahrenheit = (temperatura * 1.8) + 32;
				System.out.println("A temperatura em Fahrenheit está " + fahrenheit+ "°");
			break;
			default:
				System.out.println("Algo deu errado, tente novamente.");
		}
		
	}
}
