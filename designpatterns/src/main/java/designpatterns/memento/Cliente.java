package designpatterns.memento;

public class Cliente {

	public static void main(String[] args) {
		TextoMemento texto = new TextoMemento("");
		
		texto.escreveTexto("Primeira Linha de Texto\n");
		texto.escreveTexto("Segunda Linha de Texto\n");
		texto.escreveTexto("Terceira Linha de Texto\n");
		texto.escreveTexto("Quarta Linha de Texto\n");
		
		texto.mostrarTexto();
		
		texto.desfazerEscrita();
		
		texto.mostrarTexto();
		
		texto.desfazerEscrita();
		
		texto.mostrarTexto();

		texto.desfazerEscrita();
		
		texto.mostrarTexto();

		
	}

}
