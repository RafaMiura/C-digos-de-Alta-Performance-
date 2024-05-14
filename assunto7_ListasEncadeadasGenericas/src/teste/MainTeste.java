package teste;

import java.util.Scanner;

import listas.ListaCrescenteInt;

public class MainTeste {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		ListaCrescenteInt lista = new ListaCrescenteInt();
		int valor;
		System.out.print("Valor positivo insere na lista, negativo encerra: ");
		valor = le.nextInt();
		while (valor >= 0) {
			lista.add(valor);	
			System.out.println("A quantidade de nos da lista: "+ lista.contaNos()); 
			lista.show();
			System.out.print("Valor positivo insere na lista, negativo encerra: ");
			valor = le.nextInt();
		}
		
		System.out.print("Valor limite para pesquisar na lista valores maiores do que o limite: ");
		valor = le.nextInt();
		lista.showGreaters(valor);
		
		
		System.out.print("Valor positivo remover da lista, negativo encerra: ");
		valor = le.nextInt();
		while (valor >=0) {
			if (lista. remove(valor));
			System.out.println("Valor removido com sucesso!");
			lista.show();
			System.out.print("Valor positivo remover da lista, negativo encerra: ");
			valor = le.nextInt();
		}
		
		le.close();
	}

}
