package designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class TextCareTaker {

	protected List<TextoMemento> estados;
	
	public TextCareTaker () {
		estados = new ArrayList<TextoMemento>();
	}
	
	public void adicionarMemento(TextoMemento memento) {
		estados.add(memento);
	}
	
	public TextoMemento getUltimoEstadoSalvo() {
		if(estados.size() <= 0) {
			return new TextoMemento("");
		}
		
		estados.remove(estados.size() -1 );
		
		String textoSaida = new String();
		for (TextoMemento textoMemento : estados) {
			textoSaida += textoMemento.texto;
		}
		
		
		return new TextoMemento(textoSaida);
	}
	
}
