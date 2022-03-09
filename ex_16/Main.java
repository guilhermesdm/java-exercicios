package ex_16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor por hora.");
		int valorHora = sc.nextInt();
		
		System.out.println("Quantidade de horas trabalhadas.");
		double horasTrabalhadas = sc.nextInt();
		horasTrabalhadas *= valorHora;
		
		System.out.println("Horas extras de 50%.");
		double horasExtras50 = sc.nextInt();
		horasExtras50 = (horasExtras50 * valorHora) * 1.50;
		
		System.out.println("Horas extras de 100%.");
		double horasExtras100 = sc.nextInt();
		horasExtras100 = (horasExtras100 * valorHora) * 2;
		
		sc.close();
		
		System.out.println("Remuneração por horas trabalhadas: R$" + horasTrabalhadas);
		System.out.println("Remuneração por horas trabalhadas com acréscimo de 50%: R$" + horasExtras50);
		System.out.println("Remuneração por horas trabalhadas com acréscimo de 100%: R$" + horasExtras100);
		
		double salario = horasTrabalhadas + horasExtras50 + horasExtras100;
		
		System.out.println("Salário: R$" + salario);
		
	}
	
}
