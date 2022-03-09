package vetores_ex_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][] dados = new String[10][10];
		
		int continuar = 1;
		int contador = 0;
		
		while(continuar == 1) {
			System.out.println("Digite um nome.");
			dados[contador][0] = sc.next();
			
			System.out.println("Digite a idade.");
			dados[contador][1] = sc.next();
			
			System.out.println("Deseja sair do loop?\n0 - Sim\n1 - Não");
			continuar = sc.nextInt();
			
			contador++;
			
			if (contador == 10) {
				break;
			}
		}
		
		for (int i = 0; i < dados.length; i++) {
			if (dados[i][0] == null & dados[i][1] == null) {
				break;
			} else {
				System.out.print(dados[i][0] + " ");
				System.out.println(dados[i][1]);
			}
		}
		
		
		sc.close();
	}
}
