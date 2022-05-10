package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		
		// Offer e Add > adicionam elementos na fila
		// Diferen�a � o comportamentro quando a fila est� cheia
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
	}
	

}
