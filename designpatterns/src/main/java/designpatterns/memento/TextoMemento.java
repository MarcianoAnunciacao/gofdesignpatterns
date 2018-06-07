package designpatterns.memento;

public class TextoMemento {
	
	protected String texto;
	TextCareTaker careTaker;
	
	public TextoMemento(String txt) {
		careTaker = new TextCareTaker();
		texto = txt;
	}
	
	public void escreveTexto(String novoTexto) {
		careTaker.adicionarMemento(new TextoMemento(novoTexto));
		texto += novoTexto;
	}
	
	public void desfazerEscrita() {
		texto = careTaker.getUltimoEstadoSalvo().texto;
	}

	public void mostrarTexto() {
		System.out.println(texto);
	}
	
}
