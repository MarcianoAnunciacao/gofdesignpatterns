package designpatterns.iterator;

public class Cliente {

	public static void main(String[] args) {
		AgregadorDeCanais canaisEsportes = new CanaisEsporte();
		System.out.println("Canais Esporte: ");
		
		for(IteratorInterface it = canaisEsportes.criarIterator(); !it.isDone(); it.next()) {
			System.out.println(it.currentItem().nome);
		}

		AgregadorDeCanais canaisFilmes = new CanalFilmes();
		System.out.println("Canais de Filmes: ");
		
		for(IteratorInterface it = canaisFilmes.criarIterator(); !it.isDone(); it.next()) {
			System.out.println(it.currentItem().nome);
		}
		
	}

}
