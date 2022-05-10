package classe;

public class ValorVsReferencia {
	
	
	public static void main(String[] args) {
		
	double a = 2;
	double b = a;   // atribuição por valor
	
	a++;
	b--;
	
	
	
	System.out.println( a + " " + b);
	
	Data d1 = new Data (1, 6, 2022);
			
	Data d2 = d1;   //atribuição por referência
	
			
		
		d1.dia = 31;	
		d2.mes = 12;
		d1.ano = 2025;
		
	
		
		System.out.println(d1.dataFinal());
		System.out.println(d2.dataFinal());	
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.dataFinal());
		System.out.println(d2.dataFinal());	
	
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);  //nao vai gerar nenhum impacto 
	
		
	}
	
	
	static void voltarDataParaValorPadrao(Data d) {  //chamada de metodo
													//evitar
		
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
		
	}
	
	
	static void alterarPrimitivo(int a) {
			
		a++;  //gerou uma copia e nao gerou impacto na linha 41
		
	}
	

}
