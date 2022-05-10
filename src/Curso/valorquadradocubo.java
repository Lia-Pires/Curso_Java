package Curso;

import java.util.Scanner;

public class valorquadradocubo {

	public static void main(String[] args) {
		
		
	double valor, vcubo, vquadrado;
	
	
	Scanner sc = new Scanner(System.in);
	
	
	
		
	
	System.out.println("Digite um valor: ");
	valor = sc.nextDouble();
	
		
		
	vcubo = Math.pow(valor, 3);
	vquadrado = Math.pow(valor, 2);
	
	
	System.out.printf("O valor ao quadrado é %.2f e ao cubo %.2f ." , vquadrado, vcubo);
		
	}
	
	
	
	
}
