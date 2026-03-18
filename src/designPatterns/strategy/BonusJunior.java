package designPatterns.strategy;

public class BonusJunior implements CalculoBonus{

	@Override
	public double calcular(double salario) {
		return salario * 0.10;
	}

}
