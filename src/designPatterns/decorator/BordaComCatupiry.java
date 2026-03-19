package designPatterns.decorator;

public class BordaComCatupiry extends AdicionalDecorator{

	public BordaComCatupiry(PizzaSabores pizzaSabores) {
		super(pizzaSabores);
	}

	@Override
	public String getSabor() {
		return pizzaSabores.getSabor() + "com borda de Catupiry";
	}

	@Override
	public double getPreco() {
		return pizzaSabores.getPreco() + 5;
	}

}
