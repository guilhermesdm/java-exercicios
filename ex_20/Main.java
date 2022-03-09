package ex_20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a distância.");
		float distancia = sc.nextFloat();
		
		System.out.println("1 - Milhas para quilômetros.\n2 - Quilômetros para milhas.");
		int tipoConversao = sc.nextInt();
	
		switch (tipoConversao) {
		case 1:
			distancia *= 1.609;
			System.out.println("A distância de milhas para quilômetros aproximada é " + distancia);
			break;
		case 2: 
			distancia /= 1.609;
			System.out.println("A distância de quilômetros para milhas aproximada é " + distancia);
		break;
		default:
			System.out.println("Algo deu errado, tente novamente.");
			break;
		}
		
		sc.close();
	}
	
}
