package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int N;
	double total = 0;
	double media = 0;

		
	System.out.print("Quantas notas vai digitar? ");
	N = sc.nextInt();
	
	double [] notas = new double [N];
	
	for (int i = 0; i < notas.length; i++) {
		System.out.print("Informe a " + (i + 1) + "a nota : ");
		notas[i] = sc.nextDouble();
			
		
	}
	
	for (double nota: notas) {
		
		total += nota;
		
			
		
	}
	
		media = total / notas.length;
	System.out.printf("A média das notas é: " + media);
	
	
	sc.close();
	
	
	}
}
