package designpatterns.state;

public class MarioFogo implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario ganhou 1000 pontos");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario ganhou 1000 pontos");
		return this;
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario ganhou o poder de voar");
		return new MarioCapa();
	}

	@Override
	public MarioState levarDano() {
		System.out.println("Mario Grande");
		return new MarioGrande();
	}

}
