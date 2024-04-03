package br.com.ehmf.AppProdutos.model;

public class Produto {
	
	private Long id;
	private String codigoBarras;
	private String nome;
	private Double preco;
	
	public Produto() {}

	public Produto(Long id, String codigoBarras, String nome, Double preco) {
		this.id = id;
		this.codigoBarras = codigoBarras;
		this.nome = nome;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Produto: [id: " + this.id + ", " +
	                     "nome: " + this.nome + ", " +
				         "codigoBarras: " + this.codigoBarras + ", "+
	                     "preco: R$" + this.preco + "]";
	}
	
	
	
}
