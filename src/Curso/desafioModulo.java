package Curso;

import java.util.Scanner;


public class desafioModulo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, resultado;
		
		String op;
		
		
		System.out.print("Digite o primeiro operando: ");
		n1 = sc.nextDouble();
		
		System.out.print("Digite o operador: ");
		op = sc.next();
		
		System.out.print("Digite o segundo operando: ");
		n2 = sc.nextDouble();
	
		
		resultado = "+".equals(op) ? n1 + n2 : 0;
		resultado = "-".equals(op) ? n1 - n2 : resultado;
		resultado = "*".equals(op) ? n1 * n2 : resultado;
		resultado = "/".equals(op) ? n1 / n2 : resultado;
		resultado = "%".equals(op) ? n1 % n2 : resultado;
		
		
		System.out.printf("%.2f %s %.2f = .2f", n1, op, n2, resultado);
		
		
		
		
		
		
		sc.close();
		
		
		
				
				
		
		
		
		
	}

}
