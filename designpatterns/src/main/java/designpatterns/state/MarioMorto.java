package designpatterns.state;

public class MarioMorto implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		System.out.println();
		return null;
	}

	@Override
	public MarioState pegarFlor() {
		return null;
	}

	@Override
	public MarioState pegarPena() {
		return null;
	}

	@Override
	public MarioState levarDano() {
		return null;
	}

}
