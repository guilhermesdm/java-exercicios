package vetores_ex_13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[][] pessoas = new String[10][2];

		int soma = 0;

		for (int i = 0; i < pessoas.length; i++) {

			System.out.println("Insira nome: ");
			pessoas[i][0] = sc.next();

			System.out.println("Insira idade: ");
			pessoas[i][1] = sc.next();
			int idade = Integer.parseInt(pessoas[i][1]);

			for (int j = 0; j < pessoas.length; j++) {
				soma = soma + idade;
			}
			
		}

		for (int i = 0; i < pessoas.length; i++) {
			for (int j = i + 1; j < pessoas.length; j++) {
				if (Integer.parseInt(pessoas[j][1]) <  Integer.parseInt(pessoas[i][1])) {
					String nome = pessoas[j][0];
					String idade = pessoas[j][1];
					
					pessoas[j][0] = pessoas[i][0];
					pessoas[j][1] = pessoas[i][1];
					
					pessoas[i][0] = nome;
					pessoas[i][1] = idade;
					
				}
				
			}
			
		}
		
		
		
		soma = soma / 10;
		int media = soma / 10;

		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("Nome: " + pessoas[i][0] + " Idade: " + pessoas[i][1]);
		}

		System.out.println("Mais velho: " + pessoas[9][0] + " com idade de " + pessoas[9][1]);
		System.out.println("Mais jovem: " + pessoas[0][0] + " com idade de " + pessoas[0][1]);
		System.out.println("Média das idades: " + media);
		
		sc.close();

	}

}
