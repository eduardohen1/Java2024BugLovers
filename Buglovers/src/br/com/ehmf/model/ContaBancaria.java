package br.com.ehmf.model;

import br.com.ehmf.exception.LimiteCreditoExcedidoException;

public class ContaBancaria {
	
	/**
	 * Esta função irá realizar um saque na conta bancária
	 * do cliente.</br>Se o limite de saque exceder ao limite
	 * estipulado, lançar uma exceção personalizada
	 * @param quantia parâmertro de quantia do saque
	 */
	public void fazerSaque(double quantia) throws LimiteCreditoExcedidoException {
		double limite = 700.0; //Exemplo de limite.
		
		if(quantia > limite) {
			throw new LimiteCreditoExcedidoException(quantia - limite);
		}else {
			System.out.println("Saque realizado com sucesso!");
		}
		
	}
	
}
