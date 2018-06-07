package designpatterns.state;

public class MarioGrande implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario ganha 1000 pontos");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario ganhou poder de bola de fogo");
		return new MarioFogo();
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario ganhou poder de voar");
		return new MarioCapa();
	}

	@Override
	public MarioState levarDano() {
		System.out.println("Mario ficou pequeno");
		return new MarioPequeno();
	}

}
