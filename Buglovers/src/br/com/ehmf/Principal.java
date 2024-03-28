package br.com.ehmf;

import br.com.ehmf.model.Carro;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando com o Java");		
		System.out.println("--------------------");
		
		/*
		boolean condicao = true;
		if(!condicao) { 
			System.out.println("Condição verdadeira!");
		} else { 
			System.out.println("Condição falsa");
		}
		System.out.println("--------------------");
		
		// validar nota do aluno
		int nota = 2;
		if(nota >= 6) {
			System.out.println("Passou de ano!");
		} else if(nota <= 3) {
			System.out.println("Reprovou!");
		} else {
			System.out.println("Recuperação....");
		}
		
		
		switch(nota) {
			case 5:
				System.out.println("Recuperação");
				break;
			case 3:
				System.out.println("Reprovou");
				break;
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.println("Passou!");
				break;
			default:
				System.out.println("Limbo");
				break;
		}
		System.out.println("--------------------");
		
		// estruturas de repetição
		// for; while
		for(int x = 0; x <= 10; x++) {
			System.out.print(x + ", ");
		}
		System.out.println("--------------------");
		
		int z = 0;
		while(z <= 200) {
			System.out.print(z);
			if(z < 200) 
				System.out.print(", ");
			z++;
		}
		System.out.println("--------------------");
		*/
		Carro carroJao = new Carro("Azul","BYD","PLUS"); //instanciei a classe no objeto		
		Carro carroTiao = new Carro("Prata","BYD","PLUS","Automático"); //instanciei a classe no objeto
		
		System.out.println("Jao: " + carroJao.toString());
		System.out.println("Tiao: " + carroTiao.toString());
		
		carroJao.setCor("Vermelho");
		System.out.println("Jao: " + carroJao.toString());
		
		Carro carroMaria = new Carro("Branco", "TESLA","PLUS","AUTOMATICO","2.0");
		System.out.println("Maria: " + carroMaria.toString());
		
	}

}
