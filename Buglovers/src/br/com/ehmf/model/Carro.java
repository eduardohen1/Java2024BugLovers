package br.com.ehmf.model;

public class Carro {
	//Atributos
	private String cor;
	private String marca;
	private String modelo;
	private String cambio;
	private String motor;
	
	//métodos
	public void andar() {
		System.out.println("Carro andando...");
	}
	
	public void parar() {
		System.out.println("Carro parado...");
	}
	
	//construtor
	public Carro(String cor, String marca, String modelo) {
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
		this.cambio = "Manual";
		this.motor = "1.0";
	}
	
	public Carro(String cor, String marca, String modelo, String cambio) {
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
		this.cambio = cambio;
		this.motor = "1.0";
	}

	public Carro(String cor, String marca, String modelo, String cambio, String motor) {
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
		this.cambio = cambio;
		this.motor = motor;
	}

	//GETs SETs
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	
	public String getMotor() {
		return this.motor;
	}

	@Override
	public String toString() {
		String retorno = "[cor: "    + this.cor     + ", " +
	                      "marca: "  + this.marca   + ", " +
				          "modelo: " + this.modelo  + ", " +
	                      "Câmbio: " + this.cambio  + ", " + 
				          "Motor: "  + this.motor   +
				          "]";
		return retorno;
	}
}
