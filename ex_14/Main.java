package ex_14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu salário?");
		float salario = sc.nextFloat();
		
		System.out.println("Informe a conta de luz: ");
		float luz = sc.nextFloat();
		
		System.out.println("Informe a conta de telefone: ");
		float telefone = sc.nextFloat();
		
		System.out.println("Informe a conta de água: ");
		float agua = sc.nextFloat();
		
		System.out.println("Informe a conta de mercado: ");
		float mercado = sc.nextFloat();
		
		System.out.println("Informe a conta de lazer: ");
		float lazer = sc.nextFloat();
		
		System.out.println("Informe a conta de aluguel: ");
		float aluguel = sc.nextFloat();
		
		sc.close();

		float restoSalario = salario - (luz + telefone + agua + mercado + lazer + aluguel);
	
		System.out.println("Sobrou R$" + restoSalario + " de seu salário.");
	
	}
	
}
