package classe;

public class Produto {


	String nome;
	double preco;
	static double desconto = 0.25;

	
	
	Produto(){
		
	 	}
	
	Produto (String nome, double preco) {
				
			
	}
	
	double precoComdesconto() {
		return preco * (1-desconto);
	}
	
	double precoComDEsconto (double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
		
	}
	
	
	}
	
	

