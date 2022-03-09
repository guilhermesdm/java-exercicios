package ex_6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a atual no fuso UTC -3");
		int hora = sc.nextInt();
		
		System.out.println("Insira a cidade");
		String cidade = sc.next();
		
		sc.close();
		
		switch(cidade.toLowerCase()) {
			case "paris":
				int fuso = 3;
				int horario = (hora + fuso);
				
				if (horario > 24) {
					horario = horario - 24;
				} 
			
				System.out.println("Em Paris são " + horario + " horas");
			break;
			case "londres":
				fuso = 12;
				horario = (hora + fuso);

				if (horario > 24) {
					horario = horario - 24;
				} 
			
				System.out.println("Em Londres são " + horario + " horas");
			break;
			case "pequim":
				fuso = -1; 
				horario = (hora + fuso);
				
				if (horario > 24) {
					horario = horario - 24;
				}
				
				System.out.println("Em Pequim são " + horario + " horas");
			break;
			default:
				System.out.println("Cidade não encontrada");
		}
	}
	
}
