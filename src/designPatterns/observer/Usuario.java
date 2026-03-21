package designPatterns.observer;

public class Usuario implements Assinante {
	
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
    public Usuario(String nome) {
        this.nome = nome;
    }
	
	@Override
	public String toString() {
		return getNome(); 
	}

	@Override
	public void atualizar(String mensagem) {
		System.out.println(nome + " recebeu: " + mensagem);
	}

}
