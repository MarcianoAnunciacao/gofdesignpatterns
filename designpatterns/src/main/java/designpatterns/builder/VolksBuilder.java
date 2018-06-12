package designpatterns.builder;

public class VolksBuilder extends CarroBuilder{

	@Override
	public void bulderPreco() {
		carro.preco = 1000;
	}

	@Override
	public void bulderDescMotor() {
		carro.descMotor = "1.0 Fire";
		
	}

	@Override
	public void buildAnoFabricacao() {
		carro.anoFabricacao = 2010;
		
	}

	@Override
	public void buildModelo() {
		carro.modelo = "Gol";
		
	}

	@Override
	public void buildMontadora() {
		carro.montadora = "VolksWagen";
		
	}

}
