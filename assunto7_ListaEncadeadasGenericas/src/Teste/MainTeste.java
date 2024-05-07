package Teste;

import java.util.Scanner;

import listas.ListaCrescenteInt;

public class MainTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		ListaCrescenteInt lista = new ListaCrescenteInt();
		int valor;
		System.out.println("Valor positivo insere na lista, negativo encerra: ");
		valor = entrada.nextInt();
		while (valor >= 0) {
			lista.add(valor);
			lista.show();
			System.out.println("Valor positivo insere na lista, negativo encerra: ");
			valor = entrada.nextInt();
			
		}
		entrada.close();
		

	}

}
