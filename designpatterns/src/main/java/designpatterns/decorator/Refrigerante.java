package designpatterns.decorator;

public class Refrigerante extends CoquetelDecorator {

	public Refrigerante(Coquetel umCoquetel) {
		super(umCoquetel);
		nome = "Fanta";
		preco = 1.00;
	}
	
}