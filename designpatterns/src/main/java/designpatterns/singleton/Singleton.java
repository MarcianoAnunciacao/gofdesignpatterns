package designpatterns.singleton;

public class Singleton {
	
	private static Singleton instancia = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		return instancia;
		
	}

}