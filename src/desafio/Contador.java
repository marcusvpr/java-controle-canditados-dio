package desafio;

import java.util.Scanner;

import desafio.exceptions.ParametrosInvalidosException;

public class Contador {
	//
	public static void main(String[] args) {
		//
		try (
			//
			Scanner terminal = new Scanner(System.in)) {
			
			System.out.println("Digite o primeiro par�metro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo par�metro");
			
			int parametroDois = terminal.nextInt();
			
			//chamando o m�todo contendo a l�gica de contagem
			contar(parametroUm, parametroDois);
			//
		} catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo par�metro deve ser maior que o primeiro
			System.out.println("O segundo par�metro deve ser maior que o primeiro");
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm � MAIOR que parametroDois e lan�ar a exce��o
		if (parametroUm > parametroDois) {
			//
			System.out.println("Erro o primeiro par�metro � maior que o segundo");
			
			throw new ParametrosInvalidosException("Erro o primeiro par�metro � maior que o segundo");
		}
		
		int contagem = 0; // parametroDois - parametroUm;
		
		//realizar o for para imprimir os n�meros com base na vari�vel contagem
		for (int i = parametroUm; i <= parametroDois; i++) {
			//
			contagem++; 
		    System.out.println("Imprimindo o n�mero: " + contagem + " (" + i + ")");
		}
	}
}