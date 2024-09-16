package aplicacao;

import java.util.Scanner;

import arvores.ABBINT;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		ABBINT abb = new ABBINT();
		int opcao;
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir");
			System.out.println("2 - Apresentar ABB");
			System.out.println("3 - Apresenta quantidade de nos na ABB");
			System.out.println("4 - Pesquisa a presenca de um valor na ABB");
			System.out.println("5 - Conta quantidade de comparacoes para pesquisar valor na ABB");
			System.out.println("6 - Valor a ser removido da ABB");
			System.out.println("7 - Apresenta máximo valor contido na ABB");
			System.out.println("8 - Apresenta mínimo valor contido na ABB");
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Encerrado o programa!");
				break;
			case 1:
				System.out.print("Valor a ser inserido: ");
				int valor = le.nextInt();
				abb.root = abb.inserir(abb.root, valor);
				break;
			case 2:
				System.out.println("\n *** Apresentacao da ABB em ordem crescente ***");
				abb.show(abb.root);
				System.out.println("\n");
				break;
			case 3:
				int n = abb.contaNos(abb.root, 0);
				System.out.println("A quantidade de nos na ABB = "+ n);
				break;
			case 4:
				System.out.print("Valor a ser pesquisado na ABB: ");
				valor = le.nextInt();
				if (abb.consulta(abb.root, valor))
					System.out.println("Valor esta presente na ABB");
				else
					System.out.println("Valor NAO esta presente na ABB");
				break;
			case 5:
				System.out.print("Valor a ser pesquisado na ABB: ");
				valor = le.nextInt();
				int cont = abb.contaConsulta(abb.root, valor, 0);
				System.out.println("Quantidade de comparacoes realizadas: "+ cont);
				break;
			case 6: 
				System.out.println("Valor a ser removido na ABB");
				valor = le.nextInt();
				abb.root = abb.removeValor(abb.root, valor);
				break;
			case 7:
				if (abb.root != null)
					System.out.println("O maximo valor = "+ abb.maximo());
				else 
					System.out.println("ABB esta vazia");
				break;
			case 8: 
				if (abb.root != null)
					System.out.println("O minimo valor = "+ abb.minimo());
				else 
					System.out.println("ABB esta vazia");
				break;
			default:
				System.out.println("Opcao invalida");
			}
		} while (opcao != 0);

		le.close();

	}

}
