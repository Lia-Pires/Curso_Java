package Curso;

import java.util.Scanner;

public class desafiowhile {
	
	public static void main(String[] args) {
		
		double nota, media, soma, quant;
		
		Scanner sc = new Scanner(System.in);
		
		
		nota = 0;
		soma = 0;
		quant = 0;
		
		System.out.println("Digite uma nota v�lida (de 0 a 10 e -1 para sair)" );
		nota = sc.nextDouble();
		
		
		if (nota > 10 && nota != -1) {System.out.println("Nota Inv�lida."); }
		
		else {
		
		while (nota >= 0 && nota <= 10) {
			
			  
			soma = nota + soma;
			quant = quant + 1;
			
			System.out.println("Digite uma nota v�lida (de 0 a 10 e -1 para sair)" );
			nota = sc.nextDouble();
			
			if (nota > 10 && nota != -1) {System.out.println("Nota Inv�lida."); }
			
			
		}
		}
		media = soma/quant;
		
		
		System.out.println("M�dia da turma: " + media);
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
	}
	

}
