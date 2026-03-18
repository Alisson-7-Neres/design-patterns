package designPatterns.strategy;

public class BonusPleno implements CalculoBonus{

	@Override
	public double calcular(double salario) {
		return salario * 0.15;
	}

}
