package desginPatterns.factoryMethod;

public class CaminhaoFactory extends LogisticaFactory {

	@Override
	public Logistica criarTransporte() {
		return new Caminhao();
	}

	
}
