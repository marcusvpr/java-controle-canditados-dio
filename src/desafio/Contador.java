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
			
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			
			int parametroDois = terminal.nextInt();
			
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
			//
		} catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
			//
			System.out.println("Erro o primeiro parâmetro é maior que o segundo");
			
			throw new ParametrosInvalidosException("Erro o primeiro parâmetro é maior que o segundo");
		}
		
		int contagem = 0; // parametroDois - parametroUm;
		
		//realizar o for para imprimir os números com base na variável contagem
		for (int i = parametroUm; i <= parametroDois; i++) {
			//
			contagem++; 
		    System.out.println("Imprimindo o número: " + contagem + " (" + i + ")");
		}
	}
}