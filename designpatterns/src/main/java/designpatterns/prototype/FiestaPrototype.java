package designpatterns.prototype;

public class FiestaPrototype extends CarroPrototype {

	public FiestaPrototype(FiestaPrototype fiesta) {
		this.valorCompra = fiesta.getValorCompra();
	}
	
	public FiestaPrototype() {
		valorCompra = 0.0;
	}
	
	@Override
	public String exibirInfo() {
		return "Modelo Fiesta\n Montadora Ford\n Valor: " + getValorCompra();
	}

	@Override
	public CarroPrototype clonar() {
		return new FiestaPrototype(this);
	}

}
