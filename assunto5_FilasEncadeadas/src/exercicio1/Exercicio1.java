package exercicio1;

import java.util.Scanner;

import Filas.FilaInt;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		FilaInt fila = new FilaInt();
		fila.init();
		
		int valor;
		
		System.out.println("Digite valor inteiro positivo para inserir na fila (negativo para sair)");
		valor = entrada.nextInt();
		while(valor >= 0) {
			fila.enqueue(valor);
			System.out.println("Digite valor inteiro positivo para inserir na fila (negativo para sair)");
			valor = entrada.nextInt();
		}
		while(!fila.isEmpty())
			System.out.println("Valor retirado: " + fila.dequeue());
		entrada.close();
	}

}