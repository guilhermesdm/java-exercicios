package vetores_ex_11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[][] produtos = new String[50][3];

		boolean continuar = true;
		int contador = 0;

		do {
			System.out.println(
					"Você quer\n1 - Cadastrar\n2 - Listar os produtos\n3 - Alterar produto\n4 - Remover produto\n5 - Sair do sistema");
			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do produto");
				String nome = sc.next();
				System.out.println("Digite o valor do produto");
				String valor = sc.next();
				System.out.println("Digite a marca do produto");
				String marca = sc.next();

				produtos[contador][0] = nome;
				produtos[contador][1] = valor;
				produtos[contador][2] = marca;

				System.out.println("Produto adicionado.");

				contador = contador + 1;
				break;
			case 2:
				if (produtos[0][0] == null) {
					System.out.println("Não existem produtos no sistema");
				}

				for (int i = 0; i < produtos.length; i++) {
					if (produtos[i][0] != null) {
						System.out.println("Produto: " + produtos[i][0] + " | Valor: " + produtos[i][1] + " | Marca: "
								+ produtos[i][2]);
					}
				}

				break;
			case 3:
				
				System.out.println("Digite o nome do produto que deseja editar");
				nome = sc.next();
				boolean validar = false;
				int indice = -1;
				
				for (int i = 0; i < produtos.length; i++) {
					if (nome.equals(produtos[i][0])) {
						indice = i;
						validar = true;
					} 
				}
				
				if (validar) {
					System.out.println("Digite o nome do produto");
					nome = sc.next();
					System.out.println("Digite o valor do produto");
					valor = sc.next();
					System.out.println("Digite a marca do produto");
					marca = sc.next();
					
					produtos[indice][0] = nome;
					produtos[indice][1] = valor;
					produtos[indice][2] = marca;
					
					System.out.println("Produto editado.");
				} else {
					System.out.println("Produto inexistente.");
				}
				
				break;
			case 4:
				System.out.println("Insira o nome do produto que deseja remover do sistema.");
				nome = sc.next();
				
				indice = -1;
				validar = false;
				
				for (int i = 0; i < produtos.length; i++) {
					if (nome.equals(produtos[i][0])) {
						indice = i;
						validar = true;
					} 
				}
				
				if(validar) {
					produtos[indice][0] = null;
					System.out.println("Produto removido com sucesso.");
				} else {
					System.out.println("Produto inexistente no sistema.");
				}
				
				break;
			case 5:
				continuar = false;
				System.out.println("Desligado do sistema.");
				break;

			default:
				continuar = false;
				System.out.println("Desligado do sistema.");
				break;
			}

		} while (continuar);

		sc.close();
	}
}
