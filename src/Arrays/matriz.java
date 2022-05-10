package arrays;

import java.util.Scanner;

public class matriz {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos alunos? ");
		int qtdeAlunos = sc.nextInt();
		
		System.out.print("Quantas notas por aluno? ");
		int qtdeNotas = sc.nextInt();
		
		
		double[][] notasDaTurma = new double [qtdeAlunos][qtdeNotas];
		
		
		double total  = 0;
		for (int i = 0; i < qtdeAlunos; i++) {
			for (int j = 0; j < qtdeNotas; j++) {
				System.out.printf("Informe a nota " + (j+1) + " do aluno " + (i+1) + ": ");
				
				notasDaTurma [i] [j] = sc.nextDouble();
				
				total += notasDaTurma[i][j];
				
			}				
					
			
			
			
		}
		
		System.out.println();
		for (int i = 0; i < qtdeAlunos; i++) {
			for (int j = 0; j < qtdeNotas; j++) {
								
				System.out.print(notasDaTurma[i][j] + " ");				
			}			
				System.out.println();
			
			
			
		}
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("A Média da turma é " + media);
		
	
		
		
		sc.close();
		
		
		
	}
	

}
