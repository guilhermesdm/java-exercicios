package lacos_ex_7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual ser� a sua aplica��o inicial?");
		float inicial = sc.nextFloat();
		
		System.out.println("Qual a taxa de juros mensal?");
		float taxa = sc.nextFloat();
		taxa = taxa/100;
		
		System.out.println("Quanto ser� o tempo da aplica��o?");
		int tempo = sc.nextInt();
		sc.close();

		float total = inicial;
		
		for(int i=1; i <= tempo; i++) {
			float ganhos = total * taxa;
			total += ganhos;
			System.out.println("M�s " + i + " ganhos: " + ganhos + " total: " + total);
		}
		
	}
	
}
