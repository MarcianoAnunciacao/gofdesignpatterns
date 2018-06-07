package designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class CanaisEsporte implements AgregadorDeCanais {

	protected List<Canal> canais;
	
	public CanaisEsporte() {
		canais = new ArrayList<>();
		canais.add(new Canal("UFC"));
		canais.add(new Canal("NBA"));
		canais.add(new Canal("Futebol"));
		canais.add(new Canal("Natação"));
		canais.add(new Canal("Handebol"));
	}
	
	@Override
	public IteratorInterface criarIterator() {
		return new IteratorListaDeCanais(canais);
	}

}
