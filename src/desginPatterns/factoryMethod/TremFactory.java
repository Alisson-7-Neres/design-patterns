package desginPatterns.factoryMethod;

public class TremFactory extends LogisticaFactory {

	@Override
	public Logistica criarTransporte() {
		return new Trem();
	}

}
