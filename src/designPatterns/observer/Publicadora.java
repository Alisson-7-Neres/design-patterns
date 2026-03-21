package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Publicadora {
	
	private List<Assinante> assinantes = new ArrayList<>();
	
	public void inscrever(Assinante assinante) {
		assinantes.add(assinante);
	}
	public void desinscrever(Assinante assinante) {
		assinantes.removeIf(a -> a.equals(assinante));
	}
	
    public void notificar(String mensagem) {
        for (Assinante enviar : assinantes) {
            enviar.atualizar(mensagem);
        }
    }

}
