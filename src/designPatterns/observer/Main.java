package designPatterns.observer;

public class Main {

	public static void main(String[] args) {
		
		Publicadora canal = new Publicadora();

		Assinante alisson = new Usuario("Alisson Neres");
		Assinante joao = new Usuario("João Neves");
		Assinante larissa = new Usuario("Larissa Gomez");
		
		canal.inscrever(alisson);
		canal.inscrever(joao);
		canal.inscrever(larissa);
		
		canal.notificar("Novo código enviado!");
		
		canal.desinscrever(joao);
		
		System.out.println("\nApós João cancelar inscrição:\n");
		
		canal.notificar("Refatoração do cósigo!");
		
	}

}
