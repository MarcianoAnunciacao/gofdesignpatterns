package designpatterns.builder;

public class ConcessionariaDirector {

	protected CarroBuilder montadora;
	
	public ConcessionariaDirector(CarroBuilder montadora) {
		this.montadora = montadora;
	}
	
	public void contruirCarro() {
		montadora.bulderPreco();
		montadora.buildAnoFabricacao();
		montadora.bulderDescMotor();
		montadora.buildModelo();
		montadora.buildMontadora();
	}
	
	public CarroProduct getCarro() {
		return montadora.getCarro();
	}
	
	
	
}