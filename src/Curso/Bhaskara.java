package Curso;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a, b, c, x1, x2, delta;

			System.out.print("Digite o valor de a: ");
			a = sc.nextDouble();
			
			System.out.print("Digite o valor de b: ");
			b = sc.nextDouble();
			
			System.out.print("Digite o valor de c: ");
			c = sc.nextDouble();
		
		
				delta = (Math.pow(b, 2)) - (4 * a * c);
				
				x1 = (-b + (Math.sqrt(delta))) / 2*a;
				
				x2 = (-b - (Math.sqrt(delta))) / 2*a;
				
				
				System.out.printf("O valor de x1 é %.2f e o de x2 é %.2f", x1, x2);
				
				
				
		
		
	}

}
