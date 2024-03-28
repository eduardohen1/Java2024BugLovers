package br.com.ehmf.model;

public class Pessoa {
	
	private String nome;
	private String email;
	private String telefone;
	
	
	//Construtores
	public Pessoa(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = "-";
	}

	//Gets Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//Ajustar o toString
	@Override
	public String toString() {
		return "nome: "     + this.nome     + "\n" + 
			   "telefone: " + this.telefone + "\n" +
			   "e-mail: "   + this.email;
	}
	
}
