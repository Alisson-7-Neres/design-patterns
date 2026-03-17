package desginPatterns.singleton;

public class LazyHolderSingleton {
	
	private LazyHolderSingleton() {
		super();
	}
	
	private static class SingletonHolder {
		private static LazyHolderSingleton instancia = new LazyHolderSingleton();
	}
	
	public static LazyHolderSingleton getInstancia() {
		return SingletonHolder.instancia;
	}

}
