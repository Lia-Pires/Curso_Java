package Controle;

import java.util.Scanner;

public class estruturaIf {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String  dia;
		
		
		System.out.print("Digite um dia da semana: ");
		dia = sc.next();
		
		
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
			
		}
		
		else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);
			
		}
				
		else if (dia.equalsIgnoreCase("ter�a")) {
			System.out.println(3);
			
		}		
		else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);
			
		}
		else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
			
		}
		else if (dia.equalsIgnoreCase("sextaa")) {
			System.out.println(6);
			
		}
		
		else if (dia.equalsIgnoreCase("s�bado")) {
			System.out.println(7);
			
		}
		
	}
	

}
