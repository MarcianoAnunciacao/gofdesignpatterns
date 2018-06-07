package designpatterns.command;

import javax.swing.JTextArea;

public class ExcluirPedidoCommand implements BaseCommand {

	public void clicked(JTextArea taMensagens, String server) {
		taMensagens.setText("Conex�o com servidor " + server + "\n");
		// C�digo de exclus�o de pedido
		taMensagens.append("Excluindo pedido do sistema...");

	}

}
