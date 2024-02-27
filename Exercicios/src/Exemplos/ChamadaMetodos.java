package Exemplos;

public class ChamadaMetodos {

	public static void main(String[] args) {
		System.out.println("Iniciando rotina...");
		primeiro();
		
		System.out.println("Continuando rotina...");
		terceiro();	
		
		System.out.println("Finalizando rotina...");
					
		}
		
		// Construção do Métodos
		
		public static void primeiro() {
			System.out.println("Iniciando Método 1");
			segundo();
			System.out.println("Terminando Método 1");
		}
		
		public static void segundo() {
			System.out.println("Iniciando Método 2");
			System.out.println("Terminando Método 2");
		}
		
		public static void terceiro() {
			System.out.println("Iniciando Método 3");
			System.out.println("Terminando Método 3");
	}

}
