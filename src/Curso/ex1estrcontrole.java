package Curso;

import java.util.Scanner;

public class ex1estrcontrole {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número de 1 a 10: ");				
		numero = sc.nextInt();
		
		
		if (numero >= 0 && numero <= 10) { 
			
			if (numero % 2 != 0) {
				System.out.println("Impar");
				
					}
			else { 
				System.out.println("Par");
				
			
			
		}
		
	}	
		
		
		
		
		
		
		sc.close();
		
	}

}
