package designPatterns.decorator;

public abstract class AdicionalDecorator implements PizzaSabores{
	
	// Agregação
	protected PizzaSabores pizzaSabores;
	
	public AdicionalDecorator(PizzaSabores pizzaSabores) {
		this.pizzaSabores = pizzaSabores;
	}

}
