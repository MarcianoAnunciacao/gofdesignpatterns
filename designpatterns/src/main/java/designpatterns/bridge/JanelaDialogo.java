package designpatterns.bridge;

public class JanelaDialogo extends JanelaAbstrata {

	public JanelaDialogo(JanelaImplementada janela) {
		super(janela);
	}

	@Override
	public void desenhar() {
		desenharJanela("Janela de Diálogo");
		desenharBotao("Cancelar");
		desenharBotao("Botão Sim");
		desenharBotao("Botão Não");
	}

}