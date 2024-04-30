package exercicio4;

public class FilaPaciente {

	private class NO{
		int dado;
		NO prox;
		
	}
	 NO ini, fim;
	 
	 public void init () {
		 ini = fim = null;
	 }
	 
	 public boolean isEmpty() {
		 return (ini== null && fim == null);
	 }
	 
	 public void enqueue(int Paciente) {
		 NO novo = new NO();
		 novo.dado = Paciente;
		 novo.prox = null;
		 if(isEmpty())
			 ini = novo;
		 else 
			 fim.prox = novo;
		 
		 fim = novo;
	 }
	 
	 public Paciente first() {
		 return ini.dado;
	 }
	 
	 public int dequeue () {
		 int PacienteS = ini.dado;
		 ini = ini.prox;
		 if (ini == null)
			 fim = null;
		 	return Paciente;
	 }
	 
	 
	 
	 
}
