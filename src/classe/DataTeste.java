package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		
		Data d1 = new Data (31, 12, 2020);
		
		System.out.println(d1.dataFormatada());
		
		
		
		Data d2 = new Data();
			
		
		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
		System.out.println();
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
	 	
	}
	
	
	

}
