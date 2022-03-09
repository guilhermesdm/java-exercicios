package ex_11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor total da compra.");
		double valorTotal = sc.nextDouble();
		
		System.out.println("Qual a forma de pagamento?");
		System.out.println("1 - À vista");
		System.out.println("2 - A prazo");
		
		int formaPagamento = sc.nextInt();
		
		sc.close();
	
		if (formaPagamento == 1 && valorTotal >= 200) {
			valorTotal = (valorTotal * 0.9);
			System.out.println("Desconto de 10%. Valor total: " + valorTotal);
		} else if (formaPagamento == 2) {
			System.out.println("Sem desconto. Valor total: " + valorTotal);
		} else if (formaPagamento == 1) {
			System.out.println("Sem desconto. Valor total: " + valorTotal);
		} else {
			System.out.println("Algo deu errado. Tente novamente.");
		}
		
	}
	
}
