package Curso;

import java.util.Scanner;

public class AreaTriangulo {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area;
		
		
		System.out.print("Digite a base do triangulo: ");
		base = sc.nextDouble();
		
		System.out.print("Digite a altura do triangulo: ");
		altura = sc.nextDouble();
		
		
		area = (base*altura)/2;
		
		
		System.out.printf("A Área deste triângulo de de %.2f ", area);
		
		
	}

}
