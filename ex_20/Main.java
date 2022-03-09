package ex_20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a dist�ncia.");
		float distancia = sc.nextFloat();
		
		System.out.println("1 - Milhas para quil�metros.\n2 - Quil�metros para milhas.");
		int tipoConversao = sc.nextInt();
	
		switch (tipoConversao) {
		case 1:
			distancia *= 1.609;
			System.out.println("A dist�ncia de milhas para quil�metros aproximada � " + distancia);
			break;
		case 2: 
			distancia /= 1.609;
			System.out.println("A dist�ncia de quil�metros para milhas aproximada � " + distancia);
		break;
		default:
			System.out.println("Algo deu errado, tente novamente.");
			break;
		}
		
		sc.close();
	}
	
}
