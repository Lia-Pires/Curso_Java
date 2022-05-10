package Curso;

import java.util.Scanner;

public class whiledesafio {
	
	
	public static void main(String[] args) {
		
		String frase;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite algo:");
		frase = sc.next();
		
		while (!frase.equalsIgnoreCase("sair")) {
			
			System.out.println("Blablabla");
			
			System.out.print("Digite algo:");
			frase = sc.next();
			
			
			
			
			sc.close();
			
			
			
			
		}
		
		System.out.println("Fim.");
		
		
	}

}
