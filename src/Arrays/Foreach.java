package arrays;

import java.util.Iterator;

public class Foreach {
	
	public static void main(String[] args) {
		
		double [] notas = {9.9, 8.7, 7.2, 9.4};
		
		
		 for (int j = 0; j < notas.length; j++) {
			 System.out.print(notas[j] + " ");
			
			 
		}
		 
		 
		System.out.println();
		
		
		
		for (double nota : notas) {
			
		
			
			
			System.out.print(nota + " ");
		
			
			
		}
	
		
	}

}
