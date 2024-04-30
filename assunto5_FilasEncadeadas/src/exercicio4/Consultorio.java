package exercicio4;

import java.util.Scanner;

public class Consultorio {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		
		fila.init();
		Paciente pac = new Paciente();
		
		int opcao;
		do {
			System.out.println(" 1 - Inserir paciente na fila");
			System.out.println(" 2 - Atender proximo paciente da fila");
			System.out.println(" 3 - Encerrar atendimento");
			opcao = le.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("Nome: ");
				le.nextLine();
				Paciente pac = le.nextLine();
				fila.enqueue();
				break;
			case 2:
				if (!fila.isEmpty())
					System.out.println("Paciente a ser atendido agora: "+ fila.dequeue());
				else
					System.out.println("Não há pacientes na fila");
				break;
			case 3:
				if (fila.isEmpty())
					System.out.println("Atendimento encerrado");
				else {
					System.out.println("Ainda há pacientes na fila");
					opcao = 0;
				}
				break;
			default:
				System.out.println("Opcao invalida");
			}
		} while (opcao != 3);
		le.close();

	}

}
