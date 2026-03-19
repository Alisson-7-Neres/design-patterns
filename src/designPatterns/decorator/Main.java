package designPatterns.decorator;

public class Main {

	public static void main(String[] args) {
		
		Pizza calabresa = new Pizza();
		PizzaSabores bordaCatupiry = new BordaComCatupiry(calabresa);
		System.out.println(bordaCatupiry.getSabor() + 
				"\nTotal: R$" + bordaCatupiry.getPreco()
				);
		System.err.println("---------------------------------");
		PizzaSabores bordaFrango = new BordaComFrango(calabresa);
		System.out.println(bordaFrango.getSabor() + 
				"\nTotal: R$" + bordaFrango.getPreco()
				);

	}

}
