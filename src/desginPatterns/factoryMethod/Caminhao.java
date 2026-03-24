package desginPatterns.factoryMethod;

public class Caminhao implements Logistica {

	@Override
	public void transporte() {
		System.out.println("Transporte por caminhão");
	}
}
