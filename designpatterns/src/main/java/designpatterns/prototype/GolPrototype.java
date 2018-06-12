package designpatterns.prototype;

public class GolPrototype extends CarroPrototype {

	public GolPrototype(GolPrototype gol) {
		this.valorCompra = gol.getValorCompra();
	}

	public GolPrototype() {
		valorCompra = 0.0;
	}

	@Override
	public String exibirInfo() {
		return "Modelo Fiesta\n Montadora Ford\n Valor: " + getValorCompra();
	}

	@Override
	public CarroPrototype clonar() {
		return new GolPrototype(this);
	}

}
