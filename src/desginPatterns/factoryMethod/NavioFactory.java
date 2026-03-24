package desginPatterns.factoryMethod;

public class NavioFactory extends LogisticaFactory {

	@Override
	public Logistica criarTransporte() {
		return new Navio();
	}

}
