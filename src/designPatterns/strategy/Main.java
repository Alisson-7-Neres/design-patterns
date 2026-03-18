package designPatterns.strategy;

public class Main {
	public static void main(String[] args) {
	
		Funcionario pedro = new Funcionario("Pedro", "Alves", 2500, new BonusJunior());
		System.out.println(pedro);
		
		Funcionario henrique = new Funcionario("Henrique", "Pereira", 5000, new BonusPleno());
		System.out.println(henrique);
		
		Funcionario renato = new Funcionario("Renato", "Mizaki", 8900, new BonusSenior());
		System.out.println(renato);
		
	}

}
