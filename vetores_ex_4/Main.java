package vetores_ex_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nomes = new String[100];
		int contador = 0;

		boolean continuar = true;
		while (continuar == true) {
			
			System.out.println("Insira um nome");
			nomes[contador] = sc.next();
			
			System.out.println("Deseja parar?\n1 - Sim\n2 - Não");
			int desejaParar = sc.nextInt();
			
			if(desejaParar == 1) {
				continuar = false;
			} else {
				continuar = true;
			}

			contador++;
		}

		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i] == null) {
				break;
			} else {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}
}
