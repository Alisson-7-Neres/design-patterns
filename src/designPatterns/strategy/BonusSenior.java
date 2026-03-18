package designPatterns.strategy;

public class BonusSenior implements CalculoBonus {

	@Override
	public double calcular(double salario) {
		return salario * 0.20;
	}

}
