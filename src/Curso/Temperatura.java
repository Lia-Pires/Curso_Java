package Curso;
import java.util.Scanner;

public class Temperatura {

	
   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner (System.in);
	
	   // (�F - 32) x 5/9 = �C
	   
	   
	   final double c1 = 32;
	   final double c2 = 5.0/9.0;
	   double F, C;
	   
	   System.out.println("Digite uma temperatura em Fahrenheit: ");
	   F = sc.nextDouble();
	   
	   C = (F-c1) * c2;
	   
	   
	   System.out.println("Esta temperatura em Celsius � de : " + C + "�C." );
	   
	   
	   
	   
}	
}
