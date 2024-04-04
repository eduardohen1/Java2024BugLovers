package br.com.ehmf.AppProdutos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true) //criando campo index
	private String codigoBarras;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
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
