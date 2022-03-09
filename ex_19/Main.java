package ex_19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o seu peso:");
		float peso = sc.nextFloat();
		
		System.out.print("Informe a sua altura:");
		float altura = sc.nextFloat();

		float imc = peso / (altura * altura);
		
		if(imc < 17.5) {
			System.out.println("Abaixo do peso. IMC = " + imc);
		} else if (imc >= 17.5 & imc < 25) {
			System.out.println("Peso normal. IMC = " + imc);
		} else if (imc > 25 & imc < 30) {
			System.out.println("Acima do peso. IMC = " + imc);
		} else if (imc >= 30 & imc < 35) {
			System.out.println("Obesidade 1. IMC = " + imc);
		} else if (imc >= 35 & imc < 40) {
			System.out.println("Obesidade 2. IMC = " + imc);
		} else {
			System.out.println("Obesidade 3. IMC = " + imc);
		}
		
		sc.close();
		
	}
	
}
