package br.com.ehmf.model;

public class Funcionario extends Pessoa {
	
	private Double salario;
	
	public Double getSalario() {
		return this.salario;
	}
	
	public Funcionario(Double salario, String nome, String telefone, String email) {
		super(nome, email, telefone);
		this.salario = salario;
	}
	
	public Funcionario(Double salario, String nome, String telefone) {
		super(nome, telefone);
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Nome: "      + super.getNome()     + "\n" + 
	           "Telefone: "  + super.getTelefone() + "\n" + 
			   "E-mail: "    + super.getEmail()    + "\n" + 
	           "Salario: R$" + this.salario; 
	}

}
