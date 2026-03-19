package designPatterns.decorator;

public class Pizza implements PizzaSabores {

	@Override
	public String getSabor() {
		return "Pizza de Calabresa ";
	}

	@Override
	public double getPreco() {
		return 40.0;
	}

}
