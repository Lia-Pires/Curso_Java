package Curso;

import java.util.Scanner;

public class FahrenheitParaCelsius {
	
	public static void main(String[] args) {
		
		
		
		double F, C, F2, C2;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Digite uma temperatura em Fahrenheit: ");
		F = sc.nextDouble();
		
		C = (F-32)/1.8;
		
		
		System.out.printf("Temperatura em Celsius: %.2f °C" , C);
		
		
		
		System.out.print("\nDigite uma temperatura em Celsius: ");
		C2 = sc.nextDouble();
		
		F2 = C2 * 1.8 + 32;
		
		
		System.out.printf("Temperatura em Fahrenheit: %.2f F", F2);
		
		
		
		
		
		
		
		sc.close();
		
	}
	

}
