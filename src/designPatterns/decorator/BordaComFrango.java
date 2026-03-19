package designPatterns.decorator;

public class BordaComFrango extends AdicionalDecorator implements PizzaSabores{

	public BordaComFrango(PizzaSabores pizzaSsabores) {
		super(pizzaSsabores);
	}

	@Override
	public String getSabor() {
		return pizzaSabores.getSabor() + "com borda de Frango";
	}

	@Override
	public double getPreco() {
		return pizzaSabores.getPreco() + 7.0;
	}

	

}
