package designpatterns.iterator;

public class CanalFilmes implements AgregadorDeCanais {

	protected Canal[] canais;
	
	public CanalFilmes() {
		canais = new Canal[6];
		
		canais[0] = new Canal("Cinemax");
		canais[1] = new Canal("Telecine");
		canais[2] = new Canal("Max");
		canais[3] = new Canal("Hbo");
		canais[4] = new Canal("Sony");
		canais[5] = new Canal("TNT");
		
	}
	
	@Override
	public IteratorInterface criarIterator() {
		return new IteratorMatrizDeCanais(canais);
	}

}
