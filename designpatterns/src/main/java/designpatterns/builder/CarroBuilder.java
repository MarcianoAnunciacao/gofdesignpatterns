package designpatterns.builder;

public abstract class CarroBuilder {

	protected CarroProduct carro = new CarroProduct();
	public abstract void bulderPreco();
	public abstract void bulderDescMotor();
	public abstract void buildAnoFabricacao();
	public abstract void buildModelo();
	public abstract void buildMontadora();
	
	public CarroProduct getCarro() {
		return carro;
	}
	
}