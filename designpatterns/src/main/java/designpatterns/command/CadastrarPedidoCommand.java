package designpatterns.command;

import javax.swing.JTextArea;

public class CadastrarPedidoCommand implements BaseCommand {

	public void clicked(JTextArea taMensagens, String server) {
		taMensagens.setText("Conex�o com servidor " + server + "\n");
		// C�digo de cria��o de um novo pedido
		taMensagens.append("Setup para novo pedido...");

	}

}
