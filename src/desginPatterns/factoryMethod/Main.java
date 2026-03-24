package desginPatterns.factoryMethod;

public class Main {
	
	public static void main(String[] args) {
		
		LogisticaFactory caminhaoFctory = new CaminhaoFactory();
		LogisticaFactory tremFactory = new TremFactory();
		LogisticaFactory navioFactory = new NavioFactory();
		
		Logistica caminhao = caminhaoFctory.criarTransporte();
		
		caminhao.transporte();
		
		
	}

}
