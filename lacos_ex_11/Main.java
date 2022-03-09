package lacos_ex_11;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random aleatorio = new Random();
		int valor = aleatorio.nextInt(100) + 1;

		System.out.println("Vamos jogar");
		System.out.println("Chute um n�mero");
		System.out.println(valor);
		int chute = sc.nextInt();
		
		int contador = 0;
		
		while (chute != valor) {
			contador += 1;
			
			if (chute > valor) {
				System.out.println("Quase, jogue mais baixo!");
			} else if (chute < valor) {
				System.out.println("Tente mais alto!");
			} 
			
			System.out.println("Chute um n�mero");
			chute = sc.nextInt();
		}
		
		System.out.println("Parab�ns! O n�mero era " + valor + " e voc� acertou em " + contador + " tentativa(s)");
		sc.close();
	}
	
}
