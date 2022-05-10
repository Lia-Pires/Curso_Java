package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
	
	
	
	Produto p1 = new Produto();
	p1.nome = "Notebook";
	p1.preco = 4569.78;
	
	
	Produto p2 = new Produto();
	p2.nome = "HeadPhone";
	p2.preco = 523.45;
	
		Produto.desconto = 0.29;
		
			System.out.println(p1.nome + " " + p1.precoComdesconto());
			System.out.println(p2.nome + " " + p1.precoComdesconto());
		

	

	
	
	
	
	
	
	}
}
