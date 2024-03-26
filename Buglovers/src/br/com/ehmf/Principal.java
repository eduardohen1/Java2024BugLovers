package br.com.ehmf;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando com o Java");
		
		System.out.println("--------------------");
		
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
		
	}

}
