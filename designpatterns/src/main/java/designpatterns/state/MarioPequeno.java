package designpatterns.state;

public class MarioPequeno implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario fica grande");
		return new MarioGrande();
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario fica grande e ganha poder de fogo");
		return new MarioFogo();
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario pode voar");
		return new MarioCapa();
	}

	@Override
	public MarioState levarDano() {
		System.out.println("Mario morre");
		return new MarioMorto();
	}

}
