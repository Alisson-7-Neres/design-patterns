package designPatterns.strategy;

// Comportamento

public class Funcionario {
	
	private String nome;
	private String sobrenome;
	private double salario;
	private CalculoBonus estrategiaBonus;
	
	public Funcionario(String nome, String sobrenome, double salario, CalculoBonus estrategiaBonus) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
		this.estrategiaBonus = estrategiaBonus;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularBonus() {
		return estrategiaBonus.calcular(salario);
	}
	public void setEstrategiaBonus(CalculoBonus estrategiaBonus) {
		this.estrategiaBonus = estrategiaBonus;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\n" +
				"Sobrenome: " + sobrenome + "\n" + 
				"Salário: " + salario + "\n" +
				"Bônus: " + calcularBonus() + "\n";
	}

}
