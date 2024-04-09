package exercicio5;

public class Consultorio {
	package exercicio3;

	import java.util.Scanner;

	import filas.FilaInt;

	public class AtendeDuvidas {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			FilaString fila = new FilaString = new FilaInt();
			filaProcessos.init();
			int opcao;
			do {
				System.out.println(" 1 - Submete processo");
				System.out.println(" 2 - Executa processo (ocupa processador");
				System.out.println(" 3 - Shutdown");
				opcao = entrada.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("NOME: ");
					int pid = entrada.nextInt();
					filaProcessos.enqueue(pid);
					break;
				case 2:
					if(!filaProcessos.isEmpty())
						pid = filaProcessos.dequeue();
						System.out.println("Processo em execução agora: "+ pid);
						System.out.println("Processo " + pid + " foi concluido? (1- sim): ");
						int resp = entrada.nextInt();
						filaProcessos.enqueue(pid);
						break;
				case 3: 
					if(filaProcessos.isEmpty())
						System.out.println("Ainda ha alunos na fila");
						System.out.println("Deseja encerrar todos os processos? (1- sim: ");
						int resp = entrada.nextInt();
						if (resp == 1) {
							while (!filaProcessos.isEmpty()) {
								System.out.println("Encerrando o processo "+ filaProcessos.dequeue());
							}
					}
						else 
							opcao = 0;
					}
					break;
				default:
					System.out.println("Opcao inválida");
				
			} while (opcao != 3);
			System.out.println("Shutdown ...");
			entrada.close();

		}

	}

}

kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkpackage exercicio5;

public class Consultorio {
	package exercicio3;

	import java.util.Scanner;

	import filas.FilaInt;

	public class AtendeDuvidas {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			FilaString fila = new FilaString = new FilaInt();
			filaProcessos.init();
			int opcao;
			do {
				System.out.println(" 1 - Submete processo");
				System.out.println(" 2 - Executa processo (ocupa processador");
				System.out.println(" 3 - Shutdown");
				opcao = entrada.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("NOME: ");
					int pid = entrada.nextInt();
					filaProcessos.enqueue(pid);
					break;
				case 2:
					if(!filaProcessos.isEmpty())
						pid = filaProcessos.dequeue();
						System.out.println("Processo em execução agora: "+ pid);
						System.out.println("Processo " + pid + " foi concluido? (1- sim): ");
						int resp = entrada.nextInt();
						filaProcessos.enqueue(pid);
						break;
				case 3: 
					if(filaProcessos.isEmpty())
						System.out.println("Ainda ha alunos na fila");
						System.out.println("Deseja encerrar todos os processos? (1- sim: ");
						int resp = entrada.nextInt();
						if (resp == 1) {
							while (!filaProcessos.isEmpty()) {
								System.out.println("Encerrando o processo "+ filaProcessos.dequeue());
							}
					}
						else 
							opcao = 0;
					}
					break;
				default:
					System.out.println("Opcao inválida");
				
			} while (opcao != 3);
			System.out.println("Shutdown ...");
			entrada.close();

		}

	}

}

kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkpackage exercicio5;

public class Consultorio {
	package exercicio3;

	import java.util.Scanner;

	import filas.FilaInt;

	public class AtendeDuvidas {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			FilaString fila = new FilaString = new FilaInt();
			filaProcessos.init();
			int opcao;
			do {
				System.out.println(" 1 - Submete processo");
				System.out.println(" 2 - Executa processo (ocupa processador");
				System.out.println(" 3 - Shutdown");
				opcao = entrada.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("NOME: ");
					int pid = entrada.nextInt();
					filaProcessos.enqueue(pid);
					break;
				case 2:
					if(!filaProcessos.isEmpty())
						pid = filaProcessos.dequeue();
						System.out.println("Processo em execução agora: "+ pid);
						System.out.println("Processo " + pid + " foi concluido? (1- sim): ");
						int resp = entrada.nextInt();
						filaProcessos.enqueue(pid);
						break;
				case 3: 
					if(filaProcessos.isEmpty())
						System.out.println("Ainda ha alunos na fila");
						System.out.println("Deseja encerrar todos os processos? (1- sim: ");
						int resp = entrada.nextInt();
						if (resp == 1) {
							while (!filaProcessos.isEmpty()) {
								System.out.println("Encerrando o processo "+ filaProcessos.dequeue());
							}
					}
						else 
							opcao = 0;
					}
					break;
				default:
					System.out.println("Opcao inválida");
				
			} while (opcao != 3);
			System.out.println("Shutdown ...");
			entrada.close();

		}

	}

}

kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkpackage exercicio5;

public class Consultorio {
	package exercicio3;

	import java.util.Scanner;

	import filas.FilaInt;

	public class AtendeDuvidas {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			FilaString fila = new FilaString = new FilaInt();
			filaProcessos.init();
			int opcao;
			do {
				System.out.println(" 1 - Submete processo");
				System.out.println(" 2 - Executa processo (ocupa processador");
				System.out.println(" 3 - Shutdown");
				opcao = entrada.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("NOME: ");
					int pid = entrada.nextInt();
					filaProcessos.enqueue(pid);
					break;
				case 2:
					if(!filaProcessos.isEmpty())
						pid = filaProcessos.dequeue();
						System.out.println("Processo em execução agora: "+ pid);
						System.out.println("Processo " + pid + " foi concluido? (1- sim): ");
						int resp = entrada.nextInt();
						filaProcessos.enqueue(pid);
						break;
				case 3: 
					if(filaProcessos.isEmpty())
						System.out.println("Ainda ha alunos na fila");
						System.out.println("Deseja encerrar todos os processos? (1- sim: ");
						int resp = entrada.nextInt();
						if (resp == 1) {
							while (!filaProcessos.isEmpty()) {
								System.out.println("Encerrando o processo "+ filaProcessos.dequeue());
							}
					}
						else 
							opcao = 0;
					}
					break;
				default:
					System.out.println("Opcao inválida");
				
			} while (opcao != 3);
			System.out.println("Shutdown ...");
			entrada.close();

		}

	}

}

kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkpackage exercicio5;

public class Consultorio {
	package exercicio3;

	import java.util.Scanner;

	import filas.FilaInt;

	public class AtendeDuvidas {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			FilaString fila = new FilaString = new FilaInt();
			filaProcessos.init();
			int opcao;
			do {
				System.out.println(" 1 - Submete processo");
				System.out.println(" 2 - Executa processo (ocupa processador");
				System.out.println(" 3 - Shutdown");
				opcao = entrada.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("NOME: ");
					int pid = entrada.nextInt();
					filaProcessos.enqueue(pid);
					break;
				case 2:
					if(!filaProcessos.isEmpty())
						pid = filaProcessos.dequeue();
						System.out.println("Processo em execução agora: "+ pid);
						System.out.println("Processo " + pid + " foi concluido? (1- sim): ");
						int resp = entrada.nextInt();
						filaProcessos.enqueue(pid);
						break;
				case 3: 
					if(filaProcessos.isEmpty())
						System.out.println("Ainda ha alunos na fila");
						System.out.println("Deseja encerrar todos os processos? (1- sim: ");
						int resp = entrada.nextInt();
						if (resp == 1) {
							while (!filaProcessos.isEmpty()) {
								System.out.println("Encerrando o processo "+ filaProcessos.dequeue());
							}
					}
						else 
							opcao = 0;
					}
					break;
				default:
					System.out.println("Opcao inválida");
				
			} while (opcao != 3);
			System.out.println("Shutdown ...");
			entrada.close();

		}

	}

}

kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkpackage exercicio5;

public class Consultorio {
	package exercicio3;

	import java.util.Scanner;

	import filas.FilaInt;

	public class AtendeDuvidas {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			FilaString fila = new FilaString = new FilaInt();
			filaProcessos.init();
			int opcao;
			do {
				System.out.println(" 1 - Submete processo");
				System.out.println(" 2 - Executa processo (ocupa processador");
				System.out.println(" 3 - Shutdown");
				opcao = entrada.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("NOME: ");
					int pid = entrada.nextInt();
					filaProcessos.enqueue(pid);
					break;
				case 2:
					if(!filaProcessos.isEmpty())
						pid = filaProcessos.dequeue();
						System.out.println("Processo em execução agora: "+ pid);
						System.out.println("Processo " + pid + " foi concluido? (1- sim): ");
						int resp = entrada.nextInt();
						filaProcessos.enqueue(pid);
						break;
				case 3: 
					if(filaProcessos.isEmpty())
						System.out.println("Ainda ha alunos na fila");
						System.out.println("Deseja encerrar todos os processos? (1- sim: ");
						int resp = entrada.nextInt();
						if (resp == 1) {
							while (!filaProcessos.isEmpty()) {
								System.out.println("Encerrando o processo "+ filaProcessos.dequeue());
							}
					}
						else 
							opcao = 0;
					}
					break;
				default:
					System.out.println("Opcao inválida");
				
			} while (opcao != 3);
			System.out.println("Shutdown ...");
			entrada.close();

		}

	}

}

kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkll