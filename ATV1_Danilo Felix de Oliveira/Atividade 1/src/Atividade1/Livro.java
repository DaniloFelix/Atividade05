package Atividade1;


public class Livro {
	
	private String nome;
	private Autor autor;
	private double preco;
	private int qtyInStock;
	
	public Livro(String nome, double preco, int qtyInStock, Autor autor) {
		
		this.nome = nome;
		this.preco = preco;
		this.qtyInStock = qtyInStock;
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	@Override
	public String toString() {
		return "Livro : [nome= " + nome + ", preco=" + preco + ", qtyInStock=" + qtyInStock + "]"
				+autor.toString();
	}

}
