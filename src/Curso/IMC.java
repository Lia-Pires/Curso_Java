package Curso;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		
	double peso, altura, imc;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite sua altura: ");
	altura = sc.nextDouble();
	
	System.out.print("Digite seu peso: ");
	peso = sc.nextDouble();
	
	
	imc = peso / (Math.pow(altura, 2));
			
		System.out.printf("IMC é de %.2f ", imc);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
